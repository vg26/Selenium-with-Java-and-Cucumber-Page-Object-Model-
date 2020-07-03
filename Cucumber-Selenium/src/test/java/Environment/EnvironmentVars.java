package Environment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EnvironmentVars {

		WebDriver driver;
		public static int browser=2;
		public String baseUrl = "http://automationpractice.com/index.php";
		  
		public WebDriver browsersetup()  {
			
			if(browser == 1){
				System.setProperty("webdriver.gecko.driver", "c:\\\\Testing Tools\\\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.navigate().to(baseUrl);}
			else if(browser == 2){
				System.setProperty("webdriver.chrome.driver","c:\\\\Testing Tools\\\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.navigate().to(baseUrl); }
				return driver;}}
