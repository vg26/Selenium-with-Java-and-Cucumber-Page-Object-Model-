package PageObjects;

import org.openqa.selenium.By;

public class ProductsPageObjects {
	
	
//locating product 
public static	By product1 = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[2]/h5/a");

//locating cart
public static By cart = By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']");

//locating continue to shop button
public static By continueshop = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span");
	
//locating proceed to checkout button
public static By proceedtocheckout = By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span");
}