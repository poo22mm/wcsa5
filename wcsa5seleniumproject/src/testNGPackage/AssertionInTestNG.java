package testNGPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class AssertionInTestNG {
    
	@Test
	public  void verificationMethod() throws InterruptedException
    {
	
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("http://laptop-ju43mar4/login.do");
		 //non critical feature
		 String actualTitle = driver.getTitle();
		 
		 SoftAssert sa = new SoftAssert();
		 sa.assertEquals(driver.getTitle(), actualTitle);
		 
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.id("loginButton")).click();
		 System.out.println("title matched test case passed!!");
		 sa.assertAll();
		 
		 String actualTitleOfHomePage = driver.getTitle();
		 Assert.assertEquals(driver.getTitle(), "pooja");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("LogOut")).click();
		 
		 
		 
    }
	
}
