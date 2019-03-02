package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.PraticaPedagogica;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

/**
 * 
 * @author pedro-hos
 *
 */
public class PraticaPedagogicaPojo implements Pojo {

	@JsonProperty("Alunos incluídos [strHint012]")
	private String alunosIncluidos;

	@JsonProperty("Sala de recursos multifuncionais [strHint013]")
	private String salaRecursosMultifuncionais;

	@JsonProperty("Banheiro adequado a alunos com deficiência")
	private String banheiroAdequadoPNE;

	@JsonProperty("Dependências e vias adequadas a alunos com deficiência")
	private String dependenciasEViasAdequadasPNE;

	@JsonProperty("Tradutor intérprete de Libras")
	private String tradutorInterpreteLibras;

	@JsonProperty("Docentes com formação continuada em Educação Especial [strHint014]")
	private String docenteFormacaoEduEspecial;

	@JsonProperty("Docentes com formação continuada em Educação Indígena [strHint015]")
	private String docenteFormacaoEduIndigena;

	@JsonProperty("Docentes com formação continuada em Relações Etnorraciais [strHint016]")
	private String docenteFormacaoEduRelacoesEtnorraciais;

	public String getAlunosIncluidos() {
		return alunosIncluidos;
	}

	public void setAlunosIncluidos(String alunosIncluidos) {
		this.alunosIncluidos = alunosIncluidos;
	}

	public String getSalaRecursosMultifuncionais() {
		return salaRecursosMultifuncionais;
	}

	public void setSalaRecursosMultifuncionais(String salaRecursosMultifuncionais) {
		this.salaRecursosMultifuncionais = salaRecursosMultifuncionais;
	}

	public String getBanheiroAdequadoPNE() {
		return banheiroAdequadoPNE;
	}

	public void setBanheiroAdequadoPNE(String banheiroAdequadoPNE) {
		this.banheiroAdequadoPNE = banheiroAdequadoPNE;
	}

	public String getDependenciasEViasAdequadasPNE() {
		return dependenciasEViasAdequadasPNE;
	}

	public void setDependenciasEViasAdequadasPNE(String dependenciasEViasAdequadasPNE) {
		this.dependenciasEViasAdequadasPNE = dependenciasEViasAdequadasPNE;
	}

	public String getTradutorInterpreteLibras() {
		return tradutorInterpreteLibras;
	}

	public void setTradutorInterpreteLibras(String tradutorInterpreteLibras) {
		this.tradutorInterpreteLibras = tradutorInterpreteLibras;
	}

	public String getDocenteFormacaoEduEspecial() {
		return docenteFormacaoEduEspecial;
	}

	public void setDocenteFormacaoEduEspecial(String docenteFormacaoEduEspecial) {
		this.docenteFormacaoEduEspecial = docenteFormacaoEduEspecial;
	}

	public String getDocenteFormacaoEduIndigena() {
		return docenteFormacaoEduIndigena;
	}

	public void setDocenteFormacaoEduIndigena(String docenteFormacaoEduIndigena) {
		this.docenteFormacaoEduIndigena = docenteFormacaoEduIndigena;
	}

	public String getDocenteFormacaoEduRelacoesEtnorraciais() {
		return docenteFormacaoEduRelacoesEtnorraciais;
	}

	public void setDocenteFormacaoEduRelacoesEtnorraciais(String docenteFormacaoEduRelacoesEtnorraciais) {
		this.docenteFormacaoEduRelacoesEtnorraciais = docenteFormacaoEduRelacoesEtnorraciais;
	}

	@Override
	public PraticaPedagogica paraEntidade() {
		return new PraticaPedagogica( alunosIncluidos, salaRecursosMultifuncionais, banheiroAdequadoPNE,
									  dependenciasEViasAdequadasPNE, tradutorInterpreteLibras, docenteFormacaoEduEspecial,
									  docenteFormacaoEduIndigena, docenteFormacaoEduRelacoesEtnorraciais );
	}

}
