package JavaInterviewQuestion;

public class ReverseStringAtItsPlace {

	public static void reverseString(String name)
	{
		//String mainreverse="";
		
		String str[]= name.split(" ");
	
		for(String s:str)
		{
			String rev=" ";
			int len= s.length();
			
			for(int i=len-1; i>=0; i--)
			{
				rev= rev+s.charAt(i);
			}
			System.out.print(rev);
		}
		
	}
	public static void main(String[] args) 
	{
		reverseString("shailendra mohan");
	}

}
