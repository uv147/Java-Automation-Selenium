package maincode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.edge.EdgeDriver;
public class Edge_Day1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.Edge.driver","C:\\Users\\Utsav\\eclipse-workspace\\QA DAY2\\driver\\msedgedriver.exe");
		WebDriver EdgeDriver = new EdgeDriver();
		EdgeDriver.manage().window().maximize();
		EdgeDriver.get("https://www.youtube.com/");

	}

}
