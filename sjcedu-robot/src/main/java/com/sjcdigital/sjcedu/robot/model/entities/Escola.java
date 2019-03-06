package com.sjcdigital.sjcedu.robot.model.entities;

/**
 * 
 * @author pedro-hos
 *
 */
public class Escola {

	private String nome;
	private String codigo;
	private String depAdministrativa;
	private Endereco endereco;
	private ComplexGestaoEscolar complexGestaoEscolar;
	private PraticaPedagogica praticaPedagogica;
	private InfraestruturaBasica infraestruturaBasica;
	private EspacoAprendizagemEquip EspacoAprendizagemEquip;
	private Organizacao organizacao;
	private Saeb saeb;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDepAdministrativa() {
		return depAdministrativa;
	}

	public void setDepAdministrativa(String depAdministrativa) {
		this.depAdministrativa = depAdministrativa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ComplexGestaoEscolar getComplexGestaoEscolar() {
		return complexGestaoEscolar;
	}

	public void setComplexGestaoEscolar(ComplexGestaoEscolar complexGestaoEscolar) {
		this.complexGestaoEscolar = complexGestaoEscolar;
	}

	public PraticaPedagogica getPraticaPedagogica() {
		return praticaPedagogica;
	}

	public void setPraticaPedagogica(PraticaPedagogica praticaPedagogica) {
		this.praticaPedagogica = praticaPedagogica;
	}

	public InfraestruturaBasica getInfraestruturaBasica() {
		return infraestruturaBasica;
	}

	public void setInfraestruturaBasica(InfraestruturaBasica infraestruturaBasica) {
		this.infraestruturaBasica = infraestruturaBasica;
	}

	public EspacoAprendizagemEquip getEspacoAprendizagemEquip() {
		return EspacoAprendizagemEquip;
	}

	public void setEspacoAprendizagemEquip(EspacoAprendizagemEquip espacoAprendizagemEquip) {
		EspacoAprendizagemEquip = espacoAprendizagemEquip;
	}

	public Organizacao getOrganizacao() {
		return organizacao;
	}

	public void setOrganizacao(Organizacao organizacao) {
		this.organizacao = organizacao;
	}

	public Saeb getSaeb() {
		return saeb;
	}

	public void setSaeb(Saeb saeb) {
		this.saeb = saeb;
	}

}
