package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StaleElementReference {
	@Test
	public void ser() throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
		driver.get("https://www.letskodeit.com/practice");
		WebElement element=driver.findElement(By.id("bmwcheck"));
		driver.navigate().refresh();
		WebElement element1=driver.findElement(By.id("bmwcheck"));
	
		element1.click();
	
	  Thread.sleep(4000);
	   boolean res=element1.isSelected();
		Assert.assertTrue(res);
		
		System.out.println(res);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			WebElement element1=driver.findElement(By.id("bmwcheck"));
			
			element1.click();
			 boolean res=element1.isSelected();
			 System.out.println(res);
			 
			
			Assert.assertTrue(true);
		
			
			
			
		}
		
		
		finally {
		driver.close();
		}
		
		
		
	}

}
