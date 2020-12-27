package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fefteenth {

	public static void noDate() throws InterruptedException{

		
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
		 driver.findElement(By.xpath("//input[contains(@id, 'inputEmail3')]")).sendKeys("X"); //First name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'inputPassword3')]")).sendKeys("Y"); //Last name
		 Thread.sleep(1000);
		 
		 driver.findElement(By.id("rodzice")).click(); // Parent's acceptance
		 Thread.sleep(1000);
		 driver.findElement(By.id("lekarz")).click(); // Medical Certificate
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button")).click();  //submit
		 
		 Thread.sleep(1000);
		 Alert alert = driver.switchTo().alert();  //accept in alert
		 alert.accept();
		 /*end*/
		 Thread.sleep(1000);
		 driver.quit();
	}
}
