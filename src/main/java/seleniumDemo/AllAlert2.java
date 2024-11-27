package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlert2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\shabu\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
		String simpleAlert5 = driver.switchTo().alert().getText();
		 System.out.println(simpleAlert5);
		 Thread.sleep(3000);
		 
		 
		 
		
		/*//click on "Click for JS Alert"
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();

		//Move your control from main window to Alert window and capture/get the text and store it in a variable (simpleAlert)
		String simpleAlert = driver.switchTo().alert().getText();
		//print the text
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		
		
		
		
		
		
		String simpleAlert2 = driver.switchTo().alert().getText();
      		System.out.println(simpleAlert2);
      		Thread.sleep(3000);
      		driver.switchTo().alert().accept();
      		driver.close();
      		
		 //Load URL
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//Print title of the page
		System.out.println(driver.getTitle());

		//click on "Click for JS Alert"
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();

		//Move your control from main window to Alert window and capture/get the text and store it in a variable (simpleAlert)
		String simpleAlert = driver.switchTo().alert().getText();
		//print the text
		System.out.println(simpleAlert);
		
		Thread.sleep(3000);
		
		//click on OK button 
		driver.switchTo().alert().accept();
		
		//close browser
		driver.close(); */
	}

}
