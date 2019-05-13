package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Methods_Like_Displayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("http://newtours.demoaut.com/");
	      driver.manage().window().maximize();
	      WebElement enb= driver.findElement(By.xpath("//*[@name='userName']"));
	      if (enb.isEnabled()) {
	    	  enb.sendKeys("Sunil");
	    	  enb.clear();
	    	  enb.sendKeys("Sunil");
	    	  
	      }
	      if (driver.findElement(By.name("userName")).isDisplayed()) {
	    	  driver.findElement(By.name("password")).sendKeys("sunil");
	    	  driver.findElement(By.name("login")).click();
	      }
	      if (driver.findElement(By.xpath("//*[@value='roundtrip']")).isSelected()) {
	    	  driver.findElement(By.xpath("//*[@value='oneway']")).click();
	      }
	    	
	      

	}

}
