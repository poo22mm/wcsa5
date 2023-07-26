package testNGAnnotation_Flags;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	static WebDriver driver;
  @BeforeMethod(description = "Open the Browser")
  public void setUp() 
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("https://www.google.com");
	  }
	  
	  @AfterMethod(description = "Close the Browser")
	  public void tearDown()
	  {
		  driver.quit();
	  }
	  
  }

