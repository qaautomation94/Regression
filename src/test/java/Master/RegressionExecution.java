package Master;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import PageFactoryandTestdata.uTicketTestData;
import TestCases.Authentication;
import TestCases.Events;
import TestCases.EventsBooking;
import TestCases.Login;
import TestCases.Profiles;
import TestCases.StartBrowser;
import TestCases.Systemroperties;
import junit.framework.Assert;
public class RegressionExecution {
	
	protected static WebDriver driver;
	protected static ExtentReports extent;
	protected static ExtentTest test;
	public static String browser="chrome";
	static String Suite="uTickets.html";
	public static String Email;
	public static String password="Passw0rd";
	public static String downloadPath;


	protected static String envirnment=uTicketTestData.test;
		
	@BeforeSuite
			public static void SystmProperties() throws InterruptedException, AWTException, IOException{
			Systemroperties.Property();
	
		}
	
	@BeforeMethod
			public void Startup() throws InterruptedException, AWTException, IOException{
				StartBrowser.StartupBrowser(Suite);
				
				
			 
			} 
	

	 		public   void LoginCMX() throws InterruptedException, AWTException, IOException{
				 	Login.login(false);
				 	
			 	}
	

	@Test(priority = 1, description = "As a user I want to be able to sign-up in order to use the system")
	 		public  static void validateSignUp() throws InterruptedException, AWTException, IOException{
				


	 				Authentication.validateSignUp();
	 		
			 	}

	@Test(priority = 2, description = "As a user, after sign up I want to verify my account")
		public  static void  VerifyAccount() throws InterruptedException, AWTException, IOException{

			Login.login(false);
			Thread.sleep(30000);
			driver.get("https://uticket.test.courseco.co/admin/users");
			Thread.sleep(15000);
		 	driver.findElement(By.xpath("//input[contains(@aria-controls, 'users_table')]")).sendKeys(Email);
		 	Thread.sleep(10000);
		 	driver.findElement(By.xpath("//a[contains(text(), '"+Email+"')]")).click();
		 	Thread.sleep(10000);

			Select select =new Select(driver.findElement(By.xpath("//select[contains(@id, 'role_id')]")));
			select.selectByValue("2");
		
		 	
		 	driver.findElement(By.xpath("//label[contains(text(), 'Not verified')]")).click();
		 	Thread.sleep(5000);
			driver.findElement(By.xpath("//button[contains(text(), 'Save Changes')]")).click();
			Thread.sleep(15000);
			
	 	}

	
	@Test(priority = 3, description = "As a user a want to log in uticket, using my email and password")
		public  static void  ValidateLogin() throws InterruptedException, AWTException, IOException{
		//	StartBrowser.StartupBrowser(Suite);
			Login.login(true);
			Thread.sleep(15000);
			Authentication.validateVerifyEmail();


	 	}

	
	@Test(priority = 4, description = "As a user I can edit all of my profile details")
	public static void EditProfile() throws InterruptedException, AWTException, IOException {
		Login.login(true);	
		Thread.sleep(15000);

		driver.get("http://uticket.test.courseco.co/admin/profile/edit?section=contact");
		
		WebElement name = driver.findElement(By.xpath("//input[contains(@id, 'edit_profile_name')]"));
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(name));
		

		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[contains(@id, 'edit_profile_name')]")).sendKeys("Muhammad");
		driver.findElement(By.xpath("//input[contains(@id, 'edit_profile_surname')]")).sendKeys("Iftikhar");
		Thread.sleep(2000);
		Select select = new Select(driver.findElement(By.xpath("//select[contains(@id, 'international_code')]")));
		select.selectByVisibleText("+92 Pakistan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id, 'dial_code_mobile')]")).sendKeys("302");
		driver.findElement(By.xpath("//input[contains(@id, 'edit_profile_phone')]")).sendKeys("3733749");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@data-redirect, 'save')]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[contains(@href, '/admin/profile/edit?section=address')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Address line 1:')]")).sendKeys("42 A");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Address line 2:')]")).sendKeys("Abu Bakar Block");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Address line 3:')]")).sendKeys("New Garden Town");
		driver.findElement(By.xpath("//input[contains(@placeholder, 'City:')]")).sendKeys("Lahore");
		driver.findElement(By.xpath("//button[contains(@data-redirect, 'save')]")).click();
		Thread.sleep(5000);



	}
	@Test(priority = 5, description = "As a user I can access all of my profile features")
	public static void validateProfileFeatures() throws InterruptedException, AWTException, IOException {
		Login.login(true);	
		Profiles.validateProfileFeatures();

	}

	
	@Test(priority = 6, description = "As a user I can delete all of my data")
	public static void validateProfileDataDeletion() throws InterruptedException, AWTException, IOException {

		Login.login(true);	
		Profiles.validateProfileDataDeletion();

	}
