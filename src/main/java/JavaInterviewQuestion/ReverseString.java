package JavaInterviewQuestion;

public class ReverseString {
	
	public static void reverseString(String name)
	{
		String rev="";
		int len= name.length();
				
		for(int i=len-1; i>=0; i--)
		{
			rev= rev+name.charAt(i);
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		reverseString("shailendra Mohan");

	}

}
