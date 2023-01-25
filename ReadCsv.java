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
	public static void readDataRowWise() throws IOException
	{
		File file = new File("D:\\\\\\\\temp\\\\\\\\hello.csv"); 
		List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8); 
		for (String line : lines) { 
		   String[] array = line.split(";"); 
		   System.out.println(array[0]+" "+array[array.length-1]); 
		}
	}
	public static String[] readColumnWise(int columnInCsv, String filePath, String delimeter)
	{
		String[] data ;
		String currentLine;
		ArrayList<String> colData=new ArrayList();
		try {
			
			FileReader fr=new FileReader(filePath);
			BufferedReader br=new BufferedReader(fr);
			while((currentLine =br.readLine())!=null)
			{
				data=currentLine.split(delimeter);
				colData.add(data[columnInCsv]);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			return null;
		}
		return colData.toArray(new String[0]);
	}
}
