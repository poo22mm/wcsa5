package synchronazation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeSynchronazation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-ju43mar4/login.do");
		
		String actualTitleOfLoginPage = driver.getTitle();
		if(actualTitleOfLoginPage.equals("actiTIME - Login"));
		{
		   System.out.println("Title is matched,Test case passed!!!");
		   driver.findElement(By.name("username")).sendKeys("Admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.id("loginButton")).click();
		   
		   
		}
		
		{
			System.out.println("We will get exception");
		}
		
		String actualTitleOfHomePage = driver.getTitle();
		if(actualTitleOfHomePage.equals("actiTIME - Enter Time-Treack"));
		{
			System.out.println("Title is matched,Test case passed!!!");
		}
		
		  

		}	

}
