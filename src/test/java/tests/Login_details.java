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

public class Login_details extends BaseClass  {
	public   WebDriver driver ;

	
	
	
	
	
	
	@Test
	public void login_credentials() throws InterruptedException  {

		
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
		Thread.sleep(3000);
		
		atp.quit();
		
		
		
	}
	
	
	
	

}
