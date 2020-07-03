package StepDefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import Environment.EnvironmentVars;
import PageMethods.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchSteps extends EnvironmentVars {
	
	WebDriver driver = browsersetup(); {}
	
	@Given("^User is on homepage$")
		public void user_is_on_homepage() {
			String actualTitle=driver.getTitle();
			String expectedTitle = "My Store";
			assertEquals( actualTitle, expectedTitle);}
	
	@When("^User writes t-shirts in search$")
		public void user_writes_shirts_in_search() throws InterruptedException {
			Thread.sleep(4000);
			HomePage home = new HomePage(driver);	
			home.fillSearch(); }
	@And("^Click the search button$")
		public void click_the_search_button() {
			HomePage home = new HomePage(driver);	
			home.clickSearch();}

	@Then("^Matching products are shown$")
		public void matching_products_are_shown() {
			assertTrue(driver.getPageSource().contains("shirts")); }}
