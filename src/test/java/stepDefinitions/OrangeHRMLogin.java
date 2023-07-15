package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;

public class OrangeHRMLogin
{
WebDriver driver;
 LoginPage objLoginPage=new LoginPage();
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser()
	{
	   driver=new ChromeDriver();
	   
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
	   driver.get(url);
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password)
	{
		
	driver.findElement(objLoginPage.objName(username)).sendKeys(username);	
	
	driver.findElement(objLoginPage.objName(password)).sendKeys(password);   
	}

	@When("Click on Login button")
	public void click_on_login_button() 
	{
	   driver.findElement(objLoginPage.login).click(); 
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expTitle) 
	{
	    String actTitle=driver.getTitle();
	    
	    Assert.assertEquals(expTitle, actTitle);
	}
	@When("Click on PIM link")
	public void click_on_pim_link()
	{
		driver.findElement(objLoginPage.objPIM).click();
		
	}

	
	
}
