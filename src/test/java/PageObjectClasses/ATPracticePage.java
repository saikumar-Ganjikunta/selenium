package PageObjectClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ATPracticePage {
	public WebDriver driver;
	
	public ATPracticePage(WebDriver driver ) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Locators
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailid;
	
	
	//Action methods
	
	public void user_name(String name) {
		Name.sendKeys(name);
		
		
	}
	
	public void email_id(String email) {
		emailid.sendKeys(email);
		
	}
	
		
		
		
		

		
	
	
	public void quit() {
		driver.quit();
	}
	
	

}
