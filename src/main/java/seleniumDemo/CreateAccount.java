package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		//Open/Launch Chrome Browser
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		   System.out.println(driver.getTitle());
		   
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("munna inc");
		driver.findElementById("createLeadForm_firstName").sendKeys("yousuf");
		driver.findElementById("createLeadForm_lastName").sendKeys("ali");
		
		driver.findElementByName("submitButton").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* WebElement Src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(Src);
		
		//dd.selectByVisibleText("Employee");
		
		dd.selectByIndex(0); */
		
		// driver.findElementByName("submitButton").click();
		
	/*	WebElement src = driver.findElementById("createLeadForm_companyName");
		
		Select dd = new Select(src);
		dd.selectByVisibleText("Employee");   */
		
		
		
		
		/* //Select dd = new Select(src);
		//dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_PARTNER");
		//dd.selectByIndex(0);
		  */
		
		
		
		/* driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();  */
		
		
		
		
		
		/*driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		
		//WebElement src=  driver.findElementById("createLeadForm_dataSourceId");
		// Create object of Select class and pass the variable (src)
		
		//Select dd = new Select(src);
		//dd.selectByVisibleText("Employee");
		//dd.selectByValue("LEAD_PARTNER");
		//dd.selectByIndex(3);
		
		//dd.selectByVisibleText("word of Mouth");
		
		//2nd way
		dd.selectByValue("LEAD_WORDOFMOUTH");
		//3rcd way
	    //dd.selectByIndex(6);	
	}*/
		
		
		
		
		
		
		
		
		
		
		

	}

}
