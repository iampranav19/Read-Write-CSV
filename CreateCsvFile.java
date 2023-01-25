package com.pranav;

import java.io.FileWriter;

public class CreateCsvFile {

	
	public static void main(String[] args) {
		
		StringBuilder  strignBuilder=new StringBuilder();
		
		strignBuilder.append("Name").append(",").append("City").append("\n");
		strignBuilder.append("Pranav").append(",").append("Meerut").append("\n");
		strignBuilder.append("Nikhil").append(",").append("Sharma").append("\n");
		strignBuilder.append("Naman").append(",").append("Delhi").append("\n");
		
		try {
			FileWriter right=new FileWriter("D:\\temp\\hello.csv");
			right.write(strignBuilder.toString());
			right.close();
			System.out.println("csv file created");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	}
}
