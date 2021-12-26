package JavaInterviewQuestion;

public class TestClass {
	public static void occuranceOfChar(String s, char val)
	
	{
		String sn= s.toLowerCase();
		char a[]= s.toCharArray();
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(sn.charAt(i)==val)
			{
				count++;
			}
			
		}
		
		System.out.println("Count of" +val+":" +count);
		
		
	}

	public static void main(String[] args) 
	{
		occuranceOfChar("selenium test java", 't');
	}

}
