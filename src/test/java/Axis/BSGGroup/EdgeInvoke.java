package Axis.BSGGroup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeInvoke {

	
		public static WebDriver driver;

		public static void main(String[] args) {

			System.setProperty("webdriver.edge.driver", "C:\\Users\\ADMIN\\\\Documents\\driver\\msedgedriver.exe");

			WebDriver driver = new EdgeDriver();

			driver.get("https://www.selenium.dev/");


	}

}
