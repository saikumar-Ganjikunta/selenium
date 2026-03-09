package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Brokenlink {

	@Test
		public void blinks() throws IOException, InterruptedException {
			
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.findElement(By.xpath("//button[@name='start']")).sendKeys(Keys.RETURN);
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//js.executeScript("arguments[0].click()",driver.findElement(By.xpath("//button[@name='start']")) );
//		
//		js.executeScript("arguments[0].setAttribute('value','saikumar')",driver.findElement(By.xpath("//input[@id='name']")) );
//		
		Actions act=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//button[@name='start']"));
		act.moveToElement(click).click().build().perform();
		
		
		Thread.sleep(5000);
		driver.close();
		
		/*  List<WebElement>links=driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
		  
		  int brokenlink=0;
		  int notbrokenlink=0;
		  
		  
		  for(WebElement link:links) {
			  
			 String hrefattvalue= link.getAttribute("href");
			 
			 if(hrefattvalue==null || hrefattvalue.isEmpty() ) {
				 System.out.println("link does't have value not able to check");
				
			 }
			 
			 try {
			   URL myurl=new URL(hrefattvalue); // converting into url
			   HttpURLConnection connecurl=(HttpURLConnection)myurl.openConnection(); //open connection to the server
			  
			   connecurl.connect();  //connect to the server and sent request to the server.
			   
			   if(connecurl.getResponseCode()>=400) {
				   System.out.println(hrefattvalue +" broken link");
				   brokenlink++;
			   }
			   else {
				   System.out.println( hrefattvalue+"  not a broken link");
				   notbrokenlink++;
			   }
			 }
			 catch(Exception e)
			 {
			 }
			 
			 
			 }
		  
		  System.out.println(brokenlink);
		  System.out.println(notbrokenlink);
		  
		  driver.close();*/
		
		
		  
			 
		  }
			 

	}


