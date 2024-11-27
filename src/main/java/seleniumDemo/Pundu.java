package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pundu {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shabu\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//load URL/Open URL
	//driver.get("http://leaftaps.com/opentaps/control/main");
	//driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	
	//load URL/Open URL
	//driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	//Maximize window
	driver.manage().window().maximize();
	
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	//Get/print page Title
	//driver.getTitle();
	System.out.println(driver.getTitle());
	
	//Type Username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//Enter password
	driver.findElementByName("PASSWORD").sendKeys("crmsfa");
	
	//Click Login button
	driver.findElementByClassName("decorativeSubmit").click();
	
	//click CRM/SFA link
	driver.findElementByLinkText("CRM/SFA").click();
	
	//click Leads link
	driver.findElementByLinkText("Leads").click();
	
	//click Create lead
	driver.findElementByLinkText("Create Lead").click();
	
	//enter company name
	driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	
	//Type FirstName
	//driver.findElementByName("firstName").sendKeys("Hema");
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	
	//Type LastName
	//driver.findElementByName("lastName").sendKeys("Mali");
driver.findElementById("createLeadForm_lastName").sendKeys("Mali");

//Type Description
driver.findElementByName("description").sendKeys("This is a dec. field");
		

//Drop-down-choose Source [find element using any locator and store it in a variable]
//WebElement src = driver.findElementById("createLeadForm_dataSourceId");
WebElement source = driver.findElementById("createLeadForm_dataSourceId");

//Selenium use Select class for handling Drop-Down
//create object of Select class and pass element(source)
Select dd = new Select(source);
//Call any method of Select class
dd.selectByVisibleText("Employee");
dd.selectByValue("LEAD_OTHER");
dd.selectByIndex(11);

//Choose marketing Campaign
WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
Select dd1 = new Select(mkt);
dd1.selectByVisibleText("Car and Driver");
dd1.selectByValue("CATRQ_ROADNTRACK");
dd1.selectByIndex(5);


//click CreateLead button
driver.findElementByName("submitButton").click();


//clocse browser
	driver.close(); */

		
		
		
		
		
		
		
		
		
		
		

	}

}
