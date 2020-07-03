package PageObjects;

import org.openqa.selenium.By;

public class HomePageObjects {
	
		//locating sign in
		public static By signin =By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']");

		//locating search field
		public static By searchbox = By.xpath("/html//input[@id='search_query_top']");
		
		//locating search button
		public static By searchbutton = By.xpath("//form[@id='searchbox']/button[@name='submit_search']");
		
		//search query
		public static String searchquery = "t-shirts" ;
		
}









