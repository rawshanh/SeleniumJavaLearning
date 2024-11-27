package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shabu\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		//Load URL
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Print title of the page
		System.out.println(driver.getTitle());
		
		//3- Prompt Alert - Click on "Click for JS Prompt"
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
				//Using Alert Class
				//Move your control from main window to Alert window and capture/get the text and store it in a variable (ConfirmAlert)
				Alert promptAlert = driver.switchTo().alert();
				promptAlert.getText();
				System.out.println(promptAlert.getText());
				
				Thread.sleep(2000);
				
				//Type - I am a Robot
				promptAlert.sendKeys("I am Robot");
				promptAlert.accept();
				
				//print Result
				driver.findElementById("result").getText();
				System.out.println(driver.findElementById("result").getText());
				
				

	}

}
