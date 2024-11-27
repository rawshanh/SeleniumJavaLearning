package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AuiConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//select content element and store it in a variable
		WebElement content = driver.findElementByClassName("menulink");
		
		// Create object of Actions class and pass the driver
		Actions action = new Actions(driver);
		
		//perform moveToElement  (Mouse Hover on ) action, pass the element and use perform()method
		action.moveToElement(content).perform();
		
		//then click the Articles element
	driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
	Thread.sleep(3000);
	driver.close(); 
		
		
		
		
		
		
		
	}

}
