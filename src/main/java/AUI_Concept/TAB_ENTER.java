package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TAB_ENTER {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new   ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		//facebook.com-enter email as abc@yahoo.com
		driver.findElementById("email").sendKeys("abc@yahoo.com");

		Actions action = new Actions(driver);
		//By using Actions class- enter password as mahbub using Tab Key on facebook.com 

		Thread.sleep(3000);
		//Hit Tab key from KEYBOARD -Tab action will perform
		action.sendKeys(Keys.TAB)
		.sendKeys("mahbub") //Enter the password as mahbub
		.build().perform(); //perform action
		//You can use Enter key after Tab-Hit enter facebook.com
        action.sendKeys(Keys.ENTER).perform();
        action.sendKeys(Keys.TAB).perform();
        
		//action class diye amra value likhte pri



	}

}
