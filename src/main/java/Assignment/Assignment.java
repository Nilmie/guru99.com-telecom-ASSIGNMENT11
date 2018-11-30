package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/index.html");
		
		driver.findElement(By.linkText("Add Customer")).click();
		
		//driver.findElement(By.id("done")).click();
		//driver.findElement(By.xpath("//div[@class='2u 12u$(small)'][2]")).click();
		//driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		
		//WebElement Done = driver.findElement(By.id("done"));
		//WebElement Pending = driver.findElement(By.id("pending"));		
		//Done.click();
		
		 driver.findElement(By.xpath("//label[@for='done']")).click();
		
		
		driver.findElement(By.id("fname")).sendKeys("Nilmie");
		driver.findElement(By.id("lname")).sendKeys("Gamhewa");
		driver.findElement(By.id("email")).sendKeys("nilmie@gmail.com");
		driver.findElement(By.name("addr")).sendKeys("Pannipitiya");
		driver.findElement(By.id("telephoneno")).sendKeys("0772273515");
	
		driver.findElement(By.name("submit")).click();
		

		
		
		//driver.close();
		//driver.quit();
	}
}
