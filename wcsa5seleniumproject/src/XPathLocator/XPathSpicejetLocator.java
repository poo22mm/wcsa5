package XPathLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSpicejetLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
	   	WebDriver driver = new ChromeDriver();
	   	 driver.get("");

	}

}
