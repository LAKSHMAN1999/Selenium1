package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.toolsqa.com/");
	      //This is to identify my parent window
	      String parentwindow= driver.getWindowHandle();
	      System.out.println("parent window name---->" +parentwindow);
	      WebElement Clickbutton= driver.findElement(By.id("button1"));
	      //to click on the button
	      for (int i=0; i<3; i++) {
	    	  Clickbutton.click();
	    	  Thread.sleep(2000);
	      }
	      // This is to identify child window 
	      //Set<String> childwindow= driver.getWindowHandles();
	      List<String> childwindow= new ArrayList<>(driver.getWindowHandles());
	      System.out.println("child window name--->"  + childwindow);
	      String lastwindow="";
	      
	      
	      for(int i=1; i<childwindow.size(); i++){
	      
	    	  
	    	  driver.switchTo().window(childwindow.get(i));
		      driver.navigate().to("http://www.goodle.com");
		      lastwindow=childwindow.get(i).toString();
	      }
	      //Swithching back to parentwindow 
	      driver.switchTo().window(parentwindow);
	      driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	     System.out.println(driver.getTitle());
	     driver.close();
	     driver.switchTo().window(lastwindow);
	     driver.get("http://newtours.demoaut.com/");
	}

		
}
