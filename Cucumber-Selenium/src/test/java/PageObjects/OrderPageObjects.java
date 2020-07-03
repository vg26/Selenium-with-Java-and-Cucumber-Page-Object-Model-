package PageObjects;

import org.openqa.selenium.By;

public class OrderPageObjects {

	//locating proceed to checkout button in summary
		public static By proceed1 = By.xpath("//div[@id='center_column']//a[@title='Proceed to checkout']/span");
	
	//locating proceed to checkout button in address
		public static By proceed2 = By.xpath("//div[@id='center_column']/form[@action='http://automationpractice.com/index.php?controller=order']//button/span");
		
	//locating checkbox in shipping
		public static By checkboxTerms = By.xpath("/html//input[@id='cgv']");
			
	//locating proceed to checkout button in shipping
		public static By proceed3 = By.xpath("//form[@id='form']//button[@name='processCarrier']/span");
			
	//locating pay by bank wire button
		public static By payButton = By.xpath("/html//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']");
		
	//locating confirm order button
		public static By ConfirmOrder = By.xpath("//p[@id='cart_navigation']//span");
}
