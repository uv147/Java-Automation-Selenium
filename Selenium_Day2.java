import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Day2 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Utsav\\eclipse-workspace\\QA1\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
    }
}
