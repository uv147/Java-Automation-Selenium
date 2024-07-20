package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	public class HomePage {
	
		WebDriver driver;
	
		public HomePage(WebDriver dv) {
			this.driver =dv;
			
		}	
		By navLogin = By.id("login2");
		
		
	public void click_nav_login() {
			driver.findElement(navLogin).click();
		}
	
	

}
