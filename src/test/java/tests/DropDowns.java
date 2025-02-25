package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {
	@Test(groups="sanity")
	public  void dpdowns(){
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Select sc= new Select(driver.findElement(By.xpath("//select[@id='country']")));
		sc.selectByVisibleText("United Kingdom");
		
		System.out.println(sc.getFirstSelectedOption().getText());
	 List<WebElement>options=sc.getOptions();
		System.out.println(options.size());
		 
		 for(WebElement s:options) {
		 System.out.println(s.getText());
		 }
		
		
		
		
		
//		JavascriptExecutor js= (JavascriptExecutor) driver;
//		
//		
//		WebElement dropdown=driver.findElement(By.xpath("//button[@id='dropdownMenuButton']"));
//		//js.executeScript("window.scrollBy(0,3000)");//   //button[@id='dropdownMenuButton']
//		Thread.sleep(4000);
//		js.executeScript("arguments[0].scrollIntoView();" ,dropdown);
//		Thread.sleep(4000);
//		//js.executeScript("arguments[0].click();",dropdown);
//		
//		//button[@class='btn btn-secondary dropdown-toggle'][@id='dropdownMenuButton']
//		
//		//dropdown.click();
//		
//		
//		
//		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		
//		
//		
//		
//		//Thread.sleep(4000);
		
		driver.quit();
		

	}

}
