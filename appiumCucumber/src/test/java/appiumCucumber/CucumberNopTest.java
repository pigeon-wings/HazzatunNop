package appiumCucumber;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;





public class CucumberNopTest {

	  private AppiumDriver driver;
	

//	@Given("Mike is on the home page after opening the nopCart mobile app")
//	@SuppressWarnings("deprecation")
//	public void openApp() {
//		DesiredCapabilities cap= new DesiredCapabilities();
//		cap.setCapability("appium:deviceName", "V94");
//		cap.setCapability("appium:udid", "LAAP1909003552");
//		cap.setCapability("appium:platformName", "Android");
//		cap.setCapability("appium:platformVersion", "8.1.0");
//		
//		cap.setCapability("appium:appPackage", "com.nopstation.nopcommerce.nopstationcart");
//		cap.setCapability("appium:appActivity", "com.bs.ecommerce.main.SplashScreenActivity");	
//		cap.setCapability("appium:noReset", true);
//		cap.setCapability("appium:automationName", "UiAutomator2");
//		cap.setCapability("appium:ignoreHiddenApiPolicyError", true);
//		
//
//		try {
//		URL urL=new URL("http://127.0.0.1:4723/wd/hub");
//			 driver = new AppiumDriver(urL, cap);
//			 System.out.println("App Started");
//			// String sessionId=driver.getSessionId().toString();
//
//			} catch (Exception e) {
//
//			System.out.println(e.getMessage());
//
//			}
//
//		try {
//			Thread.sleep(3000);
//			System.out.println("this is Homepage");
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}
//	
//	
//	@When("Mike clicks electronics from OUR CATEGORIES list from home page")
//	public void select_electroninc_from_cat() {
//		 System.out.println("Started step1");
//		WebElement element1 =driver.findElement(By.xpath("//*[@id='ivProductThumb' and ./parent::*[@id='card' and (./preceding-sibling::* | ./following-sibling::*)[@text='Electronics']]]"));
//		element1.click();
//		   System.out.println("this is Electronincs page");
//	}
//	@Then("the user closes the app")
//	public void user_close_the_app()
//	{
//		driver.quit();
//	}
//	
	
	
	// New code added
	 @Given("Mike on home page after opening nopCart mobile app")
	 public void mike_on_home_page_after_opening_nop_cart_mobile_app() {
	     // Write code here that turns the phrase above into concrete actions
	   
		 DesiredCapabilities cap= new DesiredCapabilities();
			cap.setCapability("appium:deviceName", "V94");
			cap.setCapability("appium:udid", "LAAP1909003552");
			cap.setCapability("appium:platformName", "Android");
			cap.setCapability("appium:platformVersion", "8.1.0");
			
			cap.setCapability("appium:appPackage", "com.nopstation.nopcommerce.nopstationcart");
			cap.setCapability("appium:appActivity", "com.bs.ecommerce.main.SplashScreenActivity");	
			cap.setCapability("appium:noReset", true);
			cap.setCapability("appium:automationName", "UiAutomator2");
			cap.setCapability("appium:ignoreHiddenApiPolicyError", true);
			
	
			try {
			URL urL=new URL("http://127.0.0.1:4723/wd/hub");
				 driver = new AndroidDriver(urL, cap);
				 System.out.println("App Started");
				// String sessionId=driver.getSessionId().toString();
	
				} catch (Exception e) {
	
				System.out.println(e.getMessage());
	
				}
	
			try {
				Thread.sleep(3000);
				System.out.println("this is Homepage");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     

	 }
	 @When("Mike clicks electronics from OUR CATEGORIES list from home page")
	 public void mike_clicks_from_list_from_home_page() {
	     // Write code here that turns the phrase above into concrete actions
		 DesiredCapabilities capa = new DesiredCapabilities();
			capa.setCapability("appium:udid", "LAAP1909003552");
			capa.setCapability("appium:platformName", "Android");
			capa.setCapability("appium:platformVersion", "8.1.0");
			//capa.setCapability("appium:appActivity", "com.bs.ecommerce.main.SplashScreenActivity");	
		 URL urL;
		try {
			urL = new URL("http://127.0.0.1:4723/wd/hub");
	
		 driver = new AndroidDriver(urL, capa);
		 System.out.println("Started step1");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      WebElement electronicsButton = driver.findElement(By.xpath("//*[contains(@text, 'OUR CATEGORIES')]"));
	      electronicsButton.click();
	      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	        // You may need to add additional steps to navigate to the electronics category.
	        // For example, if there is a list of categories, locate the "Electronics" category and click on it.
	        WebElement electronicsCategory = driver.findElement(By.xpath("//*[contains(@text, 'Electronics')]"));
	        electronicsCategory.click();

			System.out.println("this is Electronincs page");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	 }

	 @When("Mike click to Mattress Bedroom product details page")
	 public void mike_click_to_Mattress_Bedroom_product_details_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	   
	 }

	 @When("Mike click plus button to increase Qty by 2")
	 public void mike_click_plus_button_to_increase_Qty_by(int arg1) throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	
	 }

	 @Then("Mike click add to cart button to add the product in his cart")
	 public void mike_click_add_to_cart_button_to_add_the_product_in_his_cart() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	    
	 }

	 @Given("Mike go to shopping cart by clicking top cart icon")
	 public void mike_go_to_shopping_cart_by_clicking_top_cart_icon() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	    
	 }

	 @When("Mike click checkout button from shopping cart page")
	 public void mike_click_checkout_button_from_shopping_cart_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions

	 }

	 @When("Mike select checkout as guest from shopping cart page")
	 public void mike_select_checkout_as_guest_from_shopping_cart_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	
	 }

	 @Then("Mike input all the details in checkout billing details page and click continue")
	 public void mike_input_all_the_details_in_checkout_billing_details_page_and_click_continue() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions

	 }

	 @Then("Mike select Next Day Air as shipping method and click continue")
	 public void mike_select_Next_Day_Air_as_shipping_method_and_click_continue() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions

	 }

	 @Then("Mike select Check-Money Order as payment method and click continue")
	 public void mike_select_Check_Money_Order_as_payment_method_and_click_continue() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	  
	 }

	 @Then("Mike click next button on payment information page")
	 public void mike_click_next_button_on_payment_information_page() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	
	 }

	 @Then("Mike click confirm button to place the order")
	 public void mike_click_confirm_button_to_place_the_order() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions
	
	 }

	 @Then("Verify order place successfully with popup message Your order has been successfully processed!")
	 public void verify_order_place_successfully_with_popup_message_Your_order_has_been_successfully_processed() throws Throwable {
	     // Write code here that turns the phrase above into concrete actions

	 }

	 @Then("User closes the app")
	 public void user_closes_the_app() throws Throwable {
		 DesiredCapabilities capa = new DesiredCapabilities();
			capa.setCapability("appium:udid", "LAAP1909003552");
			capa.setCapability("appium:platformName", "Android");
			capa.setCapability("appium:platformVersion", "8.1.0");
			
			
		 URL urL=new URL("http://127.0.0.1:4723/wd/hub");
		 driver = new AndroidDriver(urL, capa);
		 // Write code here that turns the phrase above into concrete actions
		 driver.quit();
	 }



}
