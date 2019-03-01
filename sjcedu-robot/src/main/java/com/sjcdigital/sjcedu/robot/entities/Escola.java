package com.sjcdigital.sjcedu.robot.entities;

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
	private ComplexidadeGestaoEscolar complexGestaoEscolar;

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

	public ComplexidadeGestaoEscolar getComplexGestaoEscolar() {
		return complexGestaoEscolar;
	}

	public void setComplexGestaoEscolar(ComplexidadeGestaoEscolar complexGestaoEscolar) {
		this.complexGestaoEscolar = complexGestaoEscolar;
	}

}
