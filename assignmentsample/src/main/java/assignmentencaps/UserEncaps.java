package assignmentencaps;

import java.util.Scanner;

public class UserEncaps {
	
	public void validPin(int pin)
	{
		
		if(pin==1001)
		{
			System.out.println("The pin is valid");
		}
		else if(pin==1234)
		{
			System.out.println("The pin is valid");
		}
		else if(pin==1212)
		{
			System.out.println("The pin is valid");
		}
		
		else
		{
			System.out.println("The pin is not valid");
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
	
		BankEncaps obj=new BankEncaps();
		UserEncaps obj1=new UserEncaps();
		System.out.print("Enter the pin :");
		int enterpin=sc.nextInt();
		obj.setPin1(enterpin);
		obj1.validPin(obj.getPin1());
		
		
		
 
	}

}
