package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectClasses.ATPracticePage;
import base.BaseClass;

public class Login_details  {
	public   WebDriver driver ;
	
	@Test(groups="sanity")
	public void login_credentials() throws InterruptedException  {
		 driver = new ChromeDriver();
		  //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		
		ATPracticePage atp=new ATPracticePage(driver);
		
		atp.user_name("saikumar");
		atp.email_id("saikumar9@gmail.com");
		//Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
//		//WebElement source=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
//		
	js.executeScript("window.scrollBy(0,1000)");
		
		
		
         Actions aa=new Actions(driver);
		
		WebElement source=driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
		aa.dragAndDrop(source, target);
		driver.quit();
		
	
		
		
		
	}
	
	
	
	

}
