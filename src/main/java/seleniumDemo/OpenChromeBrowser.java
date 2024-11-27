package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	
	public static void main(String[] args) {
		
		//Open/Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//Create object of Chromedriver class
		ChromeDriver driver = new ChromeDriver();
		
		//load URL/Open URL
		//driver.get("http://leaftaps.com/opentaps/control/main");
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		
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
		
		//Navigation command - back
		driver.navigate().back();
		
		//Navigate forward
		driver.navigate().forward();
		
		//Refresh
		driver.navigate().refresh();
		
		//Print loging Successful
		System.out.println("Login successfully in TestLeaf Application");
		
		//Get/print page Title			
		System.out.println(driver.getTitle());
		
		
		
		//Close browser
		driver.close();
		
		
	}

}
