package TestCases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactoryandTestdata.uTicketsLocatiors;
import PageFactoryandTestdata.HelpingFunction;

public class Authentication extends HelpingFunction {
	

	// USING MY ADMIN ACCOUNT

	//@Test(priority = 1, description = "As a user, I want to be able to sign up to be able to use the system.")
	public static void validateSignUp() throws InterruptedException {
		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		Thread.sleep(30000);
		
		Click("Please click login button",GetData.loginbButton);
		Click("Please click login button",GetData.signupButton);
		Input("Please Enter Password", GetData.firstNameField, "Test");
		Input("Please Enter Password", GetData.lastNameField, "Automation");
		 Random rand = new Random(); 
		  
	        // Generate random integers in range 0 to 999 
	    int rand_int1 = rand.nextInt(100000000); 
		Email = "test"+rand_int1+"@mailinator.com";
		System.out.println(Email);
		WebElement emailField = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/form[2]/div/div[1]/div[3]/div/label/input"));
		emailField.sendKeys(Email, Keys.TAB);

		//emailField.sendKeys("utreg@mailinator.com", Keys.TAB);

	//	Input("Please Enter Password", GetData.signupemail, "utreg@mailinator.com");
	//	GetData.signupemail.sendKeys(Keys.TAB);
		Input("Please Enter Password", GetData.passwordField, password);

		Thread.sleep(2000);

		Click("Please click login button",GetData.signupButtons);
		Thread.sleep(6000);


	}

	public static void validateVerifyEmail() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	
		Thread.sleep(15000);
		driver.get("https://uticket.test.courseco.co/admin/users");

		Thread.sleep(15000);


		WebElement searchfield = GetData.searchField;
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(searchfield));
		
		Thread.sleep(10000);

		Input("Please Enter Password", GetData.searchField, Email);
		Thread.sleep(10000);

		
		GetData.searchField.sendKeys(Keys.ENTER);

		Thread.sleep(10000);

	//	Click("Please click login button",GetData.fieldToClick);

		Thread.sleep(5000);

		driver.getPageSource().contains(Email);


	}

	public static void validateLValidLogin() throws InterruptedException {
		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		Thread.sleep(10000);

		WebElement avatarIsDisplayed = driver.findElement(By.xpath("//*[contains(text(), 'Home')]"));
		avatarIsDisplayed.isDisplayed();

		Thread.sleep(1000);

	}

}