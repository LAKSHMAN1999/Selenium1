package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
      WebDriver driver= new ChromeDriver();
      driver.get("https://opensource-demo.orangehrmlive.com/");
      driver.manage().window().maximize();
      String Expectedtitle= driver.getTitle();
      System.out.println("Expectedtitel");
      driver.findElement(By.xpath("//*[@name='txtUsername']")).sendKeys("Admin");
      driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
      driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
      String Actualtitle= driver.getTitle();
      System.out.println("Actualtitel");
      
      if(Expectedtitle.equals(Actualtitle))
      {
    	  driver.findElement(By.xpath("//*[@id='welcome']")).click();
   
    	  WebDriverWait Wait=new WebDriverWait(driver, 30);
    	  Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[text()='Logout']"))));
    	  driver.findElement(By.xpath("//*[text()='Logout']")).click();
      }
      else
    	  System.out.println("Expected is not same Actual");
      {
    	  
      }
       
      driver.close();
      //driver.quit(); // it will close all the browsers in the application
	}

}


