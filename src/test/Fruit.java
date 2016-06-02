package test;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int compareTo(Fruit compareFruit) {
		// TODO Auto-generated method stub
	//	int compareQuality = ((Fruit) compareFruit).getQuantity();
		String compareName = compareFruit.getFruitName();
	//	return this.quantity-compareQuality;
      return this.fruitName.compareTo(compareName);
	}
	
	public static Comparator<Fruit> fruitNameComparator = new Comparator<Fruit>() {

		@Override
		public int compare(Fruit o1, Fruit o2) {
			// TODO Auto-generated method stub
			String fruitName1 = o1.getFruitName().toUpperCase();
			String fruitName2 = o2.getFruitName().toUpperCase();
			
			
		//	return fruitName1.compareTo(fruitName2);
			return fruitName2.compareTo(fruitName1);
		}
		
	};
}
