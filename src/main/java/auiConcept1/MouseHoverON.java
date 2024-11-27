package auiConcept1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverON {

	public static void main(String[] args) throws InterruptedException {
	
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

 ChromeDriver driver = new ChromeDriver();
 
 driver.get("http://mrbool.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 WebElement content = driver.findElementByClassName("menulink");
 
 Actions action = new Actions(driver);
 
 action.moveToElement(content).perform();
 driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
  Thread.sleep(3500);

 
 
 
 
	}

}
