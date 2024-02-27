package Axis.BSGGroup.PracticeProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
 
		driver.get("https://webdriveruniversity.com/");
 
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        // Click the "Login Portal" link
        WebElement loginPortalLink = driver.findElement(By.id("login-portal"));
        loginPortalLink.click();

        // Get the window handles (parent window and new tab)
        Set<String> windowHandles = driver.getWindowHandles();
        String parentWindowHandle = driver.getWindowHandle();

        // Switch to the new tab (login portal)
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Fill in username and password
        WebElement usernameInput = driver.findElement(By.id("text"));
        usernameInput.sendKeys("webdriver");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("webdriver123");

        // Click the login button
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println("Alert Message: " + alertText);

       


	}

}
