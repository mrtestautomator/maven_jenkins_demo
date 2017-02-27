package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	@Test
	@Parameters({"UserID"})
	public void login(String uid){
		System.out.println(uid);
	}

}
