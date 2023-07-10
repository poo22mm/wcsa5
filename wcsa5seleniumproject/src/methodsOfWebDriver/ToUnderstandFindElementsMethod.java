package methodsOfWebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import qsp.string;

public class ToUnderstandFindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().activeElement().sendKeys("bikes");
		Thread.sleep(2000);
		
		List<WebElement> bikes =  driver.findElements(By.xpath("//div[@class='wM6W7d']"));

		for(WebElement We : bikes) {
			String bikesoptions = We.getText();
			System.out.println(bikesoptions);
			Thread.sleep(2000);
		
		}
			
	
	}
	

			
		

	}

