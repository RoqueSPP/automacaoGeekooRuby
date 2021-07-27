package frame.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class teste {
	static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://www.google.com.br");

	}

}
