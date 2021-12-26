package JavaInterviewQuestion;

public class OccuranceOfChar {
	
	public static void occuranceOfCharacter(String s, char val)
	{
		String str=s.toLowerCase();
		char a[]= str.toCharArray();
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			
			if(str.charAt(i)==val)
			{
				count++;
			}
		}
		System.out.println("Occurance of"+ val+":"+ count);
	}

	public static void main(String[] args) 
	{
		occuranceOfCharacter("shailendra mohAn", 'a');

	}

}
