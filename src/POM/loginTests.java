package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTests {
	
	
	WebDriver driver;

	@BeforeClass
	void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	
	@Test
	void login()
	{
		loginPage lp = new loginPage(driver);
		lp.userName("Admin");
		lp.passWord("admin123");
		lp.Submit();
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}
