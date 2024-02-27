package Axis.BSGGroup;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldownup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down vertically by 1000 pixels
        js.executeScript("window.scrollBy(0,600)");
        
        js.executeScript("window.scrollBy(0,-300)");


	}

}
