package com.sjcdigital.sjcedu.robot;

import java.io.IOException;

import com.sjcdigital.sjcedu.robot.bots.DadosEscolares;

public class Main {

	public static void main(String[] args) {
		try {
			new DadosEscolares().capturaDadosEscola();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
