package PageMethods;

import org.openqa.selenium.WebDriver;
import PageObjects.SigninObjects;

public class SigninPage extends SigninObjects {
	
	 WebDriver driver;

	 public SigninPage(WebDriver driver) {
		  this.driver = driver; }

	// Method to type email
	public void fillemail() {
		driver.findElement(emailaddress).sendKeys(username) ; }
	
	// Method to type Password
    public void fillpassword(){ 
		driver.findElement(password).sendKeys(pass);}
 
    // Method to click SignIn Button
    public void clickbutton(){
		driver.findElement(signinclick).click() ; }}
	
    
		