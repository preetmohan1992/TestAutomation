package JavaInterviewQuestion;

public class ReverseNumber {

	public static void reverseNumber(int num)
	{
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			
			rev= rev*10+temp%10;
			temp= temp/10;
		}
		System.out.println(rev);
		if(num==rev)
		{
			System.out.println("Number is palindrom");
		}
			
	}
	public static void main(String[] args) 
	{
		reverseNumber(12321);
		
	}
}
