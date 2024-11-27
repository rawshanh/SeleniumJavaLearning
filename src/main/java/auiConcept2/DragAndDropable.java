package auiConcept2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		Thread.sleep(4000);
		
		action.dragAndDrop(src, dest).perform();
		Thread.sleep(4000);
		
		
		
	}

}
