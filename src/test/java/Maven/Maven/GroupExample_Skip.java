package Maven.Maven;

import org.testng.annotations.Test;

public class GroupExample_Skip {
  @Test(groups={"HDFCBank"})
  public void Branch1() {
	  System.out.println("Test 1 : HDFC Branch");
  }
  
  @Test(groups={"HDFCBank"},enabled=false)//Skip the Branch 2 execution
	public void Branch2(){
		System.out.println("Test 2 : HDFC Branch");
	}
	
	@Test(groups={"SBIBank"})
	public void Branch3(){
		System.out.println("Test 3 : SBI Branch");
	}
	
	@Test(groups={"SBIBank"})
	public void Branch4(){
		System.out.println("Test 4 : SBI Branch");
	}
	
	@Test(groups={"HDFCBank","Bank"})
	public void Branch5(){
		System.out.println("Test 5 : HDFC Branch and Main Bank");
}
}
