package XPathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSelectingProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Hp Laptop",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_1jJQdf _2Mji8F']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Core i9']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'HP Omen Intel Core i9 12th Gen')]/../..//div[text()='₹2,96,000']")).click();

	}

}
