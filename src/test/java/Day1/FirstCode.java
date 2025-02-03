package Day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

import java.awt.Window;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class FirstCode {

	public static void main(String[] args) throws InterruptedException {
	
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		System.out.println(driver.getTitle());
		
		JavascriptExecutor se=(JavascriptExecutor)driver;
		se.executeScript("Window.scrollBy(0,500)","");
		
		
		
		
		
		
		
		//TakesScreenshot ts=(TakesScreenshot)driver; 
		//File resourcefile=ts.getScreenshotAs(OutputType.FILE);
		
		//File target = new File(System.getProperty("user.dir")+"\\screenshots\\scshot.png");
		//resourcefile.renameTo(target);
		
		
		/*driver.findElement(By.linkText("Facebook - log in or sign up")).click();
		Set<String>windowHandles=driver.getWindowHandles();
		List<String>wHandles=new ArrayList(windowHandles);
		
		String PWindow=wHandles.get(0);
		String CWindow=wHandles.get(1);
		
		driver.switchTo().window(CWindow);
		
		
		boolean fblogo=driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();// //img[@alt='Facebook']
		System.out.println(fblogo);
		
		//Assert.isTrue(fblogo,"Faceb");////input[@id='email']
		
		Thread.sleep(5000);
		
		
		if(fblogo==true) {
			driver.findElement(By.xpath("//input[@id='']")).sendKeys("saikumar9@gmail.com");
			
			
		}
		else {
			System.out.println("Facebook display not displayed");
			
			
		}
		
		
		*/
		driver.quit();
		
		
	

	}

}