//	
//	
//	@Test(priority = 7, description = "As a user a want to log in to uticket.ie using my email and password")
//		public  static void validateVerifyEmail() throws InterruptedException, AWTException, IOException{
//				 				Login.login(false);
//				 				Authentication.validateVerifyEmail();
//		 	
//	 	}
//	
	
	
	@Test(priority = 8, description = "As an Orgnanizer, I should be able to create a new event")
		public  static void validateCreateEvent() throws InterruptedException, AWTException, IOException{
			Login.login(false);	
			Events.validateCreateEvent();
		 	
	 	}
	

	@Test(priority = 9, description = "As an Orgnanizer, I should be able to create a new event")
		public  static void validateCreateEventTestData() throws InterruptedException, AWTException, IOException{
		Login.login(false);	

		Events.validateCreateEventTestData();
		 	
	 	}
	
	@Test(priority = 10, description = "As an organizer I want to email all attendees of my event")
	public  static void validateEmailingAttendeesOfAnEvent() throws InterruptedException, AWTException, IOException{
		Login.login(false);	

		Events.validateEmailingAttendeesOfAnEvent();
	 	
 	}

	// USING MY ADMIN ACCOUNT
	@Test(priority = 11,  description = "As a buyer, if I make an error when entering my card details I receive a warning notification stating the reason")
	public static void validateErrorIsPresentOnInvalidCC() throws InterruptedException, AWTException, IOException {

		Login.login(false);	

		EventsBooking.validateErrorIsPresentOnInvalidCC();
	 	
		}


	@Test(priority = 12, description = "As a buyer I want to buy a ticket for a single day event")
	public static void validateBookingSingleDayEvent() throws InterruptedException, AWTException, IOException {

		Login.login(false);	

		EventsBooking.validateBookingSingleDayEvent();
	 	
		}

	@Test(priority = 13, description = "As a buyer I want to buy one ticket for one date on a multiple date event")
	public static void validateBookingMultipleDayEvent() throws InterruptedException, AWTException, IOException {
		Login.login(false);	

		EventsBooking.validateBookingMultipleDayEvent();
	 	
		}
	

	@Test(priority = 14,  description = "As a buyer I want to buy a payment plan ticket on installments")
	public static void validateBookingInstallmentsEvent() throws InterruptedException, AWTException, IOException {
		Login.login(false);	

		EventsBooking.validateBookingInstallmentsEvent();
	 	
		
		}
		
	@Test(priority = 15, description = "As an organizer I want to end sales for my event")
		public  static void validateEndingSalesOfAnEvent() throws InterruptedException, AWTException, IOException{
		Login.login(false);	

		Events.validateEndingSalesOfAnEvent();
	 	
 	}


	@Test(priority = 16, description = "As an organizer I want to delete my event")
	public static void validateEventDeletion() throws InterruptedException, AWTException, IOException {
		Login.login(false);	

		Events.validateEventDeletion();
	 	
		}

	@Test(priority = 17, description = "As an organizer I want to postpone my event")
	public  static void validateEventIsPostponed() throws InterruptedException, AWTException, IOException{
		Login.login(false);	

		Events.validateEventIsPostponed();
 	
	}


	
	@Test(priority = 18, description = "As an organizer I want to delete my event")
	public static void validateEventDeletionTestData() throws InterruptedException, AWTException, IOException {
		Login.login(false);	

		EventsBooking.validateEventDeletionTestData();
	
	}
	
	@Test(priority = 19, description = "As an organizer I want to download my event")
	public static void DownloadMyTicket() throws InterruptedException, AWTException, IOException {
		Login.login(false);	

		driver.get("https://uticket.test.courseco.co/admin/events/mytickets");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//a[contains(text(), 'Download Ticket')]")).click();
//		Thread.sleep(45000);
//        String sUser = System.getProperty("user.name");
//        String downloadPath = "C:\\Users\\" + sUser + "\\Downloads";
//        File getLatestFile = getLatestFilefromDir(downloadPath);
//        String fileName = getLatestFile.getName();
//        Assert.assertTrue(fileName.contains("ticket-"));
	 	
		
		}
	
/*
	@Test(priority = 17, description = "As an organizer I can connect or disconnect my Stripe account from my profile")
	public static void validateProfileStripeConnecting() throws InterruptedException, AWTException, IOException {
		Login.login();	
		Profiles.validateProfileStripeConnecting();

	}
*/
				 @AfterMethod

			public void getResult(ITestResult result) throws IOException, InterruptedException{
				 //System.out.println(result.getStatus());
				if(result.getStatus()==ITestResult.SUCCESS){
	 				test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case is Passed", ExtentColor.GREEN));
//	 				test.log(Status.PASS, " Please see attached screenshot");
//	 				String screenshotPath = HelpingFunction.capture(result.getName());
//		 			test.addScreenCaptureFromPath(screenshotPath);
		 			extent.flush();

		 			
	 				}

	 			
	 			if(result.getStatus()==ITestResult.FAILURE){
				 	test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case is Failed due to Below Issue", ExtentColor.RED));
//				 	String screenshotPath = HelpingFunction.capture(result.getName());
//				 	test.addScreenCaptureFromPath(screenshotPath);
			 		test.fail(result.getThrowable());
			 		extent.flush();
			 		}
				
	 			
	 			if(result.getStatus()==ITestResult.SKIP){
	 				System.out.print(result.getStatus());
	 				System.out.print("Test cases is skipped");
					test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "Test Case is SKIPPED", ExtentColor.YELLOW));
					test.skip(result.getThrowable());
					extent.flush();
				    }				 		
	 			
			 }

			@AfterTest
			public void endReport(){
			
			//	driver.get(System.getProperty("user.dir")+"/Reports/CRMReport.html");
			}
			@AfterMethod
			 public void CloseBrowser() throws IOException {
				driver.quit();
			
			}
			 
			  public static File getLatestFilefromDir(String dirPath) {
			        File dir = new File(dirPath);
			        File[] files = dir.listFiles();
			        if (files == null || files.length == 0) {
			            return null;
			        }

			        File lastModifiedFile = files[0];
			        for (int i = 1; i < files.length; i++) {
			            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
			                lastModifiedFile = files[i];
			            }
			        }
			        return lastModifiedFile;
			    }
	  	
}
