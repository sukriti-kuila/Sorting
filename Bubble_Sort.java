import java.util.*;
public class Bubble_Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
//		for (int i=0; i<n-1; i++) // For Number of Passes
//		{
//			for (int j=0; j<n-i-1; j++) // For Comparison
//			{
//				if (arr[j]>arr[j+1])
//				{
//					int temp = arr[j+1];
//					arr [j+1] = arr[j];
//					arr [j] = temp;
//				}
//			}
//		}
//		
		// Adaptive Approach
		boolean flag = false;
		for (int i=0; i<n-1; i++) 
		{
			flag = false;
			for (int j=0; j<n-i-1; j++) 
			{
				if (arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr [j+1] = arr[j];
					arr [j] = temp;
					flag = true;
				}
			}
			if (flag==false)
				break;
		}
		
		for (int element : arr)
		{
			System.out.print(element+" ");
		}

	}

}
