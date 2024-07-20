package maincode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty ("webdriver.chrome","//..//..//driver//chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/groups/797872194145953/?mibextid=A7sQZp&rdid=fx4K8ltY12VksFgP&share_url=https%3A%2F%2Fwww.facebook.com%2Fshare%2FNjrzS9j3YBghH7ww%2F%3Fmibextid%3DA7sQZp");
	}

}
