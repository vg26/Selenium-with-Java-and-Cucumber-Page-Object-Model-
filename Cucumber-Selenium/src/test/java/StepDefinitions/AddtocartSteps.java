package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import Environment.EnvironmentVars;
import PageMethods.HomePage;
import PageMethods.MyAccountPage;
import PageMethods.ProductsPage;
import PageMethods.SigninPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtocartSteps extends EnvironmentVars {
	
	WebDriver driver = browsersetup(); {}
	 
	@Given("^User is already signed in$")
	public void user_is_already_signed_in()  {
		HomePage hp = new HomePage(driver);
		SigninPage sp = new SigninPage(driver);
		hp.clicksignin();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		sp.fillemail();
		sp.fillpassword();
		sp.clickbutton();}

	@And("^User is on MyAccount page$")
	public void user_is_on_MyAccount_page()  {
		String actualTitle=driver.getTitle();
		String expectedTitle = "My account - My Store";
		assertEquals( actualTitle, expectedTitle);}
		
	@When("^I click on the woman menu$")
	public void i_click_on_the_woman_menu()  {
		MyAccountPage map = new MyAccountPage(driver);
		map.clickwoman();}

	@And("^I'm on the products page$")
	public void i_m_on_the_products_page() {
		String actualTitle=driver.getTitle();
		String expectedTitle = "Women - My Store";
		assertEquals( actualTitle, expectedTitle);}
	
	@Then("^I will add product to cart$")
	public void i_will_add_product_to_cart() throws InterruptedException  {
		Thread.sleep(5000);
		ProductsPage pp = new ProductsPage(driver);
		pp.addproduct();
	  pp.continueshopping();
	}}
