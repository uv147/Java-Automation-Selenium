package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {


WebDriver driver;
		

public LoginPage(WebDriver dv) {
				this.driver =dv;
				
			}	

By txt_username = By.id("loginusername");

public void enterUsername(String Username) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(txt_username).sendKeys(Username);
}
By  txt_password= By.id("loginpassword");		
public void enterPassword(String Password) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(txt_password).sendKeys(Password);
	
}
By loginbutton =By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
public void clickLogin() {
	driver.findElement(loginbutton).click();
}
public void login (String username, String password) {
	enterUsername(username);
	enterPassword(password);
	clickLogin();
}
}


