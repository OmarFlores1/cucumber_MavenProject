package simpleMaven.simple3;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class google {
	WebDriver driver;
	String url= "http://google.com";
	
	@Before
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "C:/temp/chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Given("^I go to google$")
	public void i_go_to_google() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
	}

	@When("^I enter two integers \"(.*?)\" and \"(.*?)\" and the operation \"(.*?)\" and hit enter$")
	public void i_enter_two_integers_and_and_hit_enter(String arg1, String arg2, String arg3) throws Throwable {
		driver.findElement(By.id("lst-ib")).sendKeys(arg1 + arg3 + arg2 + "\n");
		wait(4000);
	}

	@Then("^the sum of \"([^\"]*)\" appears$")
	public void the_sum_of_appears(String arg1) throws Throwable {
		String result= driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]")).getText();
		System.out.println(result);
		assertEquals(arg1,result) ;
	}

	@Then("^the subtraction of \"(.*?)\" appears$")
	public void the_subtraction_of_appears(String arg1) throws Throwable {
		String result= driver.findElement(By.xpath("//*[@id=\"cwtltblr\"]/div[2]")).getText();
		System.out.println(result);
		assertEquals(arg1,result) ;
	}

	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	public void wait(int delay){
		try{
		Thread.sleep(delay);}
		catch(Exception e){System.out.println(e);
	}
	}
}
