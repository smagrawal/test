package test;

import java.util.ArrayList;
import java.util.Scanner;



public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int temp=0;
		int[] testArray = {10,5,15,7, 3, 2};

		for(int i=0;i<testArray.length;i++){
			for(int j=0;j<testArray.length-1;j++){
				if(testArray[j]>testArray[j+1]){
					temp = testArray[j+1];
					testArray[j+1] = testArray[j];
					testArray[j] = temp;
				}
			}
			System.out.println("interation"+ i);
		}
		
		for(int value:testArray){
			System.out.println("Array after sorting: "+value);
		}
	}

}
