package seleniumframework_oct;

import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest{
static WebDriver driver;

Login_Page lp = new Login_Page();

@Test
public void setUp(){
System.setProperty("webdriver.chrome.driver","C:/Users/bhargavi/chromedriver_win32/chromedriver.exe");
	 driver = new ChromeDriver();
	// Open Google
	driver.get("http://www.google.com");
	lp.enterData();
	}


}