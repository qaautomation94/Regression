package PageFactoryandTestdata;

import java.util.Date;

import org.openqa.selenium.Keys;


public class uTicketTestData {

	public static String Banme="Chrome"; 
	public static String dev ="http://childrensplacedev.prod.acquia-sites.com/";
	public static String test ="http://uticket.test.courseco.co/home.html";

// SITA Credencials
	public static String USER="qa@courseco.co"; 
	public static String PASS="CCqa2020";
	
		
	//Company Creation Info
	
	static Date date = new Date();
	public static String Company="Auto "+date.toString();

	

}








