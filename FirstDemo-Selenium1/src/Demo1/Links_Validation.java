package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_Validation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("http://newtours.demoaut.com/");
	      driver.manage().window().maximize();
	      String undercontruTitel= "Under Construction: Mercury Tours";
	      List <WebElement> linkElements=driver.findElements(By.tagName("a"));
	 
	      System.out.println(linkElements.size());
	      String[]  linkText= new String[linkElements.size()];
	      int i=0;
	      //driver.findElement(By.linkText("Home")).click();
	      for (WebElement e:linkElements) {
	    linkText[i]=e.getText();
	    i++;
	    	  
	      }
	      for(String t:linkText) {
	    	  
	      driver.findElement(By.linkText(undercontruTitel)).click();
	      
	      if(driver.getTitle().equals(undercontruTitel)) {
	    	  System.out.println("\"" +t+ "\"" + "\" + is Under Construction"); 
	      }
	      else   {
	    	  System.out.println("\"" +t+ "\"" + "\" + is working"); 
	      }
	}

}
}
