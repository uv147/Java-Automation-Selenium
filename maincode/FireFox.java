package maincode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.Gecko.driver","C:\\Users\\Utsav\\eclipse-workspace\\QA DAY2\\driver\\geckodriver.exe");
		WebDriver firefoxDriver = new FirefoxDriver();
		firefoxDriver.manage().window().maximize();
		firefoxDriver.get("https://bishalkarki.xyz");

	}

}
