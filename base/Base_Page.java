package base;
import org.openqa.selenium.WebDriver;

//constructor check
public class Base_Page {
	WebDriver driver;
	
	
	public Base_Page(WebDriver dv) {
		this.driver =dv;
		
	}
	
	public void maximize_window() {
		driver.manage().window().maximize();
	}
	public void getURL(String url) {
		driver.get(url);
	}
	
	public void startbrowser(String url) {
		maximize_window();
		getURL(url);
	}
	

}
