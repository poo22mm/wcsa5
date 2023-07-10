package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-ju43mar4/login.do");
        Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.id("pwd")).sendKeys("123");
		



	}

}
