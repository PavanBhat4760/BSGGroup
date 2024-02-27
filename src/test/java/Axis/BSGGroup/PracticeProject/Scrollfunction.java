package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollfunction {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");

        // Maximize the window (optional)
        driver.manage().window().maximize();

        // Create JavaScriptExecutor instance
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll to the element with id "zone4"
        WebElement zone4 = driver.findElement(By.id("zone4"));
        js.executeScript("arguments[0].scrollIntoView();", zone4);
        Thread.sleep(500);
        // Scroll vertically by 500 pixels
        js.executeScript("window.scrollBy(0, 500);");
        Thread.sleep(500);
        // Scroll vertically to the bottom of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(500);
        // Scroll vertically to the top of the page
        js.executeScript("window.scrollTo(0, 0);");
      
	}

}
