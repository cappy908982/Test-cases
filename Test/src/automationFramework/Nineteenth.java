package automationFramework;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nineteenth {

	public static void withMedicalCertificate1955() throws InterruptedException{

		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://lamp.ii.us.edu.pl/~mtdyd/zawody/");
		 driver.findElement(By.xpath("//input[contains(@id, 'inputEmail3')]")).sendKeys("X"); //First name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'inputPassword3')]")).sendKeys("Y"); //Last name
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[contains(@id, 'dataU')]")).sendKeys("10-10-1955"); //Date of birth
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
	     if(kat.equals("Senior")) {
		     System.out.println("Test 19 zaliczony");
		     }
		     else 
		    	 System.out.println("Test 19 niezaliczony"); 
	     
		 driver.quit();

	}
}