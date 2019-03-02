package com.sjcdigital.sjcedu.robot.model.pojos.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sjcdigital.sjcedu.robot.model.entities.InfraestruturaBasica;
import com.sjcdigital.sjcedu.robot.model.pojos.Pojo;

public class InfraestruturaBasicaPojo implements Pojo {
	
	@JsonProperty("Água consumida pelos alunos")
	private String aguaConsumidaAlunos;
	
	@JsonProperty("Abastecimento de água")
	private String abastecimentoAgua;
	
	@JsonProperty("Abastecimento de energia elétrica")
	private String abastecimentoEnergiaEletrica;
	
	@JsonProperty("Esgoto sanitário")
	private String esgotoSanitario;
	
	@JsonProperty("Banheiro dentro do prédio")
	private String banheiroDentroPredio;
	
	@JsonProperty("Banheiro fora do prédio")
	private String banheiroForaPredio;
	
	@JsonProperty("Local de funcionamento da escola")
	private String localFuncionamentoEscola;
	
	@Override
	public InfraestruturaBasica paraEntidade() {
		return new InfraestruturaBasica(aguaConsumidaAlunos, abastecimentoAgua, abastecimentoEnergiaEletrica, esgotoSanitario, 
				                        banheiroDentroPredio, banheiroForaPredio, localFuncionamentoEscola);
	}

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
