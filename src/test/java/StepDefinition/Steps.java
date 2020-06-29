package StepDefinition;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

    WebDriver driver;			
    		
    @Given("^Open the Firefox and launch the application$")
    public void open_the_Firefox_and_launch_the_application() throws Throwable 						
    {		
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\misss\\OneDrive\\Desktop\\cumcumber\\Workspace\\CucumberWithSelenium\\src\\test\\resources\\chromedriver.exe");					
         
    	 driver=new ChromeDriver();
    	 driver.manage().window().maximize();			
       driver.get("https://www.facebook.com/");					
    }		


@When("^Enter the Username and Password$")
public void enter_the_Username_and_Password() throws Throwable 							
    {		
       driver.findElement(By.name("email")).sendKeys("misssonalipawar@gmail.com");							
       driver.findElement(By.name("pass")).sendKeys("mayur1988");	
       driver.findElement(By.id("loginbutton")).click();
    }		
@Then("^Message displayed Login Successfully$")
public void message_displayed_Login_Successfully() throws Throwable {
System.out.println("Login Successfully");
}	
}		