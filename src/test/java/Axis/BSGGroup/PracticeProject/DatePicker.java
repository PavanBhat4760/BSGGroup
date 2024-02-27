package Axis.BSGGroup.PracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Documents\\driver\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");

        // Click on the date input field to open the date picker
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();
        Thread.sleep(500);
		 
        // Select a date (e.g., 25th February 2024)
        WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-days']//tbody//td[@class='day'][text()='25']"));
        dateToSelect.click();
        Thread.sleep(500);
		 
        // Get the selected date text
        WebElement printdate = driver.findElement(By.xpath("//input[@type='text']"));
        String selectedDate =printdate.getText();
        System.out.println("Selected Date: " + selectedDate);

	}

}
