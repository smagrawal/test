package test;

import java.util.ArrayList;
import java.util.List;

public class GenericMathodTest {

	public static <T> void printList(List<T> numbers){
		for(T t: numbers){
			System.out.println("value is " + t);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> ints = new ArrayList<String>();
		ints.add("1");
		ints.add("2");
		ints.add("3");
		
		printList(ints);
	}

}
