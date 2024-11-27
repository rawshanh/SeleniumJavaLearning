package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//select Content element and store it in variable
		WebElement content = driver.findElementByClassName("menulink");

		Actions action = new Actions(driver);
		//perform moveToElement(mouse hover on) action, pass the element and use perform() method 

		action.moveToElement(content).perform();

		//Then click the Articles element
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();

		// wait 3 seconds
		Thread.sleep(3000);

		// close the browser

		driver.close();


	}

}
