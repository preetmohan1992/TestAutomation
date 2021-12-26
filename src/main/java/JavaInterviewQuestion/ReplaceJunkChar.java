package JavaInterviewQuestion;

public class ReplaceJunkChar {

	public static void main(String[] args) 
	{
		String s= "#%$^$ shailendra mohan %#^?";
		String newstring= s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(newstring);
	}

}
