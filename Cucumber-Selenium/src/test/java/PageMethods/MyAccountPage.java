package PageMethods;

import org.openqa.selenium.WebDriver;
import PageObjects.MyAccountObjects;

public class MyAccountPage extends MyAccountObjects {
	
	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		  this.driver = driver; }

	//clicking the woman menu button
	   public void clickwoman(){
		   		driver.findElement(womanmenu).click() ; }}
