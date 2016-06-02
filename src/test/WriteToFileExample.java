package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  File file = new File("output.txt");
  String content = "This is the content to write into file";
  try {
	FileOutputStream ous = new FileOutputStream(file);
	if(!file.exists()){
		file.createNewFile();  
	  }
	FileWriter fw = new FileWriter(file.getAbsoluteFile());
	BufferedWriter bw = new BufferedWriter(fw);
	bw.write(content);
	bw.close();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
		
	}

}
