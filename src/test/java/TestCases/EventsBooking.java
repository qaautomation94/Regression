package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Master.RegressionExecution;
import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.uTicketsLocatiors;


public class EventsBooking extends HelpingFunction {
	

	public static void validateErrorIsPresentOnInvalidCC() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
		Thread.sleep(5000);
		driver.get("https://uticket.test.courseco.co/event/ev123-testautomation-2-2");


		Thread.sleep(15000);

		Select ticketCount = new Select(GetData.ticketCount);
		ticketCount.selectByVisibleText("1");

		Thread.sleep(9000);
		Click("Please click login button",GetData.continueButton);

		Thread.sleep(20000);

		driver.switchTo().frame(0);

		Input("Please Enter Password", GetData.ccNumber, "4242424242424242");
		Input("Please Enter Password", GetData.ccExp, "1224");
		Input("Please Enter Password", GetData.ccCCV, "000");


		driver.switchTo().defaultContent();

		Thread.sleep(1000);
/////////////////IFTIIIIIIIIII
		 
		Input("Please Enter Password", GetData.firstName, "test");
		Input("Please Enter Password", GetData.lastName, "test");
		Input("Please Enter Password", GetData.emailAddress, "test@test.ie");

		
		 Thread.sleep(1000);

/////////////////IFTIIIIIIIIII

			Click("Please click login button",GetData.payFull);

			Thread.sleep(1000);
			Input("Please Enter Password", GetData.addressOne, "address");


			Thread.sleep(1000);
			Input("Please Enter Password", GetData.addressTown, "town");


		Thread.sleep(1000);

		Click("Please click login button",GetData.understandTerms);
		Click("Please click login button",GetData.agreeTerms);
		
	//	Click("Please click login button",GetData.completeBookings);
		WebElement completeBookings = GetData.completeBookings;
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.visibilityOf(completeBookings));
		wait.until(ExpectedConditions.elementToBeClickable(completeBookings));

		completeBookings.click();
		
		//button[contains(@data-savecheckout, '1')]
		
		
		Thread.sleep(5000);

		
		
		
		WebElement dontSave = driver
				.findElement(By.xpath("// *[@id=\"checkout_save_details_modal\"]/div[2]/div/div/div[2]/div/button[2]"));
		dontSave.click();

		Thread.sleep(1000);

		
		
		
	}


	public static void validateBookingSingleDayEvent() throws InterruptedException {
		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());


		driver.get("https://uticket.test.courseco.co/event/ev123-testautomation-2-2");

		Thread.sleep(15000);

		Select ticketCount = new Select(GetData.ticketCount);
		ticketCount.selectByVisibleText("1");

		Thread.sleep(9000);

		Click("Please click login button",GetData.continueButton);


		Thread.sleep(9000);

		driver.switchTo().frame(0);

