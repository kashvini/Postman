package test;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.LoginPage;

public class LoginTest extends Baseclass {
     
	@Parameters({"UserName","Password"})
	@Test
	public void NegativeLogin(String UsernameVal, String PasswordVal) {
		
		test = report.startTest("Negative Login Test");
		LoginPage login = new LoginPage();
		login.Login(UsernameVal,PasswordVal);
		login.ErrorCheck();
		report.endTest(test);
			
	}
	
	@Parameters({"UserName","CorrectPassword"})
	@Test
	public void PositiveLogin(String UserNameVal, String PasswordVal) {
		test = report.startTest("Positivr Login Test");
		LoginPage login = new LoginPage();
		login.Login(UserNameVal,PasswordVal);
		report.endTest(test);
	}
	
	
	
}
    


