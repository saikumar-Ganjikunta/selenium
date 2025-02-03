package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement UserName=driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println(UserName.isDisplayed());
		System.out.println(UserName.isEnabled());
		UserName.sendKeys("Mangala Mahesh is a good boy");
		Thread.sleep(4000);
		driver.quit();
		
		
		
		

	}

}
