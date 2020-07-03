package PageObjects;

import org.openqa.selenium.By;

public class SigninObjects {

	//locating email field
	public static By emailaddress = By.xpath("//*[@id=\"email\"]");
	
	//locating password field
	public static By password = By.xpath("//*[@id=\"passwd\"]");
	
	//locating signin button
	public static By signinclick = By.xpath("//*[@id=\"SubmitLogin\"]/span"); 
	
	// Id value
	public static String username = "vgulab@hotmail.com" ;
	
	//password value
	public static String pass = "vgulab"; 

}
