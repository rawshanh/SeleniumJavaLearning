package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shabu\\OneDrive\\Documents\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
 ChromeDriver driver = new ChromeDriver();
 
 driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
	
	String simpleAlert = driver.switchTo().alert().getText();
	
	System.out.println(simpleAlert);
	Thread.sleep(3000);
	//click on OK button 
	driver.switchTo().alert().accept();

	
	
	
	
	/* String simpleAlert = driver.switchTo().alert().getText();
	
		System.out.println(simpleAlert); */
		
	/*	//Load URL
				driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				
				//Print title of the page
				System.out.println(driver.getTitle());

				//1-Simple Alert - click on "Click for JS Alert"
				driver.findElementByXPath("//button[text()='Click for JS Alert']").click();

				//Move your control from main window to Alert window and capture/get the text and store it in a variable (simpleAlert)
				String simpleAlert = driver.switchTo().alert().getText();
				//print the text
				System.out.println(simpleAlert);
				
				Thread.sleep(3000);
				
				//click on OK button 
				driver.switchTo().alert().accept();  */
		
		
		
		
		
		
		
		
		
	}

}
