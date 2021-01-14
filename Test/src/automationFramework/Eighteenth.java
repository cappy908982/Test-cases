package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eighteenth {

	public static void withEverythingChecked2009() throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
		 driver.findElement(By.xpath("//input[contains(@id, 'inputEmail3')]")).sendKeys("X"); //First name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'inputPassword3')]")).sendKeys("Y"); //Last name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'dataU')]")).sendKeys("10-10-2009"); //Date of birth
		 Thread.sleep(1000);
		 
		 /*checkbox*/
		 driver.findElement(By.id("rodzice")).click(); // Parent's acceptance
		 Thread.sleep(1000);
		 driver.findElement(By.id("lekarz")).click(); // Medical Certificate
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button")).click();  //submit
		 Thread.sleep(1000);
		 Alert alert = driver.switchTo().alert();  //accept in alert
		 alert.accept();
		 Thread.sleep(1000);
		 alert.accept();
		 /*end*/
		 Thread.sleep(1000);
		 
		 /* Konsola*/
		 String kategoria=driver.findElement(By.id("returnSt")).getAttribute("innerHTML");
	     String kat=kategoria.substring(40,kategoria.length());
	     if(kat.equals("Skrzat")) {
		     System.out.println("Test 18 zaliczony");
		     }
		     else 
		    	 System.out.println("Test 18 niezaliczony"); 
	     
		 driver.quit();

	}
}