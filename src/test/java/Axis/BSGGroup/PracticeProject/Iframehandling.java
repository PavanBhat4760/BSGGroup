package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehandling {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
        
		driver.switchTo().frame("frame");
        
        // Switch to the iframe by WebElement
        // WebElement iframe = driver.findElement(By.id("frame"));
        // driver.switchTo().frame(iframe);

        // Perform actions inside the iframe
        WebElement iframeElement = driver.findElement(By.xpath("(//div[@class='caption'])[2]"));
        String textInsideIframe = iframeElement.getText();
        System.out.println("Text inside iframe: " + textInsideIframe);

        WebElement viewproducts = driver.findElement(By.xpath("//a[normalize-space()='Our Products']"));
        viewproducts.click();
      

  

	}

}
