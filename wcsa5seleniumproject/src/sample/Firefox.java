package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 
	 new FirefoxDriver();
 }
}