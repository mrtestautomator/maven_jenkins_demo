package testngTicket;

import org.testng.annotations.Test;

public class Booking {

	@Test
	public void ticketBooking(){
		System.out.println("2  ticket Selected");
	}
	
	@Test()
	public void payment(){
		System.out.println("3  Payment sucessfull");
	}
	
	@Test(groups={"group 1"})
	public void login(){
		System.out.println("1  login sucessfull");
	}
	
	@Test(groups={"group 1"})
	public void signout(){
		System.out.println("5  Signout");
	}
	
	@Test()
	public void printTicket(){
		System.out.println("4  Please carry id proof");
	}
}

