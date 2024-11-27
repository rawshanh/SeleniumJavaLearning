package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
       // ClassName obj = new ClassName();
		// Set obj = new HashSet 
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//switch to frame
		driver.switchTo().frame(0);

		//select draggable and droppable elements and store it in a variable

		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		//wait 3 seconds
		Thread.sleep(3000);
		Actions action = new Actions(driver);

		//wait 4 sec
		Thread.sleep(4000);
		action.dragAndDrop(src, dest).perform();

		Thread.sleep(4000);

		//switch back from frame
		driver.switchTo().parentFrame();
		//click demos
		driver.findElementByXPath("//a[text()='Demos']").click();
		Thread.sleep(4000);

		driver.close();












	}

}
