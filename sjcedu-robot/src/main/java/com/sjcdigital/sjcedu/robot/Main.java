package com.sjcdigital.sjcedu.robot;

import java.io.IOException;

import com.sjcdigital.sjcedu.robot.bots.IdebBot;

public class Main {

	public static void main(String[] args) {

		try {

			new IdebBot().capturaDadosOrganizacao("35001557");

			/*
			 * List<Escola> escolas = new IdebBot().capturaDadosEscola();
			 * 
			 * Files.write(Paths.get(
			 * "/opt/workspace/pessoal/sjc-edu/sjcedu-data/sp/sjc/escolas.json"), new
			 * ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(escolas).
			 * getBytes());
			 */

			// System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(escolas));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
