package maincode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Day_3_Alert_handling {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Utsav\\eclipse-workspace\\QA DAY2\\driver\\chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver chromeDriver = new ChromeDriver();
        
       // try {
            // Maximize the browser window
            chromeDriver.manage().window().maximize();
            
            // Navigate to the URL
            chromeDriver.get("https://demo.automationtesting.in/Alerts.html");
            
            // Handle Simple Alert
           /* WebElement simpleNav = chromeDriver.findElement(By.xpath("//a[@href='#OKTab']"));
            simpleNav.click();
            WebElement button1 = chromeDriver.findElement(By.xpath("//button[@onclick='alertbox()']"));
            button1.click();
            Thread.sleep(2000); // Wait for the alert to appear
            Alert simpleAlert = chromeDriver.switchTo().alert(); // Switch to the alert
            simpleAlert.accept(); // Click OK on the alert
           */ 
            // Handle Confirm Alert
           /* WebElement confirmNav = chromeDriver.findElement(By.xpath("//a[@href='#CancelTab']"));
            confirmNav.click();
            WebElement button2 = chromeDriver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
            button2.click();
            Thread.sleep(2000); // Wait for the alert to appear
            Alert confirmAlert = chromeDriver.switchTo().alert(); // Switch to the alert
            confirmAlert.dismiss(); // Click Cancel on the alert
          */  
            // Handle Prompt Alert
           WebElement txtBoxNav = chromeDriver.findElement(By.xpath("//a[@href='#Textbox']"));
            txtBoxNav.click();
            WebElement button3 = chromeDriver.findElement(By.xpath("//button[@onclick='promptbox()']"));
            button3.click();
            Thread.sleep(2000); // Wait for the alert to appear
            Alert promptAlert = chromeDriver.switchTo().alert(); // Switch to the alert
            promptAlert.sendKeys("Uv"); // Send text to the alert
            promptAlert.accept(); // Click OK on the alert
          
       // } catch (InterruptedException e) {
       //     e.printStackTrace();
        } 
        
    }
//}
