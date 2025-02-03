package Day1;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Comparing {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
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

