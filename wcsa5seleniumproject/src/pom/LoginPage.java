package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//it is webelement repository
	
	@FindBy(xpath="//*[@name='username']")private WebElement usnTB;  //findBy =change to find by
	@FindBy(xpath="//*[@name='pwd']")private WebElement pssTB;
	@FindBy(xpath="//*[@id='loginButton']") private WebElement loginButton;
	@FindBy(xpath = "//*[@id='keepLoggedInCheckBox']") private WebElement checkbox;
	@FindBy(partialLinkText =  "Actimind Inc.") private WebElement actiMindlink;
	
	
	//initialization
	
	public  LoginPage(WebDriver driver)    //note: change constructor
	{
		
	PageFactory.initElements(driver,this);
	}


	//utilaization
	
	
	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPssTB() {
		return pssTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getCheckbox() {
		return checkbox;
	}


	public WebElement getActiMindlink() {
		return actiMindlink;
	}
	
		//operational methods
	
	public void validLoginMathod(String validUsername,String validPassword)
	{
		usnTB.sendKeys(validUsername);
		pssTB.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void inValidLoginMethod(String inValidUsername,String inValidPassword) throws InterruptedException
	{
		usnTB.sendKeys(inValidUsername);
		usnTB.sendKeys(inValidPassword);
		loginButton.click();
		Thread.sleep(1000);
		usnTB.clear();
	}
		
	
	
	
}


