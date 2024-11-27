package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlerts {

	public static void main(String[] args) throws InterruptedException {
		//Launch Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Print title of the page
		System.out.println(driver.getTitle());

/*		//1-Simple Alert - click on "Click for JS Alert"
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();

		//Move your control from main window to Alert window and capture/get the text and store it in a variable (simpleAlert)
		String simpleAlert = driver.switchTo().alert().getText();
		//print the text
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		
		//click on OK button 
		driver.switchTo().alert().accept(); */
		
		
		/* driver.findElementByXPath("//button[text()='Click for JS Confirm']").click();
		
	String ConfirmAlert = driver.switchTo().alert().getText();
		
		System.out.println(ConfirmAlert);
		
		Thread.sleep(2000);  
		
		driver.switchTo().alert().accept();
			*/
		
	/*	 //2- Confirmation Alert - Click on "Click for JS Confirm"
		driver.findElementByXPath("//button[text()='Click for JS Confirm']").click();
		
		//Move your control from main window to Alert window and capture/get the text and store it in a variable (ConfirmAlert)
		String ConfirmAlert = driver.switchTo().alert().getText();
		System.out.println(ConfirmAlert);
		
		Thread.sleep(2000); 
		
		//click on OK or Cancel button 
		//driver.switchTo().alert().accept(); //click OK
		driver.switchTo().alert().dismiss(); //click Cancel   */
		
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);
		driver.switchTo().alert().sendKeys("Yousuf vai will get job this year insha Allah");
          Thread.sleep(2000);
          driver.switchTo().alert().accept(); 
	/*	//3- Prompt Alert - Click on "Click for JS Prompt"
		driver.findElementByXPath("//button[text()='Click for JS Prompt']").click();
		
		//Move your control from main window to Alert window and capture/get the text and store it in a variable (ConfirmAlert)
		String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);
		
		//Type- I am not a Robot
		driver.switchTo().alert().sendKeys("I am not a Robot");
		Thread.sleep(2000);
		
		//click on OK or Cancel button 
		driver.switchTo().alert().accept(); //click OK
		//driver.switchTo().alert().dismiss(); //click Cancel
		
		//print/get/capture - Result
		driver.findElementById("result").getText();
		System.out.println(driver.findElementById("result").getText());
		
		//close browser
		driver.close();  */
	}

}
