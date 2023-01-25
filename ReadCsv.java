package com.pranav;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class ReadCsv {

	public static void main(String[] args) {
		
		try {
			
			BufferedReader br=Files.newBufferedReader(Paths.get("D:\\\\temp\\\\hello.csv"));
			String str="";
			while((str= br.readLine()) !=null)
			{
				StringTokenizer tokenizer=new StringTokenizer(str,",");
				while(tokenizer.hasMoreElements())
				{
					System.out.println(tokenizer.nextElement());
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
