package JavaInterviewQuestion;

import java.util.Comparator;
import java.util.TreeSet;

public class InsertNNumInCustomOrder {
	
	public static void customSorting(int a[])
	{
	   TreeSet t= new TreeSet(new MyComparator());
	   for(int i:a)
	   {
		   t.add(i);
	   }
	
	System.out.println(t);
	}

	public static void main(String[] args) {
		int a[]= {2,4,5,3,8,5,7,12,56,7,23,12};
		customSorting(a);

	}

}


class MyComparator implements Comparator
{

	public int compare(Object obj1, Object obj2) {
		
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		if(I1<I2)
		return +1;
		else if(I1>I2)
		return -1;
		
		else
			return 0;
	}
	}