package test;

import java.util.Arrays;
import java.util.Collections;

public class SortFruitObject  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Fruit[] fruit = new Fruit[4];
     Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Apple", "Apple description",100); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		fruit[0] = pineappale;
		fruit[1] = apple;
		fruit[2] = orange;
		fruit[3] = banana;
	//	Arrays.sort(fruit);
Arrays.sort(fruit, Fruit.fruitNameComparator);
		int i =0;
		for(Fruit temp:fruit){
			 System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
						", Quantity : " + temp.getQuantity());
		}

	}

	

}
