package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
		WebElement rightclick =driver.findElementByXPath("//span[text()='right click me']");

		Actions action = new Actions(driver);

		//perform RightClick - contextClick
		//action.contextClick(rightclick).perform();
		action.contextClick(rightclick).perform();
		Thread.sleep(4000);
		driver.close();
		



		//https://swisnl.github.io/jQuery-contextMenu/demo.html
	}

}
