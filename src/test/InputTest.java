package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
 System.out.println("Enter the no of elements: ");
 int num;
 
 /* Scanner in = new Scanner(System.in);
  num = in.nextInt();
   ArrayList<Integer> list = new ArrayList<Integer>();
  */
 BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  num = Integer.parseInt(in.readLine());
 String[] name = new String[num];
 
  for(int i=0;i<num;i++){
	  System.out.println("Enter the elements: ");
	 name[i] = in.readLine();
  }
  System.out.println("You entered below values");
  for(String value:name){
	  System.out.println(value);
  }
	}
	


}
