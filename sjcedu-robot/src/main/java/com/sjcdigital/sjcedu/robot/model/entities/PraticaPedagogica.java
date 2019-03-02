package com.sjcdigital.sjcedu.robot.model.entities;

/**
 * 
 * @author pedro-hos
 *
 */
public class PraticaPedagogica {

	private String alunosIncluidos;
	private String salaRecursosMultifuncionais;
	private String banheiroAdequadoPNE;
	private String dependenciasEViasAdequadasPNE;
	private String tradutorInterpreteLibras;
	private String docenteFormacaoEduEspecial;
	private String docenteFormacaoEduIndigena;
	private String docenteFormacaoEduRelacoesEtnorraciais;

	public PraticaPedagogica() {}
	
	public PraticaPedagogica( String alunosIncluidos, String salaRecursosMultifuncionais, String banheiroAdequadoPNE,
							  String dependenciasEViasAdequadasPNE, String tradutorInterpreteLibras, String docenteFormacaoEduEspecial,
							  String docenteFormacaoEduIndigena, String docenteFormacaoEduRelacoesEtnorraciais ) {
		
		this.alunosIncluidos = alunosIncluidos;
		this.salaRecursosMultifuncionais = salaRecursosMultifuncionais;
		this.banheiroAdequadoPNE = banheiroAdequadoPNE;
		this.dependenciasEViasAdequadasPNE = dependenciasEViasAdequadasPNE;
		this.tradutorInterpreteLibras = tradutorInterpreteLibras;
		this.docenteFormacaoEduEspecial = docenteFormacaoEduEspecial;
		this.docenteFormacaoEduIndigena = docenteFormacaoEduIndigena;
		this.docenteFormacaoEduRelacoesEtnorraciais = docenteFormacaoEduRelacoesEtnorraciais;
	}


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

}
