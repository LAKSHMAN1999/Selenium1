package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.get("http://newtours.demoaut.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("sunil");
	      //String userName=driver.findElement(By.className("userName")).getAttribute("value");
	      //System.out.println(userName);
	      driver.findElement(By.xpath("//*[@name='password']")).sendKeys("sunil");
	      driver.findElement(By.xpath("//*[@name='login']")).click();
	      driver.findElement(By.xpath("//*[@value='oneway']")).click();
	      WebElement DD= driver.findElement(By.name("passCount"));
	      Select sel = new Select(DD);
	      //sel.selectByVisibleText("2");
	      List<WebElement> data= sel.getOptions();
	      System.out.println(data.size());
	      for (int i=0; i<data.size(); i++) {
	    	  System.out.println(data.get(i).getText());
	      }
	      /*WebElement DF= driver.findElement(By.name("fromPort"));
	      Select fsel = new Select(DF);
	      List<WebElement> dept= sel.getOptions();
	      System.out.println(dept.size());*/
	      //sel.selectByVisibleText("Frankfurt");
	      driver.findElement(By.xpath("//*[@type='radio' and @ value='Business']")).click();
	      driver.findElement(By.xpath("//*[@type='image' and @ name='findFlights']")).click();
	      driver.findElement(By.name("reserveFlights")).click();
	      driver.findElement(By.name("passFirst0")).sendKeys("Lakshman");
	      driver.findElement(By.name("passLast0")).sendKeys("Rayani");
	      driver.findElement(By.name("creditnumber")).sendKeys("1234 5678 9998 0989");
	      List<WebElement> checkbox= driver.findElements(By.name("ticketLess"));
	      for(WebElement e:checkbox) 
	      //for (int i=0; int i<check.size()-1 i--)
	    	  {
	      e.click(); 
	      }
	      driver.findElement(By.name("buyFlights")).click();	    	  
	         
	}

}
