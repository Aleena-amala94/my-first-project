package assignmentinhertiance;

import java.util.Scanner;

public class SalaryParent {
	Double bp;
	Double ded;
	Double bonus;
	public void parentDisplay()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic pay :");
		bp=sc.nextDouble();
		System.out.print("Enter the deduction:");
		ded=sc.nextDouble();
		System.out.print("The bonus is"+"\t:");
		bonus=sc.nextDouble();
	}
	

}
