package xPathPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
		//WebDriverManager.firefoxdriver().setup();
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
		
			// maximize
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
							
			// load URL
			//driver.get("http://leaftaps.com/opentaps");
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@class='decorativeSubmit']").click();
			driver.findElementByLinkText("CRM/SFA").click();
			driver.findElementByXPath("//a[text()='Leads']").click();
			driver.findElementByXPath("//a[text()='Create Lead']").click();
			driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");
			driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Yousuf");
			driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ali");
			WebElement src = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
			Select dd = new Select(src); //
			dd.selectByVisibleText("Website");  //ChromeDriver driver = new ChromeDriver();
			
		//	Select dd = new Select(src);
		//	dd.selectByVisibleText("Website");
		//	
			
			
	/*		// Enter Username - (Element level)
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
					
			// Enter Password - (Element level)
			driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

			// Click Login Button - (Element level)
			driver.findElementByXPath("//input[@value='Login']").click();

			// click crm/sfa link
			driver.findElementByLinkText("CRM/SFA").click();
		
			
			//click leads
			driver.findElementByXPath("//a[text()='Leads']").click();
			

			//click create lead link
			driver.findElementByXPath("//a[text()='Create Lead']").click();
			
			//company name
			driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("TCS");

			// enter firstName
			driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		
			try {
				driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			} catch (NoSuchElementException e) {
				System.out.println("The element not found");
			}
			
			Thread.sleep(2000);
			// throw new Exception();

			// enter lastName
			driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("M");
			// Choose source
			WebElement src = driver.findElementByXPath("//select[@id='createLeadForm_dataSourceId']");
			Select dd = new Select(src);
			dd.selectByVisibleText("Website");
			
			// choose ownership
			WebElement ele = driver.findElementByXPath("//select[@name='ownershipEnumId']");
			Select dd2 = new Select(ele);
			dd2.selectByVisibleText("Sole Proprietorship");
			
			// Click Create lead
			driver.findElementByXPath("//input[@name='submitButton']").click();

			//Verify title of the page
			String title = driver.getTitle();
			System.out.println(title);
			
					
		            if(title.contains("View")) {
				System.out.println("Title matched");
			} else {
				System.out.println("Title not Matched");
			}
					
			//close browser
			driver.close(); */

	}
	
	
	
	
	}


