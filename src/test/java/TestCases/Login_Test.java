package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.Login_Page;

public class Login_Test extends Base_Class {

	@Test(priority = 0)
	public void LoginSuccessTest() {
		//test=report.startTest("LoginSuccessTest");
		Login_Page login=new Login_Page();
		login.Login("mejoeljohny12@gmail.com", "Aneesh@123");
		//report.endTest(test);
	}

	@Test(priority = 1)
	public void LoginFailiureTest() {
		
		//test=report.startTest("LoginFailiureTest");
		Login_Page login=new Login_Page();
		login.Login("xyz@gmail.com", "ABCef@123");

		WebElement Errmsg = driver.findElement(By.id("msg_box"));
		String Actualmsg = Errmsg.getText();
		String Expmsg = "The email or password you have entered is invalid.";
		Assert.assertEquals(Actualmsg, Expmsg);
		//report.endTest(test);
	}
	
	@Test
	@Parameters({"Param1","Param2"})
		public void ParameterizedTest(String UserNameVal, String PasswordVal) {
		//test=report.startTest("ParameterizedTest");
		Login_Page login = new Login_Page();
		login.Login(UserNameVal,PasswordVal);		
		//report.endTest(test);
	}

	@Test
		public void ExternalDataTest(){
	//	test=report.startTest("ExternalDataTest");
		String UsernameVal=sheet.getRow(1).getCell(0).getStringCellValue();
		String PasswordVal=sheet.getRow(1).getCell(1).getStringCellValue();
		
		Login_Page login = new Login_Page();
		login.Login(UsernameVal,PasswordVal);	
		//report.endTest(test);
	}
	
	
}
