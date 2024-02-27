package Axis.BSGGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClicks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		Thread.sleep(500);
		Actions actions = new Actions(driver);

        // Locate the element for context click
        WebElement contextClickElement = driver.findElement(By.id("double-click"));

        // Perform context click action
        actions.contextClick(contextClickElement).perform();
        Thread.sleep(500);
        
		WebElement doubleClickElement = driver.findElement(By.xpath("//input[@id='double-click']"));
		
		 actions.doubleClick(doubleClickElement).perform();

	}

}
