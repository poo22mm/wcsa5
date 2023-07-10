package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/partner-with-u");
		
		driver.findElement(By.id("sc-1kx5g6g-3 dkwpEa")).sendKeys("signin");
		
		driver.findElement(By.id("sc-1yzxt5f-9 bbrwhB")).sendKeys("pooja123");
		
		driver.findElement(By.id("sc-1yzxt5f-9 bbrwhB")).sendKeys("poo22gmail.com");
		
		driver.findElement(By.className("sc-fEUNkw eefauG")).click();
		
	}

}
