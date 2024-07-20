package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import base.Base_Page;
import pages.HomePage;
import pages.LoginPage;



public class NewTest {
	WebDriver dv;
  @Test
  public void f() {
	  LoginPage lp = new LoginPage(dv);
	  lp.login("testmorning","test123");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Utsav\\eclipse-workspace\\QA DAY2\\driver\\chromedriver.exe");
	  dv = new ChromeDriver();
	  Base_Page bp = new Base_Page(dv);		
	  bp.startbrowser("https:demoblaze.com");
	  HomePage hp = new HomePage(dv);
	  hp.click_nav_login();
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
