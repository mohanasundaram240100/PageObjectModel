package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	//Without Page factory in POM
	//Must needed these three things for POM classes
	/*
	 * Constructors
	 * Locators
	 * Action Methods
	 */
	
	WebDriver driver;
	
	//Constructor
	
	public loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Locators
	
	By username_Loc=By.xpath(("//input[@id='username']"));
	By password_Loc=By.xpath(("//input[@id='password']"));
	By loginBtn_Loc=By.xpath(("//button[@id='login']"));
	
	//Action Methods
	
	public void userName(String username)
	{
		driver.findElement(username_Loc).sendKeys(username);
	}

	
	public void passWord(String password)
	{
		driver.findElement(password_Loc).sendKeys(password);
	}
	
	public void Submit()
	{
		driver.findElement(loginBtn_Loc).click();
	}
}
