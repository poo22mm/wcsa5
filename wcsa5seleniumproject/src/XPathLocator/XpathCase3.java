package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdiver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("Admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'pas')]")).sendKeys("admin123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'ox')]")).click();

	}

}
