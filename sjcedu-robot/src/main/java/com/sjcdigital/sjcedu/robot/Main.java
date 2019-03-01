package com.sjcdigital.sjcedu.robot;

import java.io.IOException;

import com.sjcdigital.sjcedu.robot.bots.DataSchool;

public class Main {

	public static void main(String[] args) {
		
		try {
			new DataSchool().getSchoolCode().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
