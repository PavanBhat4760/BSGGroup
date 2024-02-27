package Axis.BSGGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		driver.navigate().forward();
		
		Thread.sleep(500);
		
		driver.navigate().back();
		
		Thread.sleep(500);
		
		driver.navigate().refresh();
		
		
		

	}

}
