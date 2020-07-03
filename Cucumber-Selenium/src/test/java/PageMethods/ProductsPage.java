package PageMethods;

import org.openqa.selenium.WebDriver;
import PageObjects.ProductsPageObjects;

public class ProductsPage extends ProductsPageObjects {

	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		  this.driver = driver; }
	
	//adding product to cart
	public void addproduct() throws InterruptedException  {
		
		driver.findElement(product1).click();
		driver.findElement(cart).click();}
	
	//continue shopping
	public void continueshopping() {
		driver.findElement(continueshop).click(); }

	//proceed to checkout
	public void proceedToCheckout() {
		driver.findElement(proceedtocheckout).click();}}
	


