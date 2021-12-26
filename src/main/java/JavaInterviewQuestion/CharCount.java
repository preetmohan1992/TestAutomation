package JavaInterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
	
	public static void charCount(String s)
	{
		Map<Character, Integer> charmap= new HashMap<Character, Integer>();
		char a[]=s.toCharArray();
		for(char c:a)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
			}
		}
		System.out.println(charmap);
		
	}

	public static void main(String[] args) {
		charCount("shailendra mohan");

	}

}
