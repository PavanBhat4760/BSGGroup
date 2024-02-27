package Axis.BSGGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHandle {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
WebElement maleRadioButton = driver.findElement(By.xpath("//input[@type='radio'][1]"));
        
        // Click on the Male radio button
        maleRadioButton.click();
        
        Thread.sleep(500);
        // Get the selected value
        
WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@type='radio'][2]"));
        
        // Click on the Male radio button
        femaleRadioButton.click();
        
        
	}

}
