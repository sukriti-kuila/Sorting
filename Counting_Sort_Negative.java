import java.util.Arrays;
public class Counting_Sort_Negative {
	static int minElement (int [] arr)
	{
		int min = Integer.MAX_VALUE;
		for (int i=0; i<arr.length; i++)
		{
			if (arr [i]< min)
			min = arr[i];	
		}
		return min;
	}
	static int maxElement (int [] arr)
	{
		int max = Integer.MIN_VALUE;
		for (int i=0; i<arr.length; i++)
		{
			if (arr [i]> max)
			max = arr[i];	
		}
		return max;
	}
	static void sort (int arr[])
	{
		int max = maxElement (arr);
		int min = minElement (arr);
		int k = max-min;
		int [] count = new int [k+1];
		for (int i=0; i<count.length; i++)
		{
			count [i] = 0;
		}
		for (int i=0; i<arr.length; i++)
		{
			count [arr[i]-min] += 1; 
		}
		int i=0,j=0;
		while (i <count.length)
		{
			if (count[i] != 0)
			{
				arr [j++] = i+min;
				count [i]--;	
			}
			else
			{
				i++;
			}
		}	
	}
	public static void main(String[] args) {
		int [] arr = {2,-2,-2,3,2,5};
		sort (arr);
		System.out.println(Arrays.toString(arr));

	}

}
