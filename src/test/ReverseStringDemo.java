package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*String test = "testing reverse string program";

		int j=0;
		char[] temp1 = new char[100]; 

		char[] temp = test.toCharArray();
		for(int i=temp.length-1; i>=0;i--){
	      temp1[j] = temp[i];
	      j++;
		}
		System.out.println(temp1);*/
	int count=0,k=0;
		char ch[] = new char[50];
		char temp[] = new char[50];
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name = br.readLine();
	ch = name.toCharArray();
	for(int i=0;ch[i]!='\0';i++){
		count++;
	}
	for(int j=count-1;j>=0;j--){
		temp[k] = ch[j];
	}
	System.out.println(temp);
	
	
	}

}
