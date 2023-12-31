package testNGAnnotation_Flags;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

public class ActiTimeDataProvider {
	
	@Test(dataProvider = "actiTimeData")
	public void invalidLoginMethod(String usn,String pass)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://laptop-ju43mar4/login.do");
		
		driver.findElement(By.name("username")).sendKeys(usn);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		
		
	}
	
	 //@Test(dataProvider = "actiTimedata")
  // public void f(Integer n, String s) {
 // }

  @DataProvider(name = "actiTimeData")
  public Object[][] Testdata() {
	  
	  Object[][] testData1 = new Object[5][2];
	  testData1[0][0]="ad_main";
	  testData1[0][1]="mana_ger";
	  
	  testData1[1][0]="manager";
	  testData1[1][1]="admin";
	  
	  testData1[2][0]="@admin";
	  testData1[2][1]="@manager";
	  
	  testData1[3][0]="admin123";
	  testData1[3][1]="manager123";
	  
	  testData1[4][0]="123admin";
	  testData1[4][1]="123manager";
	  
	  return testData1;
	  
   
  }
}
