package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4in2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\TD Bank\\Chromedriver//chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://retail.upskills.in/admin/");
	      driver.findElement(By.name("username")).sendKeys("admin");
	      driver.findElement(By.name("password")).sendKeys("admin@123");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      //driver.findElement(By.className("btn btn-primary")).clear();
	      WebElement link2=driver.findElement(By.id("menu-catalog"));
	      Actions action =new Actions(driver);
	      action.moveToElement(link2).build().perform();
	      action.click();
	      
	      
	      
	}
	

}
