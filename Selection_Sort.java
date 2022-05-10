import java.util.*;

public class Selection_Sort {
	static int findMin(int arr[], int start)
	{
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i=start; i<arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
	}
	
	static void selectionSort(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n-1; i++)
	    {
	        int minIndex = findMin(arr,i);
	        int temp = arr[minIndex];
	        arr [minIndex] = arr[i];
	        arr [i] = temp;
	    }
	}
	
	public static void main(String[] args) {
	int [] arr = {8,6,2,1,0,15,22};
	selectionSort(arr);
	System.out.println(Arrays.toString(arr));

	}

}
