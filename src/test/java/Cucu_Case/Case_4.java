package Cucu_Case;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class Case_4 {
	
	WebDriver driver;
	
	@Given("User open the web application")
	public void user_open_the_web_application() {

		System.setProperty("webdriver.chrome.driver","C:\\shan\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	}

	@And("User search for the product")
	public void user_search_for_the_product() {
	    
		WebElement obj=driver.findElement(By.xpath("//*[@id=\'myInput\']"));
		obj.sendKeys("Head");
		//obj.sendKeys(Keys.ARROW_DOWN);
		//obj.sendKeys(Keys.ENTER);
		//obj.sendKeys(Keys.ENTER);
	}

	@And("User clicks add to cart button")
	public void user_clicks_add_to_cart_button() {
	    
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		driver.findElement(By.linkText("Add to cart")).click();
	}

	@Then("page redirects to login page")
	public void page_redirects_to_login_page() {
	    
		Assert.assertEquals(driver.getTitle(), "Login");
		driver.close();
	}



}
