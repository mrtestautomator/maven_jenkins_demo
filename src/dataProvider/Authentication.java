package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Authentication {
	
	@DataProvider
	public Object[] [] getData(){
		 Object[][] data=new Object[3][2];
		 data[0][0]="1uid";
		 data[0][1]="1pwd";
		 
		 data[1][0]="2uid";
		 data[1][1]="2pwd";
		 
		 data[2][0]="3uid";
		 data[2][1]="3pwd";
		 return data;
	}

	@Test(dataProvider="getData")
	public  void login(String UID,String PWD){
		
		System.out.println(UID);
		System.out.println(PWD+"\n");
		
	}

}
