package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestCases.Base_Class;

public class Login_Page {

	WebDriver driver = Base_Class.driver;
	ExtentTest test = Base_Class.test;
	
	//******************Web Elements*****************************

	@FindBy(className = "login")
	WebElement Loginlink;

	@FindBy(name = "user_login")
	WebElement Username;

	@FindBy(id = "password")
	WebElement Password;

	@FindBy(id = "password-icon")
	WebElement ShowPassword;

	@FindBy(name = "btn_login")
	WebElement LoginButton;

	@FindBy(className = "rememberMe")
	WebElement Rememberme;
	
	public Login_Page() {
	PageFactory.initElements(driver, this);
	}
	
	//******************Functions*****************************

	public void Login(String UsernameValue, String PasswordValue) {

		Loginlink.click();
		test.log(LogStatus.PASS, "Click on Login Link","Login link clicked successfully");
		Username.sendKeys(UsernameValue);
		test.log(LogStatus.PASS, "Enter Username","Username entered successfully");
		Password.sendKeys(PasswordValue);
		test.log(LogStatus.PASS, "Enter Password","Password entered successfully");
		ShowPassword.click();
		test.log(LogStatus.PASS, "Click on Show password","Show Password clicked successfully");
		Rememberme.click();
		test.log(LogStatus.PASS, "Check on RememberMe","Remember Me checked successfully");
		LoginButton.click();
		test.log(LogStatus.PASS, "Click on Login button ","Login Button clicked successfully");

	}

}
