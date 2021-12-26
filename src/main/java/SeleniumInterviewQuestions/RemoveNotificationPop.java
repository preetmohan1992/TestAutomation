package SeleniumInterviewQuestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class RemoveNotificationPop {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\52107971\\eclipse-workspace\\Test\\src\\main\\java\\com\\testautomation\\qa\\driver\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		 
		 options.addArguments("disable-notifications");
		 
		 WebDriver driver = new ChromeDriver(options);
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.spicejet.com/");
		 
		 
		 Actions action = new Actions(driver);
		 Thread.sleep(10000);
		 //action.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")));
		 
		 //driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]")).click();
		 driver.findElement(By.xpath("//div[@class='css-76zvg2 r-jwli3a r-ubezar r-16dba41 r-1pzd9i8'][normalize-space()='Deals']")).click();

	}

}
