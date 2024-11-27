package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Createid {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\shabu\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");		
	
    ChromeDriver driver = new ChromeDriver();
    
    driver.navigate().to("http://leaftaps.com/opentaps/control/login");
    
        
    
 /*  //Create object of Chromedriver class
	ChromeDriver driver = new ChromeDriver();
	
	//load URL/Open URL
	//driver.get("http://leaftaps.com/opentaps/control/main");
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	
	//Maximize window
	driver.manage().window().maximize();
	
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	//Get/print page Title
	//driver.getTitle();
	System.out.println(driver.getTitle()); */
    






	}

}
