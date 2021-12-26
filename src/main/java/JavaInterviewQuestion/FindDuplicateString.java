package JavaInterviewQuestion;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateString {

	
	public static void duplicateString(String s[])
	{
		Set<String> str = new HashSet<String>();
		for(String st:s)
		{
			if(str.add(st)==false)
			{
				System.out.println("Duplciate String"+":"+st);
			}
		}
	}
	public static void main(String[] args)
	{
		String s[]= {"selenium", "java", "testing", "java", "selenium"};
		duplicateString(s);

	}

}
