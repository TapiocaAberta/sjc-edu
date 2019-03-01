package com.sjcdigital.sjcedu.robot.bots;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sjcdigital.sjcedu.robot.utils.RegexUtils;

/**
 * @author pedro-hos
 * PT: Classe responsável por pegar os dados do site do IDEB  http://idebescola.inep.gov.br/ideb/         
 * EN: Class responsible to go towards the IDEB site http://idebescola.inep.gov.br/ideb/ and get the informations
 */
public class DataSchool {
	
	private final String IDEB_URL = "http://idebescola.inep.gov.br/ideb/";
	
	/**
	 * PT: Pegar os links das escolas de SJCampos no IDEB
	 * EN: Get school links from the SJCampos city on IDEB
	 * @return List<String> with the school links
	 * @throws IOException 
	 */
	public List<String> getSchoolCode() throws IOException {
		
		List<String> links = new ArrayList<>();
		
		Document doc = Jsoup.connect(IDEB_URL + "consulta-publica")
							.data("cookieexists", "false")
				  			.data("pkCodEstado", "35")
				  			.data("pkCodMunicipio", "3549904")
				  			.timeout(3000)
				  			.post();
		
		Elements table = doc.select("table");
		Elements rows = table.select("tr");
		
		rows.forEach(element -> links.add(RegexUtils.removeQuotes(element.attr("onclick"))));
		
		return links;
	}
	
}
