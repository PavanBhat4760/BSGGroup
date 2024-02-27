package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsEg {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		 driver.get("https://webdriveruniversity.com/Actions/index.html#");
		 driver.manage().window().maximize();
	        // Perform drag and drop action
	        WebElement draggable = driver.findElement(By.id("draggable"));
	        WebElement droppable = driver.findElement(By.id("droppable"));
	        Actions actions = new Actions(driver);
	        actions.dragAndDrop(draggable, droppable).perform();
	        Thread.sleep(500);
	        WebElement box = driver.findElement(By.id("double-click"));
	        actions.doubleClick(box).perform();

	        Thread.sleep(500);
	        WebElement firstDropdown = driver.findElement(By.xpath("//button[normalize-space()='Hover Over Me First!']"));
	        actions.moveToElement(firstDropdown).perform();
	        Thread.sleep(500);
	        WebElement secondDropdown = driver.findElement(By.xpath("//button[normalize-space()='Hover Over Me Second!'][1]"));
	        actions.moveToElement(secondDropdown).perform();
	        Thread.sleep(500);
	        WebElement thirdDropdown = driver.findElement(By.xpath("//button[normalize-space()='Hover Over Me Third!'][1]"));
	        actions.moveToElement(thirdDropdown).perform();
	        // Perform click and hold action on the button
	        Thread.sleep(500);
	        
	        
	        WebElement buttonclick = driver.findElement(By.id("click-box"));
	        actions.clickAndHold(buttonclick).perform();

	}

}
