package com.sjcdigital.sjcedu.robot.bots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjcdigital.sjcedu.robot.model.entities.Aprovacoes;
import com.sjcdigital.sjcedu.robot.model.entities.ComplexGestaoEscolar;
import com.sjcdigital.sjcedu.robot.model.entities.Endereco;
import com.sjcdigital.sjcedu.robot.model.entities.Escola;
import com.sjcdigital.sjcedu.robot.model.entities.EspacoAprendizagemEquip;
import com.sjcdigital.sjcedu.robot.model.entities.Ideb;
import com.sjcdigital.sjcedu.robot.model.entities.IdebValores;
import com.sjcdigital.sjcedu.robot.model.entities.Indice;
import com.sjcdigital.sjcedu.robot.model.entities.InfraestruturaBasica;
import com.sjcdigital.sjcedu.robot.model.entities.Organizacao;
import com.sjcdigital.sjcedu.robot.model.entities.ParticipacaoSaeb;
import com.sjcdigital.sjcedu.robot.model.entities.PraticaPedagogica;
import com.sjcdigital.sjcedu.robot.model.entities.ResultadoParticipacaoSaeb;
import com.sjcdigital.sjcedu.robot.model.entities.ResultadoSaeb;
import com.sjcdigital.sjcedu.robot.model.entities.ResultadosParticipacaoSaeb;
import com.sjcdigital.sjcedu.robot.model.entities.Saeb;
import com.sjcdigital.sjcedu.robot.model.entities.TaxaAprovacao;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.ComplexGestaoEscolarPojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.EspacoAprendizagemEquipPojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.IndicacaoAdequacaoFormacaoDocentePojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.IndicadorEsforcoDocentePojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.InfraestruturaBasicaPojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.MediaAlunoPorTurmaPojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.OrganizacaoPojo;
import com.sjcdigital.sjcedu.robot.model.pojos.impl.PraticaPedagogicaPojo;
import com.sjcdigital.sjcedu.robot.utils.RegexUtil;

/**
 * @author pedro-hos
 * PT: Classe responsável por pegar os dados do site do IDEB  http://idebescola.inep.gov.br/ideb/         
 * EN: Class responsible to go towards the IDEB site http://idebescola.inep.gov.br/ideb/ and get the informations
 */
public class IdebBot {
	
	private final String IDEB_URL = "http://idebescola.inep.gov.br/ideb/";
	private Client client = ClientBuilder.newClient();
	
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public List<Escola> capturaDadosEscola() throws IOException {
		
		List<String> linksDasEscolas = capturaLinksDasEscolas();
		
		return linksDasEscolas.stream()
		               .filter(link -> link != null && !link.trim().isEmpty())
		               .map(this::pegaPaginaEscola)
		               .map(this::capturaDetalhesEscola)
		               .peek(this::preencheDadosEscola)
                       .collect(Collectors.toList());
	}

