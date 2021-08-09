import java.util.*;
public class Selection_Sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		for (int i=0; i<n-1; i++)
		{
			int	indexOfMin = i;
			for (int j=i+1; j<n; j++)
			{
				if (arr[j]<arr[indexOfMin])
				{
					int temp = arr[j];
					arr[j] = arr[indexOfMin];
					arr [indexOfMin] = temp;
				}
			}
		}
		
		for (int element : arr)
		{
			System.out.print(element+" ");
		}

	}

}
