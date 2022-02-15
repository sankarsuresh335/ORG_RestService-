package Utilites;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ToReadFile_Prop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\sanp3\\git\\ORG_RestService-\\RestAssured_COM\\Prop\\prop.Properties");
		
		System.out.println(file);
		
		FileReader fileReader= new FileReader(file);
		
		Properties properties = new Properties();
		
		properties.load(fileReader);
		
		System.out.println(properties.getProperty("Url"));
		
		System.out.println(properties.getProperty("UserName"));
		
		System.out.println(properties.getProperty("Password"));

	}

}
