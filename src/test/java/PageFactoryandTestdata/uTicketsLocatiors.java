package PageFactoryandTestdata;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Master.RegressionExecution;



public class uTicketsLocatiors extends RegressionExecution{
	

	@FindBy(xpath="//a[contains(text(), 'Log in / Sign up')]") public WebElement loginbButton;
	@FindBy(xpath="//a[contains(@href, 'login-tab-signup')]") public WebElement signupButton;
	@FindBy(xpath="//input[contains(@id, 'first-name')]") public WebElement firstNameField;
	@FindBy(xpath="//input[contains(@id, 'last-name')]") public WebElement lastNameField;
	@FindBy(xpath="//input[contains(@id, 'login-email')]") public WebElement emailField;
	@FindBy(xpath="//input[contains(@id, 'email')]") public WebElement signupemail;
	@FindBy(xpath="//input[contains(@id, 'login-password')]") public WebElement loginpassword;
	@FindBy(xpath="//td[contains(@data-label, 'User ID')]/a") public WebElement fieldToClick;
	@FindBy(xpath="//a[contains(@href, '/admin/events/edit_event/new')]") public WebElement createEventButton;
	@FindBy(xpath="//input[contains(@id, 'pswd')]") public WebElement passwordField;
	@FindBy(xpath="//button[contains(@id, 'sign_up_button')]") public WebElement signupButtons;
	@FindBy(xpath="//input[contains(@type, 'submit')]") public WebElement loginButtonSubmit;

	@FindBy(xpath="//input[contains(@aria-controls, 'users_table')]") public WebElement searchField;
	@FindBy(xpath="//input[contains(@id, 'edit-event-name')]") public WebElement eventNameField;
	@FindBy(xpath="//input[contains(@name, 'event_image')]") public WebElement eventImageField;
	@FindBy(xpath="//input[contains(@id, 'edit-event-web_address_url')]") public WebElement eventurl;
	@FindBy(xpath="//a[contains(@id, 'image-edit-save')]") public WebElement saveImage;
	@FindBy(xpath="//h3[contains(text(), 'Edit Image')]/preceding-sibling::button") public WebElement eventImageSave;
	@FindBy(xpath="//input[contains(@placeholder, 'Venue Name *')]") public WebElement eventLocationOne;
	@FindBy(xpath="//input[contains(@placeholder, 'Address Line 1 *')]") public WebElement eventLocationTwo;
	@FindBy(xpath="//input[contains(@placeholder, 'Address Line 2')]") public WebElement eventLocationThree;
	@FindBy(xpath="//input[contains(@placeholder, 'Town/City *')]") public WebElement eventLocationSelectCity;
	@FindBy(xpath="//select[contains(@id, 'edit-event-venue-country')]") public WebElement eventLocationCountry;
	@FindBy(id="edit-event-date-start") public WebElement toDateBox;
	@FindBy(id="edit-event-time-start") public WebElement toTimeBox;
	@FindBy(id="edit-event-organizer-contact-name") public WebElement eventOrganiserName;
	@FindBy(xpath="//button[contains(text(), 'Add Organiser Contact Details')]") public WebElement oragniserDetails;
	@FindBy(xpath="//input[contains(@id, 'edit-event-organizer-email')]") public WebElement organiserEmail;
	@FindBy(xpath="//button[contains(text(), ' Paid Ticket')]") public WebElement paidTicket;
	@FindBy(xpath="//input[contains(@placeholder, 'Early Bird')]") public WebElement ticketName;
	@FindBy(xpath="//input[contains(@name, 'ticket_quantity[0]')]") public WebElement ticketNumber;
	@FindBy(xpath="//input[contains(@name, 'ticket_price')]") public WebElement ticketPrice;
	@FindBy(xpath="//button[contains(text(), 'Ticket Settings')]") public WebElement ticketSettings;
	@FindBy(id="edit-event-ticket-sale_starts_0") public WebElement ticketSaleStart;
	@FindBy(id="edit-event-ticket-sale_ends_0") public WebElement ticketSaleEnd;
	@FindBy(xpath="//select[contains(@id, 'edit-event-event_type')]") public WebElement eventType;
	@FindBy(xpath="//select[contains(@id, 'edit-event-event_topic')]") public WebElement eventTopic;
	@FindBy(xpath="(//label[contains(@class, 'toggle-off')])[2]") public WebElement tickerIsRecommended;
	@FindBy(xpath="//button[contains(text(), 'Make Your Event Live')]") public WebElement eventLive;
	@FindBy(xpath="//label[contains(text(),'Search:')]//input") public WebElement eventsSearchBar;
	@FindBy(xpath="//div[contains(@class, 'dropdown')]/button/span[contains(text(), 'Action')]") public WebElement eventActions;
	@FindBy(xpath="//button[contains(text(), ' Email Attendees')]") public WebElement sendAttendeesButton;
	@FindBy(xpath="//input[contains(@name, 'subject')]") public WebElement attendeesEmailSubject;
	@FindBy(xpath="//button[contains(text(), 'Send')]") public WebElement sendButton;
	@FindBy(xpath="//button[contains(text(), 'End Ticket Sales')]") public WebElement eventEndSales;
	@FindBy(xpath="//button[contains(text(), 'End Sale')]") public WebElement eventConfirmEndSales;
	@FindBy(xpath="//span[contains(@class, 'icon-calendar-minus-o')]/parent::button") public WebElement eventPostponeButton;
	@FindBy(xpath="//*[@id=\"update-email-event-button\"]") public WebElement eventUpdateAndEmail;
	@FindBy(xpath="//*[@id=\"email-attendees-modal\"]/div/form/div[3]/div/button[1]") public WebElement updateAndEmailSend;
	@FindBy(xpath="//select[contains(@name, 'item')]") public WebElement ticketCount;
	@FindBy(xpath="//button[contains(text(), 'Continue')]") public WebElement continueButton;



	@FindBy(xpath="//input[contains(@name, 'cardnumber')]") public WebElement ccNumber;
	@FindBy(xpath="//input[contains(@autocomplete, 'cc-exp')]") public WebElement ccExp;
	@FindBy(xpath="//input[contains(@autocomplete, 'cc-csc')]") public WebElement ccCCV;

	@FindBy(xpath="//input[contains(@placeholder, 'First name:*')]") public WebElement firstName;
	@FindBy(xpath="//input[contains(@name, 'last_name')]") public WebElement lastName;
	@FindBy(xpath="//input[contains(@id, 'checkout-email')]") public WebElement emailAddress;

	

	@FindBy(xpath="//input[contains(@id, 'use_payment_plan_no')]") public WebElement payFull;
	@FindBy(xpath="//input[contains(@id, 'checkout-address1')]") public WebElement addressOne;
	@FindBy(xpath="//input[contains(@id, 'checkout-town')]") public WebElement addressTown;

	@FindBy(xpath="//input[contains(@id, 'checkout-terms_and_conditions')]/following-sibling::span") public WebElement understandTerms;
	@FindBy(xpath="//input[contains(@id , 'checkout-group_booking-terms_and_conditions')]/following-sibling::span") public WebElement agreeTerms;
	@FindBy(xpath="//button[contains(@id, 'continue_chkout_btn')]") public WebElement completeBookings;


	
	
}




