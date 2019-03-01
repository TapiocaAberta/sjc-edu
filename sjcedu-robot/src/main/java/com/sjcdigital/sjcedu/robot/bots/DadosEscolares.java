package com.sjcdigital.sjcedu.robot.bots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjcdigital.sjcedu.robot.entities.ComplexidadeGestaoEscolar;
import com.sjcdigital.sjcedu.robot.entities.Endereco;
import com.sjcdigital.sjcedu.robot.entities.Escola;
import com.sjcdigital.sjcedu.robot.utils.RegexUtil;

/**
 * @author pedro-hos
 * PT: Classe responsável por pegar os dados do site do IDEB  http://idebescola.inep.gov.br/ideb/         
 * EN: Class responsible to go towards the IDEB site http://idebescola.inep.gov.br/ideb/ and get the informations
 */
public class DadosEscolares {
	
	private final String IDEB_URL = "http://idebescola.inep.gov.br/ideb/";
	private Client client = ClientBuilder.newClient();
	
	public List<Escola> capturaDadosEscola() throws IOException {
		
		List<String> linksDasEscolas = capturaLinksDasEscolas();
		
		System.out.println(linksDasEscolas.size());
		
		List<Escola> escolas = new ArrayList<>();
		
		for (String link : linksDasEscolas) {
			if(link != null && !link.trim().isEmpty()) {
				
				Element body = pegaPaginaEscola(link);
				Escola escola = capturaDetalhesEscola(body);
				escola.setComplexGestaoEscolar(capturaComplexGestaoEscolar(escola.getCodigo()));
				
				escolas.add(escola);
			}
		}
		
		System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(escolas));
		
		return escolas;
	}
	
	
	public ComplexidadeGestaoEscolar capturaComplexGestaoEscolar(String codigo) throws JsonParseException, JsonMappingException, IOException {
		
		Response response = client.target(IDEB_URL + "escola/complexidadeDaGestaoEscolar/")
								  .path(codigo)
								  .request(MediaType.APPLICATION_JSON)
								  .get();
		
		return new ObjectMapper().readValue(response.readEntity(String.class), ComplexidadeGestaoEscolar.class);
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
	private Element pegaPaginaEscola(String link) throws IOException {
		Document doc = Jsoup.connect(IDEB_URL + link)
				            .timeout(10 * 1000)
							.get();
		return doc.body();
	}

	/**
	 * PT: Pegar os links das escolas de SJCampos no IDEB
	 * EN: Get school links from the SJCampos city on IDEB
	 * @return List<String> with the school links
	 * @throws IOException 
	 */
	private List<String> capturaLinksDasEscolas() throws IOException {
		
		List<String> links = new ArrayList<>();
		
		Document doc = Jsoup.connect(IDEB_URL + "consulta-publica")
				  			.data("pkCodEstado", "35")
				  			.data("pkCodMunicipio", "3549904")
				  			.timeout(3000)
				  			.post();
		
		Elements table = doc.select("table");
		Elements rows = table.select("tr");
		
		rows.forEach(element -> links.add(RegexUtil.removerAspas(element.attr("onclick"))));
		
		return links;
	}
	
}
