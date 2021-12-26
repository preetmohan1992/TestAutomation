package JavaInterviewQuestion;

import java.util.Arrays;

public class AnyLargestNumber {

	public static int anyLargestnuber(int total, int a[] )
	{
		Arrays.sort(a);
		return a[total-2];
		
	}
	public static void main(String[] args) 
	{
		int a[]= {20,39, 340, 500, 656, 3534};
		int total= a.length;
		System.out.println("Second Largest Number"+anyLargestnuber(total, a));

	}

}
