package tests;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Screenshot {
@Test
	public void screenshot() {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		TakesScreenshot sc=(TakesScreenshot )driver;
		File srcfile=sc.getScreenshotAs(OutputType.FILE);
		
		 File targetfile=new File("C:\\WorkSpaces\\Java-Selenium\\seleniumwebdriver\\screenshots\\fullpage.png");
		 srcfile.renameTo(targetfile);
		 driver.close();
		 
	}
}
