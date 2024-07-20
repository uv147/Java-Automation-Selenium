package maincode;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.*;

public class Implicitly_Test {
	WebDriver chromeDriver;
  @Test
  public void f() {
	  WebElement navLogin,txt_box_username,txt_box_password,loginButton;
		
	 try {
		  navLogin = chromeDriver.findElement(By.id("login2"));
			navLogin.click();
			//Thread.sleep(10000);
			chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			txt_box_username = chromeDriver.findElement(By.id("loginusername"));
			txt_box_username.sendKeys("testmorning");
			
			txt_box_password = chromeDriver.findElement(By.id("loginpassword"));
			txt_box_password.sendKeys("test123");
			
			loginButton = chromeDriver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
			loginButton.click();
			Thread.sleep(5000);
			String expectedResult = "Welcome testmorning";
			String ActualResult = chromeDriver.findElement(By.id("nameofuser")).getText();
			Assert.assertEquals(ActualResult,expectedResult,"This is not same user");
	  }
	  
	  
	 catch (Exception e){
		 System.out.println(e);
  }
		  
	 }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Utsav\\eclipse-workspace\\QA DAY2\\driver\\chromedriver.exe");
		chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get("https://demoblaze.com/index.html");
  }

  @AfterTest
  public void afterTest() {
	 chromeDriver.close();
  }

}