//		WebElement ccNumber = driver
//				.findElement(By.xpath("//input[contains(@name, 'cardnumber')]"));
//		ccNumber.sendKeys("4242424242424242", Keys.TAB);


		Input("Please Enter Password", GetData.ccNumber, "4242424242424242");
		Input("Please Enter Password", GetData.ccExp, "1224");
		Input("Please Enter Password", GetData.ccCCV, "000");
		driver.switchTo().defaultContent();

		Input("Please Enter Password", GetData.firstName, "test");
		Input("Please Enter Password", GetData.lastName, "test");
		Input("Please Enter Password", GetData.emailAddress, "test@test.ie");


		Thread.sleep(1000);

		
		Click("Please click login button",GetData.payFull);

		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressOne, "address");


		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressTown, "town");


	Thread.sleep(1000);

	Click("Please click login button",GetData.understandTerms);
	Click("Please click login button",GetData.agreeTerms);
	//Click("Please click login button",GetData.completeBookings);
	
	WebElement completeBookings = GetData.completeBookings;
	WebDriverWait wait = new WebDriverWait(driver, 600);
	wait.until(ExpectedConditions.visibilityOf(completeBookings));
	wait.until(ExpectedConditions.elementToBeClickable(completeBookings));

	completeBookings.click();
	
	Thread.sleep(5000);



		Thread.sleep(5000);

		WebElement dontSave = driver
				.findElement(By.xpath("// *[@id=\"checkout_save_details_modal\"]/div[2]/div/div/div[2]/div/button[2]"));
		dontSave.click();

		Thread.sleep(1000);

	}

	@Test(priority = 12, description = "As a buyer I want to buy one ticket for one date on a multiple date event")
	public static void validateBookingMultipleDayEvent() throws InterruptedException {

	
		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

		driver.get("https://uticket.test.courseco.co/event/ev123-testautomation-2-2");

		Thread.sleep(15000);

		Select ticketCount = new Select(GetData.ticketCount);
		ticketCount.selectByVisibleText("1");

		Thread.sleep(9000);

		Click("Please click login button",GetData.continueButton);


		Thread.sleep(5000);

		Input("Please Enter Password", GetData.firstName, "test");
		Input("Please Enter Password", GetData.lastName, "test");
		Input("Please Enter Password", GetData.emailAddress, "test@test.ie");

		driver.switchTo().frame(0);

		

		Input("Please Enter Password", GetData.ccNumber, "4242424242424242");
		Input("Please Enter Password", GetData.ccExp, "1224");
		Input("Please Enter Password", GetData.ccCCV, "000");

		driver.switchTo().defaultContent();

		Thread.sleep(1000);

		Click("Please click login button",GetData.payFull);

		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressOne, "address");


		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressTown, "town");

		Thread.sleep(1000);

		Click("Please click login button",GetData.understandTerms);
		Click("Please click login button",GetData.agreeTerms);
	//	Click("Please click login button",GetData.completeBookings);
		
		WebElement completeBookings = GetData.completeBookings;
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.visibilityOf(completeBookings));
		wait.until(ExpectedConditions.elementToBeClickable(completeBookings));

		completeBookings.click();
		
		Thread.sleep(5000);

		

		WebElement dontSave = driver
				.findElement(By.xpath("// *[@id=\"checkout_save_details_modal\"]/div[2]/div/div/div[2]/div/button[2]"));
		dontSave.click();

	}


	@Test(priority = 13, description = "As a buyer I want to buy a payment plan ticket on installments")
	public static void validateBookingInstallmentsEvent() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());


		driver.get("https://uticket.test.courseco.co/event/ev123-testautomation-2-2");

		Thread.sleep(15000);


		Select ticketCount = new Select(driver.findElement(By
				.xpath("//select[contains(@name, 'item')]")));
		ticketCount.selectByVisibleText("1");

		Thread.sleep(2000);

		WebElement continueButton = driver.findElement(By.xpath("//button[contains(text(), 'Continue')]"));
		continueButton.click();

		Thread.sleep(5000);


		Input("Please Enter Password", GetData.firstName, "test");
		Input("Please Enter Password", GetData.lastName, "test");
		Input("Please Enter Password", GetData.emailAddress, "test@test.ie");

		Thread.sleep(1000);

		driver.switchTo().frame(0);

		Input("Please Enter Password", GetData.ccNumber, "4242424242424242");
		Input("Please Enter Password", GetData.ccExp, "1224");
		Input("Please Enter Password", GetData.ccCCV, "000");

		

		driver.switchTo().defaultContent();

		Thread.sleep(1000);


		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressOne, "address");


		Thread.sleep(1000);
		Input("Please Enter Password", GetData.addressTown, "town");



		Thread.sleep(2000);

		WebElement contextTerms = driver
				.findElement(By.xpath("//input[contains(@id, 'checkout-terms_and_conditions')]/following-sibling::span"));
		contextTerms.click();

		Thread.sleep(2000);

		Click("Please click login button",GetData.agreeTerms);
	//	Click("Please click login button",GetData.completeBookings);
		
		WebElement completeBookings = GetData.completeBookings;
		WebDriverWait wait = new WebDriverWait(driver, 600);
		wait.until(ExpectedConditions.visibilityOf(completeBookings));
		wait.until(ExpectedConditions.elementToBeClickable(completeBookings));

		completeBookings.click();
		
		Thread.sleep(5000);


		Thread.sleep(8000);

