package seleniumframework_oct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//POM class
public class Login_Page {
		
	@FindBy(how=How.NAME,using="q")
	static WebElement searchTxtbox;
	
	public void enterData(){
	 PageFactory.initElements(LoginTest.driver, Login_Page.class);
	try{
	 if(searchTxtbox.isDisplayed() && searchTxtbox.isEnabled()){
	 searchTxtbox.clear();
	 searchTxtbox.sendKeys("POM objects");
	 }}catch(Exception e){
		System.out.println("Something went wrong");
	}
	}
}
	
	 
	

