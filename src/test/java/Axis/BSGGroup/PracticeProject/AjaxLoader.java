package Axis.BSGGroup.PracticeProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxLoader {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");

		 driver.manage().timeouts().implicitlyWait(10000 , TimeUnit.MILLISECONDS);
	        // Click the "CLICK ME!" button to trigger the Ajax loading
	        WebElement clickMeButton = driver.findElement(By.xpath("//span[@type='button']"));
	        clickMeButton.click();
	        WebElement closeButton = driver.findElement(By.xpath(" //button[normalize-space()='Close']"));
	         closeButton.click();
	}

}