//		WebElement dontSave = driver
//				.findElement(By.xpath("//*[@id=\"checkout_save_details_modal\"]/div[2]/div/div/div[2]/div/button[2]"));
//		dontSave.click();
//
//		Thread.sleep(11000);
//
//		WebElement viewTicket = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/p[2]/a"));
//		viewTicket.click();

		// EventName
//		Assert.assertTrue(
//				driver.findElement(By.xpath("//*[@id=\"list-tickets-table\"]/tbody/tr[1]/td[4]")).isDisplayed());
//		// DownloadButton
//		Assert.assertTrue(
//				driver.findElement(By.xpath("//*[@id=\"list-tickets-table\"]/tbody/tr[1]/td[8]/a")).isDisplayed());

//		Thread.sleep(1000);
//
//		String url = "http://uticket.test.ibplatform.ie/admin/messaging/all";
//		driver.get(url);
//
//		Thread.sleep(1000);
//
//		WebElement messageSelect = driver.findElement(By.xpath("//*[@id=\"list_messages_table\"]/tbody/tr[1]/td[4]"));
//		messageSelect.click();
//
//		Thread.sleep(5000);
//
//		driver.switchTo().frame("message-details-view-visual-iframe");
//
//		WebElement linkToPayment = driver.findElement(By.xpath("//a[contains(text(),'make payment')]"));
//		linkToPayment.click();
//
//		Thread.sleep(5000);

		/*
		 * driver.switchTo().defaultContent();
		 * 
		 * Thread.sleep(5000);
		 * 
		 * driver.switchTo().frame("__privateStripeFrame5");
		 * 
		 * WebElement ccNumber1 = driver .findElement(By.xpath(
		 * "//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input"));
		 * ccNumber1.sendKeys("4242424242424242", Keys.TAB);
		 * 
		 * WebElement ccExp1 = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/form/div/div[2]/span[2]/span/span/input"));
		 * ccExp1.sendKeys("1224");
		 * 
		 * WebElement ccCCV1 = driver.findElement(By.xpath(
		 * "//*[@id=\"root\"]/form/div/div[2]/span[3]/span/span/input"));
		 * ccCCV1.sendKeys("000");
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement contextTerms1 = driver .findElement(By.
		 * xpath("//div[@class='terms-txt page-content']//div[1]//div[1]//label[1]//span[1]"
		 * )); contextTerms1.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement agreeTerms1 = driver .findElement(By.
		 * xpath("//div[@class='terms-txt page-content']//div[2]//div[1]//label[1]//span[1]"
		 * )); agreeTerms1.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 * WebElement completeBookings1 =
		 * driver.findElement(By.xpath("//*[@id=\"continue_chkout_btn\"]"));
		 * completeBookings1.click();
		 * 
		 * Thread.sleep(1000);
		 * 
		 */

	 }

	@Test(priority = 14, description = "As an organizer I want to delete my event")
	public static void validateEventDeletionTestData() throws InterruptedException {
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);

		Thread.sleep(5000);
		
		driver.get("http://uticket.test.courseco.co/admin/events");

		Thread.sleep(2000);


		Input("Please Enter Password", GetData.eventsSearchBar, "testautomation");

		Thread.sleep(9000);

		Click("Please click login button",GetData.eventActions);
		
		
		Thread.sleep(5000);

		WebElement eventDeleteButton = driver
				.findElement(By.xpath("//*[@id=\"list-events-table\"]/tbody/tr/td[10]/div/ul/li[8]/button"));
		eventDeleteButton.click();

		Thread.sleep(5000);

		WebElement eventConfirmDelete = driver.findElement(By.xpath("//*[@id=\"delete-event-button\"]"));
		eventConfirmDelete.click();

		Thread.sleep(1000);

		WebElement popBoxDelete = driver
				.findElement(By.xpath("//*[@id=\"page-container\"]/div/main/div/div[2]/div/div/div[1]"));
		popBoxDelete.isDisplayed();
		Thread.sleep(15000);

	}

}
