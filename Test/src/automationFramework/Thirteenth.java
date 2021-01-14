package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Thirteenth {

	public static void lastNameWithSpecialCharacters() throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
		 driver.findElement(By.xpath("//input[contains(@id, 'inputEmail3')]")).sendKeys("X"); //First name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'inputPassword3')]")).sendKeys("&^%123"); //Last name
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
		 alert.accept();
		 Thread.sleep(1000);
		 alert.accept();
		 /*end*/
		 Thread.sleep(1000);
		 
		 /*console*/
		 String kategoria=driver.findElement(By.id("returnSt")).getAttribute("innerHTML");
	     String kat=kategoria.substring(40,kategoria.length());
		 if(kat.equals("Blad danych")) {
		     System.out.println("Test 13 zaliczony");
		     }
	     else {
	    	 System.out.println("Test 13 niezaliczony");
	     }
		 driver.quit();

	}
}