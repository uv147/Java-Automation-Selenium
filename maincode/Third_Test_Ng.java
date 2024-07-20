package maincode;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Third_Test_Ng {
  @Test
  public void f() {
	  System.out.println("Test run");
  }
  @Test
  public void fA() {
	  System.out.println("Test run2");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Test Before");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Test after");
  }

}
