package test;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   File file = new File("testing.txt");
   FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
	try{
		fis = new FileInputStream(file);
		 bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		while (dis.available() != 0) {
			System.out.println(dis.readLine());
		}
	}catch(Exception e){
		System.out.println("exception "+e);
	}
	}

}
