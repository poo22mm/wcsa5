package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	private static final int i = 0;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Pooja/OneDrive/Desktop/wcsa5/webElement/MultiSelectDropdown.html");
		
		//identify dropdown
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		
		//handle the dropdown
		Select sel = new Select(dropDownElement);
		
		//select multiple options from dropdown
		for(int i=2;i<=5;i++);
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
			
			
		}
		
		//To read all selected options from dropdown
		List<WebElement> allopts = sel.getAllSelectedOptions();
		
		//To read the list of webElement we use loop...
		
		for(WebElement op:allopts)
		{
			Thread.sleep(2000);
			System.out.println(op.getText());
			
		}
		
		
		//for(int i=0;i<allopts.size();i++)
		//{	
			
			//Thread.sleep(2000);
			//System.out.println(allopts.get(i).getText());
		//}
			
	}

}
