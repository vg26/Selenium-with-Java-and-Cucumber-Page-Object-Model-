package PageMethods;

import org.openqa.selenium.WebDriver;
import PageObjects.OrderPageObjects;

public class OrderPageMethods extends OrderPageObjects  {

	WebDriver driver;
	
	public OrderPageMethods(WebDriver driver) {
		  this.driver = driver; }
	
	//proceeding to checkout
		public void checkout() {
			driver.findElement(proceed1).click();
			driver.findElement(proceed2).click();
			driver.findElement(checkboxTerms).click();
			driver.findElement(proceed3).click();}
	
	//clicking the pay button
		public void clickPayButton() {
			driver.findElement(payButton).click();;}
	
	//confirming the order
		public void confirmOrder() {
			driver.findElement(ConfirmOrder).click();}}
			
