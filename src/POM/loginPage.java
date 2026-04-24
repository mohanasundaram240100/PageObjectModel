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
	
	//Constructors
	loginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	By username_Loc=By.xpath("//input[@id='username']"); //Username
	By password_Loc=By.xpath("//input[@id='password']"); //Password
	By loginButton_Loc=By.xpath("//button[@id='login']"); //Login Button
	
	//Action Methods	
	
	public void enterUsername(String username)
	{
		driver.findElement(username_Loc).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_Loc).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton_Loc).click();
	}
	
	
	

}
