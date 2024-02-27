package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpandAlerts {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");

	        // Handle the confirmation alert
	        WebElement confirmButton = driver.findElement(By.xpath("//span[@id='button1']"));
	        confirmButton.click();
	        Thread.sleep(500);
	        Alert confirmAlert = driver.switchTo().alert();
	        String confirmText = confirmAlert.getText();
	        System.out.println("Confirmation Alert Text: " + confirmText);
	        confirmAlert.dismiss(); 
	        Thread.sleep(500);
	        WebElement popupButton = driver.findElement(By.id("button2"));
	        popupButton.click();
	        Thread.sleep(500);
	        // Click the close button on the popup
	        WebElement closeButton = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
	        closeButton.click();
	        Thread.sleep(500);
	        WebElement promptButton = driver.findElement(By.id("button4"));
	        promptButton.click();
	        Alert confirmAlert1 = driver.switchTo().alert();
	        confirmAlert1.dismiss(); 
	        
	        WebElement element = driver.findElement(By.xpath("//p[@id='confirm-alert-text']"));

	        // Get the text of the element
	        String text = element.getText();
	        System.out.println("Text of the element: " + text);

	}

}
