package TestCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactoryandTestdata.uTicketsLocatiors;
import PageFactoryandTestdata.HelpingFunction;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.fasterxml.jackson.databind.ObjectMapper;


public class StartBrowser extends HelpingFunction {


				public static void StartupBrowser(String Suite) throws InterruptedException, AWTException, IOException{
					uTicketsLocatiors GetData=PageFactory.initElements(driver, uTicketsLocatiors.class);
				 
					
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("-incognito");
				  	options.addArguments("--disable-popup-blocking");
				  	options.addArguments("--disable-extensions");
				  	options.addArguments();
				 	options.addArguments("--start-maximized");
				 	options.addArguments("--headless");
				 	options.addArguments("--no-sandbox");
				 	options.addArguments("--disable-dev-shm-usage");
				 	
				 	options.setPageLoadStrategy(PageLoadStrategy.NONE);
				// 	options.addArguments("--start-fullscreen");
				  	driver = new ChromeDriver(options);
				 	driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
					driver.get("http://uticket.test.courseco.co/home.html");
					
					
/*
					
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--test-type");
					options.addArguments("--headless");
					options.addArguments("--disable-extensions"); //to disable browser extension popup
					
					ChromeDriverService driverService = ChromeDriverService.createDefaultService();
					 driver = new ChromeDriver(driverService, options);
					
					Map<String, Object> commandParams = new HashMap<>();
					commandParams.put("cmd", "Page.setDownloadBehavior");
					Map<String, String> params = new HashMap<>();
					params.put("behavior", "allow");
					String sUser = System.getProperty("user.dir");
			        downloadPath = sUser;
			     //   downloadPath = "C:\\Users\\" + sUser + "\\Downloads\\Abc";

			        
					params.put("downloadPath", downloadPath);
					commandParams.put("params", params);
					ObjectMapper objectMapper = new ObjectMapper();
					HttpClient httpClient = HttpClientBuilder.create().build();
					String command = objectMapper.writeValueAsString(commandParams);
					String u = driverService.getUrl().toString() + "/session/" + ((RemoteWebDriver) driver).getSessionId() + "/chromium/send_command";
					HttpPost request = new HttpPost(u);
					request.addHeader("content-type", "application/json");
					request.setEntity(new StringEntity(command));
					httpClient.execute(request);
				 	driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
					driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
					driver.get("http://uticket.test.courseco.co/home.html");
	*/
					}
			
			}







