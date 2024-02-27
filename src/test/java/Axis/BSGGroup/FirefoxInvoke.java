package Axis.BSGGroup;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvoke {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Gecko.driver","C:\\Users\\ADMIN\\Documents\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		driver.quit();

		

	}

}
