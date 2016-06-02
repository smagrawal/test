package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class LoadPropertiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Properties prop = new Properties();
 InputStream input = null;
 OutputStream out = null;
 try{
	 input = new FileInputStream("config.properties");
	// input =	LoadPropertiesTest.class.getClassLoader().getResourceAsStream("config.properties");
	 //load a property
	 prop.load(input);
	// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));
			System.out.println(prop.getProperty("env"));
	      prop.setProperty("test", "www.google.com");
	   out = new FileOutputStream("config.properties");
	   prop.store(out, null);
	 
 }catch(IOException e){
	 System.out.println("Error in method");
 }finally{
	 if(input!=null || out!=null){
		 try{
			 input.close();
			 out.close();
		 }catch(IOException e){
			 e.printStackTrace();
		 }
	 }
 }
 
	}

}
