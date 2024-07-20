package maincode;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class Day5_Test {
	@AfterTest
	void After_Test() {
		System.out.println("After Test");
	}
	@BeforeTest
	void Before_Test() {
		System.out.println("Before Test");
	}
	@Test
	void New_Test() {
		System.out.println("During First Test");
	}

	@Test
	void second_Test() {
		System.out.println("During second Test");
	}

}
