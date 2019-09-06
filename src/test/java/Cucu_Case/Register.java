package Cucu_Case;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Register {
	
	WebDriver driver;
	
	
	@Given("User open the application")
	public void user_open_the_application() {
		
		System.setProperty("webdriver.chrome.driver","C:\\shan\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
	}

	@When("User click sign_up button to register")
	public void user_click_sign_up_button_to_register() {
	    
		driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("User enters the username as {string}")
	public void user_enters_the_username_as(String a) {
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(a);
	}

	@When("User enters first name as {string}")
	public void user_enters_first_name_as(String b) {
	   
		 driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys(b);
	}

	@When("User enters last name as {string}")
	public void user_enters_last_name_as(String c) {
	   
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys(c);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String d) {
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(d);
	}

	@When("User enters confirm password as {string}")
	public void user_enters_confirm_password_as(String e) {
	   
		 driver.findElement(By.xpath("//*[@id='pass_confirmation']")).sendKeys(e);
	}

	@When("User enters gender as Male")
	public void user_enters_gender_as_Male() {
		  driver.findElement(By.xpath("//input[@value='Male']")).click();
	}

	@When("User enters e-mail as {string}")
	public void user_enters_e_mail_as(String f) {
	   
		 driver.findElement(By.xpath("//*[@id='emailAddress']")).sendKeys(f);
	}

	@When("User enters mobileNumber as {string}")
	public void user_enters_mobileNumber_as(String g) {
	    
		driver.findElement(By.xpath("//*[@id='mobileNumber']")).sendKeys(g);
	}

	@When("User enters dob as {string}")
	public void user_enters_dob_as(String i) {
	    
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys(i);
	}

	@When("User enters address as {string}")
	public void user_enters_address_as(String j) {
	    
		driver.findElement(By.xpath("//*[@id='address']")).sendKeys(j);
	}

	@When("User enters security question as {string}")
	public void user_enters_security_question_as(String k) {
	    
		 WebElement que=driver.findElement(By.xpath("//*[@id='securityQuestion']"));
		 Select f=new Select(que);
		 f.selectByVisibleText(k);
	}

	@When("User enters answer as {string}")
	public void user_enters_answer_as(String l) {
		
		driver.findElement(By.xpath("//*[@id='answer']")).sendKeys(l);
	}


	@And("User click register button")
	public void user_click_register_button() {
		
		 driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	   
	}

	@And("Login Page will display")
	public void login_Page_will_display() {
		
		Assert.assertEquals(driver.getTitle(), "Login");
	    
	}
	
	@And("user opens the application")
	public void user_opens_the_application() {
	    
		System.setProperty("webdriver.chrome.driver","C:\\shan\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@And("user enters the {string}")
	public void user_enters_the(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	    
	}

	@And("user enters the pwd {string}")
	public void user_enters_the_pwd(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}


	@Then("user clicks the Login")
	public void user_clicks_the_Login() {
		
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		Assert.assertEquals(driver.getTitle(), "Home");
		
	}
	
	@When("user type first four letter of search product as {string}")
	public void user_type_first_four_letter_of_search_product_as(String string) {

		driver.findElement(By.xpath("//*[@id=\'myInput\']")).sendKeys(string);
		//obj
		//obj.sendKeys(Keys.ARROW_DOWN);
		//obj.sendKeys(Keys.ENTER);
	
	}

	@When("user select the shown product")
	public void user_select_the_shown_product() {
	    
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@Then("user add items into the cart")
	public void user_add_items_into_the_cart() {
	    
		driver.findElement(By.linkText("Add To cart")).click();
		Assert.assertEquals(driver.getTitle(), "Search");
		driver.close();
	}

}
