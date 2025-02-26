package tests;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Comparing {
	
	
	WebDriver driver ;
	@Parameters( "browser")
	
	@Test(groups={"sanity"})
	

	public  void sai(String br) {
		
		switch(br.toLowerCase()) {
		case "chrome" :
			 driver = new ChromeDriver();break;
		case "edge":
			 driver = new EdgeDriver();break;
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert alt=driver.switchTo().alert();
		String txt=alt.getText();
		if(txt.equals("Press a button!")) {
			alt.accept();
		System.out.println("ok pressed");
		}
		else {
			alt.dismiss();
			System.out.println("Cancel button pressed");

			}
		driver.quit();
		
		
	
		
		
		
	}
		

}

