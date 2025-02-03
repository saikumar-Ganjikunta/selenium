package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		
		WebElement dropdown=driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
		//js.executeScript("window.scrollBy(0,3000)");//   //button[@id='dropdownMenuButton']
		Thread.sleep(4000);
		js.executeScript("arguments[0].scrollIntoView();" ,dropdown);
		Thread.sleep(4000);
		//js.executeScript("arguments[0].click();",dropdown);
		
		//button[@class='btn btn-secondary dropdown-toggle'][@id='dropdownMenuButton']
		
		//dropdown.click();
		
		
		
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
		//Thread.sleep(4000);
		
		driver.quit();
		

	}

}
