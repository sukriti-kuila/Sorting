import java.util.*;
public class Insertion_Sort {
	static void insertionSort (int [] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<i; j++)
			{
				if (arr[j]>arr[i])
				{
					int temp = arr [j];
					arr [j] = arr[i];
					arr [i] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] arr = {5,3,1,6,7};
		insertionSort (arr);
		System.out.println(Arrays.toString(arr));
	}

}
