package AUI_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");





		ChromeDriver driver = new ChromeDriver();


		driver.get("https://jqueryui.com/selectable/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//   driver.findElementByLinkText("Selectable").click(); //outside of frame  

		// swithcing to iframe
		driver.switchTo().frame(0);     //using index number -(Note-in java index starts from Zero)

		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");
		WebElement Item7 = driver.findElementByXPath("//li[text()='Item 7']");
		Actions action = new Actions(driver);
		//Keydown er vetorey keys likhey . ditey hobey

		action.keyUp(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item4).click(Item5).click(Item6).click(Item7).release().perform();

		Thread.sleep(3000);
		driver.close();


	}

}
