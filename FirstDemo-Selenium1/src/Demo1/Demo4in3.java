package Demo1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class Demo4in3 {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://realestate.upskills.in/admin");
	      driver.findElement(By.id("user_login")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("admin@123");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      Thread.sleep(3000);
	      WebElement link=driver.findElement(By.xpath("//*[contains(text(), 'Howdy')]"));
	      Actions action =new Actions(driver);
	      action.moveToElement(link).build().perform();
	      action.click();
	      Actions RC =new Actions(driver);
	      RC.contextClick(link).build().perform();  //Need to use contextClick for right click on the screen
	      Robot robot=new Robot();    //this will use for to click link after right click on the screen
	      robot.keyPress(KeyEvent.VK_DOWN);
	      robot.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_CONTROL);
	      Thread.sleep(2000);
	      robot.keyPress(KeyEvent.VK_TAB);
	      Thread.sleep(2000);
	      System.out.println(driver.getCurrentUrl());
	      
	      
	}

}
