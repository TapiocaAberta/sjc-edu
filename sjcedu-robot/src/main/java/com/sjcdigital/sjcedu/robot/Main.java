package com.sjcdigital.sjcedu.robot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sjcdigital.sjcedu.robot.bots.IdebBot;
import com.sjcdigital.sjcedu.robot.model.entities.Escola;

public class Main {

	public static void main(String[] args) {

		try {

			/*
			 * System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
			 * .writeValueAsString(new
			 * IdebBot().capturaEspacoAprendizagemEquip("35001557")));
			 */

			List<Escola> escolas = new IdebBot().capturaDadosEscola();

			Files.write(Paths.get("/opt/workspace/pessoal/sjc-edu/sjcedu-data/sp/sjc/escolas.json"),
					new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(escolas).getBytes());
			
			// System.out.println(new
			// ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(escolas));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
