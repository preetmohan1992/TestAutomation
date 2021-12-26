package SeleniumInterviewQuestions;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleWindows 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\52107971\\eclipse-workspace\\Test\\src\\main\\java\\com\\testautomation\\qa\\driver\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 
		 options.addArguments("disable-notifications");
		 
		  driver = new ChromeDriver(options);
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 String parent= driver.getWindowHandle();
		 String parenttitle= driver.getTitle();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'][normalize-space()='Deals']")).click();
		 Set<String> childwindow= driver.getWindowHandles();
		 List<String> hlist= new ArrayList<String>(childwindow);
		 windowHandle(hlist, "Red Hot Offers");
		 switchToParent(parent);
		 closeChildWindow(hlist,parent);
		 
	}
	
	public static boolean windowHandle(List<String> hlist, String windowTitle)
	{
		for(String e:hlist)
		{
			String title= driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle))
			{
				System.out.println("We moved to correct winodw");
			}
		}
		return true;
	}
	
	public static void switchToParent(String parentwindow)
	{
			driver.switchTo().window(parentwindow);
			System.out.println("We have moved to parent window");
	}
	
	public static void closeChildWindow(List<String>hlist, String parentwindow)
	{
		for(String e:hlist)
		{
			if(!e.contains(parentwindow))
			{
				driver.switchTo().window(e);
				driver.close();
			}
		}
	}
	
}

