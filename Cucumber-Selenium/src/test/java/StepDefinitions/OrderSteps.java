package StepDefinitions;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Environment.EnvironmentVars;
import PageMethods.HomePage;
import PageMethods.MyAccountPage;
import PageMethods.OrderPageMethods;
import PageMethods.ProductsPage;
import PageMethods.SigninPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderSteps extends EnvironmentVars {
	
	WebDriver driver = browsersetup(); {}

	@Given("^User is already signed in on page$")
		public void user_is_already_signed_in() {
			HomePage homePage = new HomePage(driver);
			SigninPage signinPage = new SigninPage(driver);
			homePage.clicksignin();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			signinPage.fillemail();
			signinPage.fillpassword();
			signinPage.clickbutton();
			String actualTitle=driver.getTitle();
			String expectedTitle = "My account - My Store";
			assertEquals( actualTitle, expectedTitle);}
	
	@And("^User has already added a product to the cart$")
		public void user_has_already_added_a_product_to_the_cart() throws InterruptedException {
			MyAccountPage myaccount = new MyAccountPage(driver);
			myaccount.clickwoman();
			String actualTitle=driver.getTitle();
			String expectedTitle = "Women - My Store";
			assertEquals( actualTitle, expectedTitle);
			Thread.sleep(5000);
			ProductsPage productpage = new ProductsPage(driver);
			productpage.addproduct();}
	
	@When("^User proceed to checkout$")
		public void user_proceed_to_checkout() {
			ProductsPage productpage = new ProductsPage(driver);
			productpage.proceedToCheckout();}
			
	@And("^User fill in all necessary information$")
		public void user_fill_in_all_necessary_information() {
			OrderPageMethods op = new OrderPageMethods(driver); 
			op.checkout();
			op.clickPayButton();
			op.confirmOrder();}
			
	@Then("^User will create order$")
		public void user_will_create_order() {
			String expectedText = "Your order on My Store is complete.";
			String pageText = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong")).getText();
			assertEquals( expectedText, pageText); }}
	
	
	

