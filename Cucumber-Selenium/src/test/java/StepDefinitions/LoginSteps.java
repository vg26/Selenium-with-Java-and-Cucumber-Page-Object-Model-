package StepDefinitions;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import Environment.EnvironmentVars;
import PageMethods.HomePage;
import PageMethods.SigninPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends EnvironmentVars { 
	
	WebDriver driver = browsersetup();  {}
	
	@Given("^User is on Home Page$")
		public void user_is_on_Home_Page()     {	
			String url = baseUrl;
			Assert.assertTrue(driver.getCurrentUrl().contains(url));
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);}

	@When("^User Navigate to LogIn Page$") 
		public void user_Navigate_to_LogIn_Page()  {
			HomePage nav = new HomePage(driver);	
			nav.clicksignin(); }
    
	@When("^User enters UserName and Password$")
		public void user_enters_UserName_and_Password() {
			SigninPage sip = new SigninPage(driver);	
			sip.fillemail();
			sip.fillpassword();
			sip.clickbutton(); }

	@Then("^User should see MyAccount$")
		public void user_should_see_MyAccount()  {
			String actualTitle=driver.getTitle();
			String expectedTitle = "My account - My Store";
			assertEquals( actualTitle, expectedTitle);
	
	}}

