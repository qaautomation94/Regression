
package TestCases;


import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.uTicketsLocatiors;
import PageFactoryandTestdata.HelpingFunction;
import PageFactoryandTestdata.uTicketTestData;


public class Login extends HelpingFunction  {


				public static  void login(boolean bol) throws InterruptedException, AWTException, IOException{
						
						
					uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
					test = extent.createTest(new Exception().getStackTrace()[1].getMethodName());
					driver.get(envirnment);
					Thread.sleep(10000);
					Click("Please click login button",GetData.loginbButton);
					Thread.sleep(50000);
					if(bol) {

						Input("Please Enter Password", GetData.emailField, Email);

						Thread.sleep(1000);
						GetData.emailField.sendKeys(Keys.TAB);
						//Input("Please Enter Password", GetData.emailField, Keys.TAB);

						Input("Please Enter Password", GetData.loginpassword, password);

						Click("Please click login button",GetData.loginButtonSubmit);

						Thread.sleep(15000);
					}
					else {
						Input("Please Enter Password", GetData.emailField, uTicketTestData.USER);

						Thread.sleep(1000);
						GetData.emailField.sendKeys(Keys.TAB);
						//Input("Please Enter Password", GetData.emailField, Keys.TAB);

						Input("Please Enter Password", GetData.loginpassword, uTicketTestData.PASS);

						Click("Please click login button",GetData.loginButtonSubmit);
						Thread.sleep(15000);

					}
				

					
					
			
				}
				
}

