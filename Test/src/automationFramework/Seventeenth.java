package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seventeenth {

	public static void noName() throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
		 driver.findElement(By.xpath("//input[contains(@id, 'inputPassword3')]")).sendKeys("Y"); //Last name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'dataU')]")).sendKeys("10-10-2008"); //Date of birth
		 Thread.sleep(1000);
		 
		 /*checkbox*/
		 driver.findElement(By.id("rodzice")).click(); // Parent's acceptance
		 Thread.sleep(1000);
		 driver.findElement(By.id("lekarz")).click(); // Medical Certificate
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button")).click();  //submit
		 Thread.sleep(1000);
		 Alert alert = driver.switchTo().alert();  //accept in alert
		 /*end*/
		 Thread.sleep(1000);
		 

		 /*console*/
		 String alertText=alert.getText();
		 if(alertText.equals("First name must be filled out")) {
		     System.out.println("Test 17 zaliczony");
		     }
	     else {
	    	 System.out.println("Test 17 niezaliczony");
	     }
		 alert.accept();
		 driver.quit();

	}

}