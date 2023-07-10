package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pooja/OneDrive/Desktop/wcsa5/webElement/MultiSelectDropdown.html");
		
		WebElement multiSelectDD = driver.findElement(By.id("menu"));
		Select sel = new Select(multiSelectDD);
		Thread.sleep(2000);
		//To select using visible text
		sel.selectByIndex(1);
		
		Thread.sleep(2000);
		//To Select By using Visible text
		sel.selectByVisibleText("Pani Puri ");
		Thread.sleep(2000);
		
		//To select By Using Value
		sel.selectByValue("v5");
		
		//To Deselect By Using Index
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		
		//To deselect using Visible Text
		sel.deselectByVisibleText("Misal Pav ");
		Thread.sleep(2000);
		
		//To deselect by using Value
		sel.deselectByValue("v5");
		Thread.sleep(2000);
		
		//To select Multiple options using for loop
		for(int i=0 ; i<5; i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}
	   Thread.sleep(3000);
		
		
		sel.deselectAll();
		
		
		
		
		
		}
		

	}


