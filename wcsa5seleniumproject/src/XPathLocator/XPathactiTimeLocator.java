package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathactiTimeLocator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://laptop-ju43mar4/login.jsp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("developer");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1123");
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();

	}

}
