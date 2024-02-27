package Axis.BSGGroup;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		
		
		WebElement infoalt = driver.findElement(By.xpath("//input[@name='alert']"));
          infoalt.click();
          
          Alert alt = driver.switchTo().alert();
          alt.accept();
          
          WebElement confoalt = driver.findElement(By.xpath("//input[@name='confirmation']"));
          confoalt.click();
          
          Thread.sleep(500);
          Alert alt1 = driver.switchTo().alert();
          alt1.dismiss();
          
          
          WebElement promalt = driver.findElement(By.xpath("//input[@name='prompt']"));
          infoalt.click();
          
          Thread.sleep(500);
          Alert alt2 = driver.switchTo().alert();
          alt2.accept();
          
	}

}
