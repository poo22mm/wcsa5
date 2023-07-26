package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	//store webelements of userpage
	@FindBy(xpath = "//input[@value='Create New User']") private WebElement userListCreateNewUserButton;
	@FindBy(name = "username") private WebElement usnTB;
	@FindBy(xpath = "//*[@name='passwordText']") private WebElement pssTB;
	@FindBy(xpath = "//*[@name='passwordTextRetype']") private WebElement retypePassTB;
	@FindBy(name = "firstName")private WebElement firstNameTB;
	@FindBy(name = "lastName")private WebElement lastNameTB;
	@FindBy(name = "//*[@id='right12']")private WebElement modifyEnterTimeTrackcheckBox;
	@FindBy(name = "//*[@id='right2']")private WebElement manageCust_projectCheckBox;
	@FindBy(name = "//*[@id='right1']")private WebElement generatesReportsCheckbox;
	@FindBy(name = "//*[@id='right5']")private WebElement manageUserCheckBox;
	@FindBy(name = "//*[@id='right7']")private WebElement manageBillingTypesCheckBox;
	@FindBy(xpath = "//input[@type='submit']")private WebElement createuserButton;
	@FindBy(xpath = "/HTML/BODY/DIV/FORM/TABLE/TBODY/TR[4]/TD/INPUT[2")private WebElement cancelButton;
	@FindBy(xpath = "//a[.='p, mane (mane00)']")private WebElement uerLink;
	@FindBy(xpath = "//input[@value='Delete This User']")private WebElement deleteThisUserButton;
	
	
	//initaization
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getUserListCreateNewUserButton() {
		return userListCreateNewUserButton;
	}


	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPssTB() {
		return pssTB;
	}


	public WebElement getRetypePassTB() {
		return retypePassTB;
	}


	public WebElement getFirstNameTB() {
		return firstNameTB;
	}


	public WebElement getLastNameTB() {
		return lastNameTB;
	}


	public WebElement getModifyEnterTimeTrackcheckBox() {
		return modifyEnterTimeTrackcheckBox;
	}


	public WebElement getManageCust_projectCheckBox() {
		return manageCust_projectCheckBox;
	}


	public WebElement getGeneratesReportsCheckbox() {
		return generatesReportsCheckbox;
	}


	public WebElement getManageUserCheckBox() {
		return manageUserCheckBox;
	}


	public WebElement getManageBillingTypesCheckBox() {
		return manageBillingTypesCheckBox;
	}


	public WebElement getCreateuserButton() {
		return createuserButton;
	}


	public WebElement getCancelButton() {
		return cancelButton;
	}


	//public WebElement getUerLink() {
		//return uerLink;
	//}


	//public WebElement getDeleteThisUserButton() {
		//return deleteThisUserButton;
	//}
	
	public void createManager(String username,String password,String mane,String p) throws InterruptedException
	{
		userListCreateNewUserButton.click();
		Thread.sleep(1000);
		usnTB.sendKeys(username);
		pssTB.sendKeys(password);
		firstNameTB.sendKeys(mane);
		lastNameTB.sendKeys(p);
		Thread.sleep(1000);
		modifyEnterTimeTrackcheckBox.click();
		manageCust_projectCheckBox.click();
		generatesReportsCheckbox.click();
		manageBillingTypesCheckBox.click();
		Thread.sleep(1000);
		createuserButton.click();
		
		
}
	
	
	public void deleteManager()
	{
		uerLink.click();
		deleteThisUserButton.click();
	}
	
	
	
}
