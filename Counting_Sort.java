import java.util.Arrays;

public class Counting_Sort {
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
		int k = maxElement (arr);
		int [] count = new int [k+1];
		for (int i=0; i<count.length; i++)
		{
			count [i] = 0;
		}
		for (int i=0; i<arr.length; i++)
		{
			count [arr[i]] += 1; 
		}
		int i=0,j=0;
		while (i <count.length)
		{
			if (count[i] != 0)
			{
				arr [j++] = i;
				count [i]--;	
			}
			else
			{
				i++;
			}
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {3,5,8,1,2,1};
		sort (arr);
		System.out.println(Arrays.toString(arr));
	}

}
