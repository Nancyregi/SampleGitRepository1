package Maven.Maven;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest_Demo {
  
  @Parameters("myName")
  @Test
  public void parameterTest(String myName) {
	  System.out.println("Parameterized value is : " + myName);
  }
}
