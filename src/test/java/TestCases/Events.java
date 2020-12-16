package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageFactoryandTestdata.uTicketsLocatiors;
import junit.framework.Assert;
import PageFactoryandTestdata.HelpingFunction;

public class Events extends HelpingFunction {

	// USING MY ADMIN ACCOUNT

	public static void validateCreateEvent() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

		Thread.sleep(10000);

		Click("Please click login button",GetData.createEventButton);

		Input("Please Enter Password", GetData.eventNameField, "ev123-testautomation");


		Thread.sleep(30000);
		


		String path = System.getProperty("user.dir")+"/Images/event.jpg";
		System.out.println(path);
		Input("Please Enter Password", GetData.eventImageField, path);
		

		Input("Please Enter Password", GetData.eventurl, "testautomation-paymentplan-2-2");


		
		
		Thread.sleep(5000);

		WebElement saveImage = GetData.saveImage;
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(saveImage));
		saveImage.click();

		Thread.sleep(1000);

		Click("Please click login button",GetData.eventImageSave);


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventLocationOne, "ABC");


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventLocationTwo, "ABC");

		Input("Please Enter Password", GetData.eventLocationThree, "ABC");


		Input("Please Enter Password", GetData.eventLocationSelectCity, "Galway");


		Select eventLocationCountry = new Select(GetData.eventLocationCountry);
		eventLocationCountry.selectByVisibleText("Ireland");

		Thread.sleep(1000);

		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('edit-event-date-start').removeAttribute('readonly',0);");


		Input("Please Enter Password", GetData.toDateBox, "2021-08-08");

		Thread.sleep(1000);

		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('edit-event-time-start').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.toTimeBox, "13:00");


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventOrganiserName, "Adrian Wistreich");

		Click("Please click login button",GetData.oragniserDetails);


		
		Thread.sleep(1000);
		Input("Please Enter Password", GetData.organiserEmail, "Adrian@test.com");


		Thread.sleep(1000);

		WebElement paidTicket = GetData.paidTicket;

		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.elementToBeClickable(paidTicket));
		paidTicket.click();
		paidTicket.click();
		Input("Please Enter Password", GetData.ticketName, "Early Bird");


		Input("Please Enter Password", GetData.ticketNumber, "600");
		Input("Please Enter Password", GetData.ticketPrice, "15");



		Thread.sleep(1000);

		WebElement ticketSettings = GetData.ticketSettings;

		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(ticketSettings));
		ticketSettings.click();
		ticketSettings.click();

		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('edit-event-ticket-sale_starts_0').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.ticketSaleStart, "2020-02-01 13:24");


		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('edit-event-ticket-sale_ends_0').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.ticketSaleEnd, "2022-02-01 13:24");


		Thread.sleep(1000);

		Select eventType = new Select(GetData.eventType);
		eventType.selectByVisibleText("Music");

		Select eventTopic = new Select(GetData.eventTopic);
		eventTopic.selectByVisibleText("DJ");

		Thread.sleep(1000);

		Click("Please click login button",GetData.tickerIsRecommended);


		Thread.sleep(2000);
		Click("Please click login button",GetData.eventLive);



		Thread.sleep(3000);

	}

	public static void validateCreateEventTestData() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		Thread.sleep(1000);

		Click("Please click login button",GetData.createEventButton);

		Input("Please Enter Password", GetData.eventNameField, "ev123-testautomation");

		Thread.sleep(3000);

		String path = System.getProperty("user.dir")+"/Images/event.jpg";
		System.out.println(path);
		Input("Please Enter Password", GetData.eventImageField, path);
		
		
		
		Thread.sleep(5000);

		WebElement saveImage = GetData.saveImage;
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(saveImage));
		saveImage.click();

		

		Thread.sleep(1000);

		Click("Please click login button",GetData.eventImageSave);


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventLocationOne, "ABC");


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventLocationTwo, "ABC");

		Input("Please Enter Password", GetData.eventLocationThree, "ABC");


		Input("Please Enter Password", GetData.eventLocationSelectCity, "Galway");


		Select eventLocationCountry = new Select(GetData.eventLocationCountry);
		eventLocationCountry.selectByVisibleText("Ireland");

		Thread.sleep(1000);

		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('edit-event-date-start').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.toDateBox, "2021-08-08");

		Thread.sleep(1000);

		((JavascriptExecutor) driver)
				.executeScript("document.getElementById('edit-event-time-start').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.toTimeBox, "13:00");

		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventOrganiserName, "Adrian Wistreich");

		Click("Please click login button",GetData.oragniserDetails);


		
		Thread.sleep(1000);
		Input("Please Enter Password", GetData.organiserEmail, "Adrian@test.com");


		Thread.sleep(1000);

		WebElement paidTicket = GetData.paidTicket;
	
		WebDriverWait wait2 = new WebDriverWait(driver, 120);
		wait2.until(ExpectedConditions.elementToBeClickable(paidTicket));
		paidTicket.click();
		paidTicket.click();

		Input("Please Enter Password", GetData.ticketName, "Early Bird");


		Input("Please Enter Password", GetData.ticketNumber, "600");
		Input("Please Enter Password", GetData.ticketPrice, "15");


		Thread.sleep(1000);

		WebElement ticketSettings = GetData.ticketSettings;

		WebDriverWait wait1 = new WebDriverWait(driver, 100);
		wait1.until(ExpectedConditions.elementToBeClickable(ticketSettings));
		ticketSettings.click();
		ticketSettings.click();

		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('edit-event-ticket-sale_starts_0').removeAttribute('readonly',0);");

		Input("Please Enter Password", GetData.ticketSaleStart, "2020-02-01 13:24");




		
		

		((JavascriptExecutor) driver).executeScript(
				"document.getElementById('edit-event-ticket-sale_ends_0').removeAttribute('readonly',0);");


		Input("Please Enter Password", GetData.ticketSaleEnd, "2022-02-01 13:24");

		Thread.sleep(1000);

		WebElement ticketAddPaymentPlan = driver.findElement(By.xpath("//button[@class='add']"));
		ticketAddPaymentPlan.click();

		Thread.sleep(1000);

		WebElement paymentPlanTitle1 = driver.findElement(By.name("ticket_paymentplan[0][0][title]"));
		paymentPlanTitle1.sendKeys("First");

		Thread.sleep(1000);

		WebElement paymentPlanPercent1 = driver.findElement(By.name("ticket_paymentplan[0][0][payment_amount]"));
		paymentPlanPercent1.sendKeys("50");

		Thread.sleep(1000);

		ticketAddPaymentPlan.click();

		Thread.sleep(1000);

		WebElement paymentPlanTitle2 = driver.findElement(By.name("ticket_paymentplan[0][1][title]"));
		paymentPlanTitle2.sendKeys("Final");

		Thread.sleep(1000);

		WebElement paymentPlanPercent2 = driver.findElement(By.name("ticket_paymentplan[0][1][payment_amount]"));
		paymentPlanPercent2.sendKeys("50");

		Thread.sleep(1000);

		// ((JavascriptExecutor) driver).executeScript("return arguments[0].innerHTML;",
		// driver.findElement(By.xpath("//tr//tr[2]//td[4]//input[2]")));

		WebElement paymentPlanDate = driver.findElement(By.xpath("(//input[contains(@class, 'pp-due_date')])[2]"));
		paymentPlanDate.click();

		Thread.sleep(2000);

		WebElement paymentPlanDateSend = driver.findElement(By.xpath("//body[@id='events']/div[25]/div[1]/div[2]"));
		paymentPlanDateSend.click();

		Thread.sleep(2000);

		WebElement paymentPlanToggle = driver.findElement(By.xpath(
				"//div[@class='toggle btn btn-default off']//label[@class='btn btn-default active toggle-off'][contains(text(),'No')]"));
		paymentPlanToggle.click();

		Thread.sleep(1000);


		Select eventType = new Select(GetData.eventType);
		eventType.selectByVisibleText("Music");

		Select eventTopic = new Select(GetData.eventTopic);
		eventTopic.selectByVisibleText("DJ");

		Thread.sleep(1000);

		Click("Please click login button",GetData.tickerIsRecommended);


		Thread.sleep(2000);
		Click("Please click login button",GetData.eventLive);


		Thread.sleep(25000);

		Assert.assertTrue(driver.getPageSource().contains("Congratulations"));
	}

	public static void validateEmailingAttendeesOfAnEvent() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		Thread.sleep(1000);

		driver.get("http://uticket.test.courseco.co/admin/events");

		Thread.sleep(9000);


		Input("Please Enter Password", GetData.eventsSearchBar, "ev123-t");

		Thread.sleep(9000);

		Click("Please click login button",GetData.eventActions);


		Thread.sleep(5000);
		Click("Please click login button",GetData.sendAttendeesButton);


		Thread.sleep(5000);


		Input("Please Enter Password", GetData.attendeesEmailSubject, "testAutomationSubject");

		Thread.sleep(5000);

		Click("Please click login button",GetData.sendButton);


		Thread.sleep(5000);

		WebElement popBox = driver
				.findElement(By.xpath("//*[@id=\"page-container\"]/div/main/div/div[2]/div/div/div[1]"));
		popBox.isDisplayed();

	}

	public static void validateEndingSalesOfAnEvent() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		driver.get("http://uticket.test.courseco.co/admin/events");


		Thread.sleep(1000);

		Input("Please Enter Password", GetData.eventsSearchBar, "ev123-t");


		Thread.sleep(9000);
		Click("Please click login button",GetData.eventActions);


		Thread.sleep(5000);
		Click("Please click login button",GetData.eventEndSales);


		Thread.sleep(5000);

		Click("Please click login button",GetData.eventConfirmEndSales);


		Thread.sleep(5000);

		WebElement eventGetStatus = driver.findElement(By.xpath("//*[@id=\"list-events-table\"]/tbody/tr/td[5]/a"));
		eventGetStatus.getText();

	}

	public static void validateEventIsPostponed() throws InterruptedException {
		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	
		driver.get("http://uticket.test.courseco.co/admin/events");



		Input("Please Enter Password", GetData.eventsSearchBar, "ev123-t");


		Thread.sleep(9000);
		Click("Please click login button",GetData.eventActions);

		Thread.sleep(5000);

		WebElement eventPostponeButton = driver.findElement(By.xpath(
				"//span[contains(@class, 'icon-calendar-minus-o')]/parent::button"));
		eventPostponeButton.click();

		Thread.sleep(5000);

		WebElement eventUpdateAndEmail = driver.findElement(By.xpath("//*[@id=\"update-email-event-button\"]"));
		eventUpdateAndEmail.click();

		Thread.sleep(1000);

		WebElement updateAndEmailSend = driver
				.findElement(By.xpath("//*[@id=\"email-attendees-modal\"]/div/form/div[3]/div/button[1]"));
		updateAndEmailSend.click();

	}

	public static void validateEventDeletion() throws InterruptedException {

		uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
	

		driver.get("http://uticket.test.courseco.co/admin/events");

		Thread.sleep(40000);

		WebElement eventsSearchBar = driver.findElement(By.xpath("//label[contains(text(),'Search:')]/input"));
		eventsSearchBar.sendKeys("ev123-t");

		Thread.sleep(9000);

		WebElement eventActions = driver
				.findElement(By.xpath("//div[contains(@class, 'dropdown')]/button/span[contains(text(), 'Action')]"));// *[@id="list-events-table"]/tbody/tr/td[10]/div/button
		eventActions.click();

		Thread.sleep(5000);

		WebElement eventDeleteButton = driver
				.findElement(By.xpath("//*[contains(text(), 'Delete')]"));
		eventDeleteButton.click();

		Thread.sleep(5000);

		WebElement eventConfirmDelete = driver.findElement(By.xpath("//*[contains(@id, 'delete-event-button')]"));
		eventConfirmDelete.click();

		Thread.sleep(15000);

		WebElement popBoxDelete = driver
				.findElement(By.xpath("//*[@id=\"page-container\"]/div/main/div/div[2]/div/div/div[1]"));
		popBoxDelete.isDisplayed();
//
	}

}
