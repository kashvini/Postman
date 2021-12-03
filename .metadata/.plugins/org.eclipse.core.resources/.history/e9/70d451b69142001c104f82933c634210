package test;




import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import org.testng.asserts.SoftAssert;



import pages.LoginPage;

//import org.openqa.selenium.firefox.FirefoxDriver;



public class LoginTest extends Baseclass{

	

	@Parameters({"UserName" , "Password"})

	@Test

	public void NegativeLogin(String UserNameVal, String PasswordVal) {

		

		test = report.startTest("Negative Login Test");

		LoginPage login = new LoginPage();

        login.Login(UserNameVal, PasswordVal);		

		//WebElement ForgotPassword = driver.findElement(By.linkText("Forgot Password?"));		

		//ForgotPassword.click();

		

		login.Errorcheck();

		

		report.endTest(test);

		

	}

	

	@Parameters({"UserName" , "CorrectPassword"})

	@Test

	public void PositiveLogin(String UserNameVal, String PasswordVal) {

		test = report.startTest("Positive Login Test");

		LoginPage login = new LoginPage();



		login.Login(UserNameVal, PasswordVal);



		report.endTest(test);

		

	}

	



}