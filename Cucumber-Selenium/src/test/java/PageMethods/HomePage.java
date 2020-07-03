package PageMethods;

import org.openqa.selenium.WebDriver;
import PageObjects.HomePageObjects;

public class HomePage extends HomePageObjects {
	
	 WebDriver driver;
	
	public HomePage(WebDriver driver) {
		  this.driver = driver; }
		  	
	// Method to click SignIn Button
    	public void clicksignin(){
    		driver.findElement(signin).click() ; }
	
    // method to fill in search box
		public void fillSearch() {
			driver.findElement(searchbox).sendKeys(searchquery);	}

	// method to click search button
		public void clickSearch() {
			driver.findElement(searchbutton).click();}	}
	
	
	
	
	
	
	
	
	
	






		

	  
	  
		
		
		
		
		
		
		
		




