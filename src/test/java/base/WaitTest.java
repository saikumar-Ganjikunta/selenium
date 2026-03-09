package base;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class WaitTest {

private WebDriver driver;
private String baseUrl;
private WebElement element;

@BeforeMethod
public void setUp() throws Exception {
driver = new EdgeDriver();
baseUrl = "https://testautomationpractice.blogspot.com/";
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}

@Test
public void testUntitled() throws Exception {
driver.get(baseUrl);
element = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
element.sendKeys("Selenium ");
 driver.findElement(By.className("wikipedia-search-button")).click();
 List<WebElement> links=driver.findElements(By.partialLinkText("Selenium"));
 System.out.println(links.size());
 for( WebElement lik:links) {
	 lik.click(); 
 }

   Set<String> tabs=driver.getWindowHandles();
      for( String tbs:tabs) {
	  String tits=driver.switchTo().window(tbs).getTitle();
	  System.out.println(tits);
	  
	  if(tits.equals("Automation Testing Practice")) {
	      System.out.println("current page title:"+driver.getTitle());
	      driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("Saikumar Ganjikunta");
	      
	      
	     
	    	  }

	  

	  
  }
  
      
      

      
 
 
 


//element.sendKeys(Keys.ENTER);
//Thread.sleep(4000);
////List<WebElement> list = driver.findElements(By.className("_Rm"));
////System.out.println(list.size());
//   WebElement ele = driver.findElement(By.cssSelector("span[class=\"points-container\"]"));
// ele.click();
// driver.findElement(By.xpath("//*[@id=\"closeEduPanel\"]/img")).click();



}

@AfterMethod
public void tearDown() throws Exception {
driver.quit();
}


}
