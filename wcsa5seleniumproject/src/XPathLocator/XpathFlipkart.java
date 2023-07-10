package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Hp Laptop",Keys.ENTER);
		

	}

}
