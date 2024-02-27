package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
 
		driver.manage().window().maximize();
		
		 WebElement firstNameInput = driver.findElement(By.name("first_name"));
	        firstNameInput.sendKeys("Abc");
	        Thread.sleep(500);
	        WebElement lastNameInput = driver.findElement(By.name("last_name"));
	        lastNameInput.sendKeys("Xyz");
	        Thread.sleep(500);
	        WebElement emailInput = driver.findElement(By.name("email"));
	        emailInput.sendKeys("abcxyz@example.com");
	        Thread.sleep(500);
	        WebElement commentsInput = driver.findElement(By.name("message"));
	        commentsInput.sendKeys("This is a test message.");
	        Thread.sleep(500);
	        // Click the submit button
	        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
	        submitButton.click();
	        
	       
	}

}
