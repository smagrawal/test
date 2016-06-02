package test;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = { 4, 6, 3, 2, 1, 9, 7 };

		int valueToInsert;
		int holePosition;
		int i;

		// loop through all numbers
		for (i = 1; i < intArray.length; i++) {

			// select a value to be inserted.
			valueToInsert = intArray[i];

			// select the hole position where number is to be inserted
			holePosition = i;

			// check if previous no. is larger than value to be inserted
			while (holePosition > 0
					&& intArray[holePosition - 1] > valueToInsert) {
				intArray[holePosition] = intArray[holePosition - 1];
				holePosition--;
				
			}

			if (holePosition != i) {
			
				intArray[holePosition] = valueToInsert;
			}
		}
		for(int value:intArray){
			System.out.println(value + "\n");
		}

	}

}
