package SeleniumInterviewQuestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveToElement 
{
	public static void main(String []arg)
	{
		System.setProperty("Webdriver.chrome.driver", "C:\\\\Shailendra Automation\\\\ChromeDriver New\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
	}
}
