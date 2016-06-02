package test;

public class QuickSortTest {
	int partition(int arr[], int left, int right)

	{
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];

		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		};
		return i;
	}



	void quickSort(int arr[], int left, int right) {

		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {3,1,10,17,20,5,7,30};
		QuickSortTest obj = new QuickSortTest();
		obj.quickSort(num, 0, num.length);
		System.out.println(num);
	}
}
