package Axis.BSGGroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		WebElement date = driver.findElement(By.xpath("//span[contains(text(),'Departure')]"));
		date.click();
		
		Thread.sleep(200);
		WebElement date27 = driver.findElement(By.xpath("//div[@aria-label='Tue Feb 27 2024']"));
        date27.click();


	}

}
