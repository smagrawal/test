package test;

import java.util.ArrayList;
import java.util.List;

public class TypeWildcardTest {

	// TODO Auto-generated method stub
public static void printSquare(List<? extends Number> numbers){
	for (Number n : numbers) {
        double d = n.doubleValue();
        System.out.println(d*d);
    }
}
	
	public static void main(String[] args) {
		 List<Integer> ints = new ArrayList<Integer>();
	        ints.add(1);
	        ints.add(5);
	        ints.add(3);
	        printSquare(ints);
	}

}
