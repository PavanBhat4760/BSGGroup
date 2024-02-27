package Axis.BSGGroup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class MultipleCheckbox {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		 // Find all checkboxes
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='cb1-element']"));
        
        Thread.sleep(500);

        // Loop through each checkbox and click
        for (WebElement checkbox : checkboxes) {
            
                checkbox.click();
            
        }

}
}
