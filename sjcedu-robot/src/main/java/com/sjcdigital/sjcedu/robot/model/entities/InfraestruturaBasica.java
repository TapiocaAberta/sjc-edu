package com.sjcdigital.sjcedu.robot.model.entities;

public class InfraestruturaBasica {
	
	private String aguaConsumidaAlunos;
	private String abastecimentoAgua;
	private String abastecimentoEnergiaEletrica;
	private String esgotoSanitario;
	private String banheiroDentroPredio;
	private String banheiroForaPredio;
	private String localFuncionamentoEscola;

	public InfraestruturaBasica(String aguaConsumidaAlunos, String abastecimentoAgua, String abastecimentoEnergiaEletrica, 
								String esgotoSanitario, String banheiroDentroPredio, String banheiroForaPredio, 
								String localFuncionamentoEscola) {
		
		this.aguaConsumidaAlunos = aguaConsumidaAlunos;
		this.abastecimentoAgua = abastecimentoAgua;
		this.abastecimentoEnergiaEletrica = abastecimentoEnergiaEletrica;
		this.esgotoSanitario = esgotoSanitario;
		this.banheiroDentroPredio = banheiroDentroPredio;
		this.banheiroForaPredio = banheiroForaPredio;
		this.localFuncionamentoEscola = localFuncionamentoEscola;
	}

	public InfraestruturaBasica() { }

	public String getAguaConsumidaAlunos() {
		return aguaConsumidaAlunos;
	}

	public void setAguaConsumidaAlunos(String aguaConsumidaAlunos) {
		this.aguaConsumidaAlunos = aguaConsumidaAlunos;
	}

	public String getAbastecimentoAgua() {
		return abastecimentoAgua;
	}

	public void setAbastecimentoAgua(String abastecimentoAgua) {
		this.abastecimentoAgua = abastecimentoAgua;
	}

	public String getAbastecimentoEnergiaEletrica() {
		return abastecimentoEnergiaEletrica;
	}

	public void setAbastecimentoEnergiaEletrica(String abastecimentoEnergiaEletrica) {
		this.abastecimentoEnergiaEletrica = abastecimentoEnergiaEletrica;
	}

	public String getEsgotoSanitario() {
		return esgotoSanitario;
	}

	public void setEsgotoSanitario(String esgotoSanitario) {
		this.esgotoSanitario = esgotoSanitario;
	}

	public String getBanheiroDentroPredio() {
		return banheiroDentroPredio;
	}

	public void setBanheiroDentroPredio(String banheiroDentroPredio) {
		this.banheiroDentroPredio = banheiroDentroPredio;
	}

	public String getBanheiroForaPredio() {
		return banheiroForaPredio;
	}

	public void setBanheiroForaPredio(String banheiroForaPredio) {
		this.banheiroForaPredio = banheiroForaPredio;
	}

	public String getLocalFuncionamentoEscola() {
		return localFuncionamentoEscola;
	}

	public void setLocalFuncionamentoEscola(String localFuncionamentoEscola) {
		this.localFuncionamentoEscola = localFuncionamentoEscola;
	}

}