    private void preencheDadosEscola(Escola escola)  {
        try {
            String codigo = escola.getCodigo();
	    escola.setComplexGestaoEscolar(capturaComplexGestaoEscolar(codigo));
	    escola.setPraticaPedagogica(capturaPraticaPedagogica(codigo));
	    escola.setInfraestruturaBasica(capturaInfraestruturaBasica(codigo));
	    escola.setEspacoAprendizagemEquip(capturaEspacoAprendizagemEquip(codigo));
	    escola.setOrganizacao(capturaDadosOrganizacao(codigo));
	    escola.setParticipacaoSaeb(capturaParticipacaoSaeb(codigo));
	    escola.setIdebValores(capturaDadosIdeb(codigo));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
	
	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private IdebValores capturaDadosIdeb(final String codigo) throws JsonParseException, JsonMappingException, IOException {
		Response response = retornaResponseDaConsulta(codigo, "escola/indiceDeDesenvolvimentoDaEducacaoBasica/");

		ObjectMapper objMapper = new ObjectMapper();
		JsonNode readTree = objMapper.readTree(response.readEntity(String.class));
		
		IdebValores ideb = new IdebValores();
		
		JsonNode anosIniciaisNode = readTree.get("Anos iniciais do ensino fundamental");
		JsonNode anosFinaisNode = readTree.get("Anos finais do ensino fundamental");
		JsonNode ensinoMedioNode = readTree.get("Ensino Médio");
		
		String taxaAprovacaoField = "Taxa de Aprovação";
		String saebField = "Saeb";
		String idebField = "Ideb";
		
		if(anosIniciaisNode != null) {
			Map<String, Indice> anosIniciaisMap = montaHashComIndices(anosIniciaisNode);
			preencheTaxaAprovacao(anosIniciaisMap, anosIniciaisNode.get(taxaAprovacaoField));
			preencheDadosSaeb(anosIniciaisMap, anosIniciaisNode.get(saebField));
			preencheDadosIdeb(anosIniciaisMap, anosIniciaisNode.get(idebField));
			
			ideb.setAnosIniciaisIdeb(anosIniciaisMap.values());
		}
		
		if(anosFinaisNode != null) {
			Map<String, Indice> anosFinaisMap = montaHashComIndices(anosFinaisNode);
			preencheTaxaAprovacao(anosFinaisMap, anosFinaisNode.get(taxaAprovacaoField));
			preencheDadosSaeb(anosFinaisMap, anosFinaisNode.get(saebField));
			preencheDadosIdeb(anosFinaisMap, anosFinaisNode.get(idebField));
			
			ideb.setAnosFinaisIdeb(anosFinaisMap.values());
		}
		
		if(ensinoMedioNode != null) {
			Map<String, Indice> ensinoMedioMap = montaHashComIndices(ensinoMedioNode);
			preencheTaxaAprovacao(ensinoMedioMap, ensinoMedioNode.get(taxaAprovacaoField));
			preencheDadosSaeb(ensinoMedioMap, ensinoMedioNode.get(saebField));
			preencheDadosIdeb(ensinoMedioMap, ensinoMedioNode.get(idebField));
			
			ideb.setEnsinoMedioIdeb(ensinoMedioMap.values());
		}
		
		return ideb;
	}
	
	private void preencheDadosIdeb(Map<String, Indice> indices, JsonNode node) {
		
		if (!indices.isEmpty()) {

			for (Map.Entry<String, Indice> entry : indices.entrySet()) {

				JsonNode taxasAno = node.get(entry.getKey());
				
				Ideb ideb = new Ideb();
				ideb.setMeta(taxasAno.get(0).asText());
				ideb.setValor(taxasAno.get(1).asText());
				
				entry.getValue().setIdeb(ideb);
			}
		}

	}

	/**
	 * 
	 * @param indices
	 * @param node
	 */
	private void preencheDadosSaeb(Map<String, Indice> indices, final JsonNode node) {
		
		if (!indices.isEmpty()) {

			for (Map.Entry<String, Indice> entry : indices.entrySet()) {

				JsonNode taxasAno = node.get(entry.getKey());
				
				Saeb saeb = new Saeb();
				saeb.setMatematica(new ResultadoSaeb(taxasAno.get(0).asText(), taxasAno.get(1).asText()));
				saeb.setPortugues(new ResultadoSaeb(taxasAno.get(2).asText(), taxasAno.get(3).asText()));
				saeb.setMedia(taxasAno.get(4).asText());
				
				entry.getValue().setSaeb(saeb);
			}
		}

	}

	/**
	 * 
	 * @param indices
	 * @param node
	 */
	private void preencheTaxaAprovacao(Map<String, Indice> indices, final JsonNode node) {
		
		if(!indices.isEmpty()) {
			
			JsonNode anoNode = node.get("Ano");
			
			for (Map.Entry<String, Indice> entry : indices.entrySet()) {
				
				JsonNode taxasAno = node.get(entry.getKey());
				
				Aprovacoes aprovacoes = new Aprovacoes();
				aprovacoes.setTaxaAprovacao(Arrays.asList( new TaxaAprovacao(anoNode.get(0).asText(), taxasAno.get(0).asText()), 
														   new TaxaAprovacao(anoNode.get(1).asText(), taxasAno.get(1).asText()),
														   new TaxaAprovacao(anoNode.get(2).asText(), taxasAno.get(2).asText()),
														   new TaxaAprovacao(anoNode.get(3).asText(), taxasAno.get(3).asText())));
				
				aprovacoes.setIndicadorRendimento(taxasAno.get(4).asText());
				
				entry.getValue().setAprovacoes(aprovacoes);
				
			}
			
		}
		
	}
	
	/**
	 * 
	 * @param jsonNode
	 * @return
	 */
	private Map<String, Indice> montaHashComIndices(JsonNode jsonNode) {
		
		Map<String, Indice> mapIndices = new HashMap<>();
		
		if(jsonNode != null) {
			
			Iterator<String> fieldNames = jsonNode.get("Taxa de Aprovação").fieldNames();
			
			while(fieldNames.hasNext()) {
				
				String fieldName = fieldNames.next();
				
				if(!"ano".equalsIgnoreCase(fieldName)) {
					mapIndices.put(fieldName, new Indice(fieldName));
				}
			}
		}
		
		return mapIndices;
		
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private ParticipacaoSaeb capturaParticipacaoSaeb(final String codigo) throws JsonParseException, JsonMappingException, IOException {
		
		Response response = retornaResponseDaConsulta(codigo, "escola/provaBrasil/");
		
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode readTree = objMapper.readTree(response.readEntity(String.class));
		ParticipacaoSaeb saeb = new ParticipacaoSaeb();
		
		saeb.setAnosIniciaisSaeb(caputuraDadosSaebNode(readTree.get("Anos iniciais do ensino fundamental")));
		saeb.setAnosFinaisSaeb(caputuraDadosSaebNode(readTree.get("Anos finais do ensino fundamental")));
		saeb.setEnisnoMedioSaeb(caputuraDadosSaebNode(readTree.get("Ensino Médio")));
		
		return saeb;
	}
	
	/**
	 * 
	 * @param node
	 * @return
	 */
	private ResultadosParticipacaoSaeb caputuraDadosSaebNode(final JsonNode node) {
		
		ResultadosParticipacaoSaeb resultadosSaeb = new ResultadosParticipacaoSaeb();
		
		resultadosSaeb.setTotal(capturaResultadoSaeb(node.get(2)));
		resultadosSaeb.setPercTempoIntegral(capturaResultadoSaeb(node.get(3)));
		resultadosSaeb.setIdadeMedia(capturaResultadoSaeb(node.get(4)));
		resultadosSaeb.setPercIncluidos(capturaResultadoSaeb(node.get(5)));
		resultadosSaeb.setPercNaoAprovados(capturaResultadoSaeb(node.get(6)));
		
		return resultadosSaeb;
	}
	
	/**
	 * 
	 * @param jsonNode
	 * @return
	 */
	private ResultadoParticipacaoSaeb capturaResultadoSaeb(JsonNode jsonNode) {
		
		ResultadoParticipacaoSaeb resultado = new ResultadoParticipacaoSaeb();
		resultado.setMatriculados(jsonNode.get(1).asText());
		resultado.setParticipantes(jsonNode.get(2).asText());
		
		return resultado;
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private Organizacao capturaDadosOrganizacao(String codigo) throws JsonParseException, JsonMappingException, IOException {
		
		Response response = retornaResponseDaConsulta(codigo, "escola/organizacao/");
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode readTree = objMapper.readTree(response.readEntity(String.class));
		
		JsonNode firstJsonNode = readTree.get(0);
		OrganizacaoPojo organizacaoPojo = objMapper.treeToValue(firstJsonNode, OrganizacaoPojo.class);
		
		JsonNode indicadorDeEsforco = firstJsonNode.get("Indicador do esforço docente");
		organizacaoPojo.setEsforcoDocente(objMapper.treeToValue(indicadorDeEsforco, IndicadorEsforcoDocentePojo.class));
		
		JsonNode mediaAluno = firstJsonNode.get("Média de alunos por turma");
		organizacaoPojo.setMediaAlunoPorTurma(objMapper.treeToValue(mediaAluno, MediaAlunoPorTurmaPojo.class));
		
		JsonNode secondJsonNode = readTree.get(1).get("Indicador de adequação da formação do docente [strHint020]");
		organizacaoPojo.setIndicadorFormacaoDocente(objMapper.treeToValue(secondJsonNode, IndicacaoAdequacaoFormacaoDocentePojo.class));
		
		return organizacaoPojo.paraEntidade();
		
	}
	
	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private EspacoAprendizagemEquip capturaEspacoAprendizagemEquip(String codigo) throws JsonParseException, JsonMappingException, IOException {
		Response response = retornaResponseDaConsulta(codigo, "escola/espacoDeAprendizagemEquipamentos/");
		EspacoAprendizagemEquipPojo pojo = new ObjectMapper().readValue(response.readEntity(String.class), EspacoAprendizagemEquipPojo.class);
		return pojo.paraEntidade();
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private InfraestruturaBasica capturaInfraestruturaBasica(String codigo) throws JsonParseException, JsonMappingException, IOException {
		Response response = retornaResponseDaConsulta(codigo, "escola/infraestruturaBasica/");
		InfraestruturaBasicaPojo pojo = new ObjectMapper().readValue(response.readEntity(String.class), InfraestruturaBasicaPojo.class);
		return pojo.paraEntidade();
	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private PraticaPedagogica capturaPraticaPedagogica(String codigo) throws JsonParseException, JsonMappingException, IOException {
		Response response = retornaResponseDaConsulta(codigo, "escola/praticaPedagogicaInclusiva/");
		PraticaPedagogicaPojo pojo = new ObjectMapper().readValue(response.readEntity(String.class), PraticaPedagogicaPojo.class);
		return pojo.paraEntidade();

	}

	/**
	 * 
	 * @param codigo
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	private ComplexGestaoEscolar capturaComplexGestaoEscolar(String codigo) throws JsonParseException, JsonMappingException, IOException{
		Response response = retornaResponseDaConsulta(codigo, "escola/complexidadeDaGestaoEscolar/");
		ComplexGestaoEscolarPojo pojo = new ObjectMapper().readValue(response.readEntity(String.class), ComplexGestaoEscolarPojo.class);
		return pojo.paraEntidade();
	}


	/**
	 * 
	 * @param codigo
	 * @param url
	 * @return
	 */
	private Response retornaResponseDaConsulta(String codigo, String url) {
		Response response = client.target(IDEB_URL + url)
								  .path(codigo)
								  .request(MediaType.APPLICATION_JSON)
								  .get();
		return response;
	}


	/**
	 * @param body
	 * @return
	 */
	private Escola capturaDetalhesEscola(Element body) {
		Escola escola = new Escola();
		escola.setNome(body.select("legend.legend-dados-escola").text());
		
		Elements td = body.select("table.tabela.table-dados-escola")
						  .select("tr")
						  .select("td");
		
		escola.setCodigo(td.get(1).text());
		
		Endereco endereco = new Endereco();
		endereco.setEndereco(td.get(3).text());
		endereco.setBairro(td.get(5).text());
		endereco.setCep(td.get(7).text());
		endereco.setMunicipio(td.get(9).text());
		endereco.setUf(td.get(11).text());
		endereco.setLocalizacao(td.get(15).text());
		endereco.setLocDiferenciada(td.get(17).text());
		escola.setEndereco(endereco);
		
		escola.setDepAdministrativa(td.get(13).text());
		
		return escola;
	}


	/**
	 * 
	 * @param link
	 * @return
	 * @throws IOException
	 */
	private Element pegaPaginaEscola(String link) {
		try {
            Document doc = Jsoup.connect(IDEB_URL + link)
            		            .timeout(10 * 1000)
            					.get();
            return doc.body();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
	}

	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	private List<String> capturaLinksDasEscolas() throws IOException {
		
		
		Document doc = Jsoup.connect(IDEB_URL + "consulta-publica")
				  			.data("pkCodEstado", "35")
				  			.data("pkCodMunicipio", "3549904")
				  			.timeout(3000)
				  			.post();
		
		return doc.select("table")
		          .select("tr")
		          .stream()
        		  .map(el -> el.attr("onclick"))
        		  .map(RegexUtil::removerAspas)
        		  .collect(Collectors.toList());
	}
	
}
