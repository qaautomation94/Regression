package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Master.RegressionExecution;
import junit.framework.Assert;


public class Profiles extends RegressionExecution {

	// The below account is created on AUTH and Deleted on this class.

	public static void validateLValidLogin() throws InterruptedException {


	}

	public static void validateProfileFeatures() throws InterruptedException {

		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());

		driver.get("http://uticket.test.courseco.co/admin/profile/edit?section=contact");
		Thread.sleep(15000);
		WebElement address = driver.findElement(By.xpath("//a[contains(., 'Address')]"));
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(address));

		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(., 'Address')]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(., 'Payments')]")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//a[contains(., 'Password')]")).isDisplayed());


	}

	public static void validateProfileStripeConnecting() throws InterruptedException {
		test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());


		driver.get("http://uticket.test.courseco.co/admin/profile/edit?section=payments");

	}

	public static void validateProfileDataDeletion() throws InterruptedException {
		Thread.sleep(10000);

		driver.get("http://uticket.test.courseco.co/admin/profile/");



		WebElement saveImage = driver.findElement(By.xpath("//button[contains(text(), 'Delete My Data')]"));
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(saveImage));
		saveImage.click();

		
//		WebElement DeleteMyProfileButton = driver.findElement(By.xpath("//button[contains(text(), 'Delete My Data')]"));
//		DeleteMyProfileButton.click();

		Thread.sleep(5000);

		WebElement confirmDeleteButton = driver.findElement(By.xpath("//button[contains(@id, 'delete-profile-button')]"));
		confirmDeleteButton.click();

		Thread.sleep(7000);

//		WebElement confirmDeleteMessage = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]"));
//		confirmDeleteMessage.isDisplayed();

	}

}