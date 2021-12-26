package JavaInterviewQuestion;


import java.util.TreeSet;

public class InsertNumberInDefaultOrder {
	
	public static void insertOrder(int a[])
	{
		TreeSet t= new TreeSet();
		for(int i:a)
		{
			t.add(i);
		}
		
		System.out.println(t);
	}

	public static void main(String[] args) 
	{
		
		int a[]= {20, 4, 5, 2, 10, 20};
		insertOrder(a);
		
	}

}
