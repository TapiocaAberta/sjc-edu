package com.sjcdigital.sjcedu.robot.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pedro-hos
 *
 */
public class RegexUtil {
	
	public static Matcher getMatcher(final String regex, final String input) {
		final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(input);
	}
	
	public static String removerAspas(String text) {
		Matcher matcher = getMatcher("\"([^\"]*)\"", text);
		return matcher.find() ? matcher.group(1) : "";
	}

}
