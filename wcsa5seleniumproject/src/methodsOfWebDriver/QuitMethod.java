package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		        WebDriver driver=new FirefoxDriver();
		        driver.manage().window().maximize();
		        driver.get("http://omayo.blogspot.com/");
		        Thread.sleep(2000);
		        driver.findElement(By.linkText("Open a popup window")).click();
		        driver.quit();
		

	}

}
