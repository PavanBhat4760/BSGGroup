package Axis.BSGGroup.PracticeProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoList {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10000 , TimeUnit.MILLISECONDS);
		
        // Enter a value in the to-do list
        WebElement todoInput = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        todoInput.sendKeys("Buy groceries");
        todoInput.sendKeys(Keys.ENTER);
        
        WebElement todoInput1 = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));
        todoInput1.sendKeys("Buy fruits");
         // Click "Enter" to add the item
        todoInput1.sendKeys(Keys.ENTER);
       
        WebElement clickitem = driver.findElement(By.xpath("//li[normalize-space()='Buy fruits']"));
        clickitem.click();
        
        // Hover the mouse over the added item
        WebElement addedItem = driver.findElement(By.xpath("//li[normalize-space()='Buy groceries']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(addedItem).perform();
        
        // Click the delete button that appears
        WebElement deleteButton = driver.findElement(By.xpath("//li[normalize-space()='Buy groceries']//span"));
        deleteButton.click();
        

	}

}
