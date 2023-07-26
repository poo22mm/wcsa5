package pom;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.setup();
		
		Flib flib = new Flib();
		
		//to call the webelement of login page create the object of loginpage class
		LoginPage lp = new LoginPage(driver);
		lp.validLoginMathod(flib.readPropertyData(PROP_PATH, "Username"), flib.readPropertyData(PROP_PATH, "Passwprd"));
		//use homepage elements create obj of homepage POM
		HomePage hp = new HomePage(driver);
		hp.clickOnlogOutLink();
	
		

	}

}
