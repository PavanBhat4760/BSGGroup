package Axis.BSGGroup.PracticeProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownCheckboxRadioButton {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

			        // Select an option from the first dropdown
			        
			        WebElement dropdown1 = driver.findElement(By.id("dropdowm-menu-1"));
			        dropdown1.click();
			        WebElement options1 = driver.findElement(By.xpath("//*[@id='dropdowm-menu-1']/option[3]"));
			        options1.click();
			       
			        Thread.sleep(500);
			        // Select an option from the second dropdown
			        WebElement dropdown2 = driver.findElement(By.id("dropdowm-menu-2"));
			        dropdown2.click();
			        WebElement options2 = driver.findElement(By.xpath("//*[@id='dropdowm-menu-2']/option[2]"));
			        options2.click();
			        Thread.sleep(500);
			        // Select an option from the third dropdown
			        WebElement dropdown3 = driver.findElement(By.id("dropdowm-menu-3"));
			        dropdown3.click();
			        WebElement options3 = driver.findElement(By.xpath("//*[@id='dropdowm-menu-3']/option[4]"));
			        options3.click();
			        Thread.sleep(500);
			        // Select multiple checkboxes
			        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
			        for (WebElement checkbox : checkboxes) {
			            checkbox.click();
			        }
			        Thread.sleep(500);
			        // Click multiple radio buttons
			        List<WebElement> radioButtons = driver.findElements(By.cssSelector("input[type='radio']"));
			        for (int i = 0; i < radioButtons.size(); i += 2) { // Click every other radio button
			            radioButtons.get(i).click();
			        }
			        
			        WebElement radiob = driver.findElement(By.xpath("//input[@value='lettuce']"));
			        radiob.click();
			        
			        WebElement dropdown4 = driver.findElement(By.xpath("//select[@id='fruit-selects']"));
			        dropdown3.click();
			        WebElement options4 = driver.findElement(By.xpath("//*[@id='fruit-selects']/option[3]"));
			        options4.click();

	}

}
