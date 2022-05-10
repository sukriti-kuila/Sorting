import java.util.*;
public class Insertion_Sort {
	static void insertionSort(int arr[])
	 {
		int n = arr.length;
	     int key = 0, j=0;
	     for (int i=1; i<n; i++)
	     {
	         key = arr[i];
	         j = i-1;
	         while (j>=0 && key<arr[j])
	         {
	             arr [j+1] = arr[j];
	             j--;
	         }
	         arr [j+1] = key;
	     }
	  }
	
	public static void main(String[] args) {
		int [] arr = {7,6,5,4,3,2};
		insertionSort (arr);
		System.out.println(Arrays.toString(arr));
	}

}
