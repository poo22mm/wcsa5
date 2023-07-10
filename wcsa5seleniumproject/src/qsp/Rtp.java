package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp {
	

	

	public static void main(String[] args) throws InterruptedException {
	Scanner	sc = new Scanner(System.in);
	System.out.println("which browser we want to open!!!");
	String browservalue = sc.next();
	
	if(browservalue.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.close();
	  
	}else if (browservalue.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.close();
		 
	}else if  (browservalue.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver","./drivers.msedgedriver.exe");
		        WebDriver driver = new EdgeDriver();
		        driver.manage().window().maximize();
		        Thread.sleep(2000);
		        driver.close();
	}
	else
	{
		System.out.println("Enter valid browser Name!!!");
		
	}
	}
}
		
	

