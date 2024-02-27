package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		 driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		 driver.manage().window().maximize();
		 
		 WebElement upload = driver.findElement(By.xpath("//input[@name='filename']"));

		 upload.sendKeys("C:\\Users\\ADMIN\\Documents\\driver\\pexels-kelly-2876511.jpg");
		 Thread.sleep(500);
		 
		 WebElement submit = driver.findElement(By.xpath("//input[@id='submit-button']"));
	        submit.click();
	        String alertText = driver.switchTo().alert().getText();
	        System.out.println("Alert Message: " + alertText);

	        // Close the alert
	        driver.switchTo().alert().accept();	}

}
