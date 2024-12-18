package assignmentinhertiance;

public class SalaryChildC extends SalaryChildB{
	
	public void salaryDisplay()
	{
		System.out.println("The salary slip:");
		System.out.println("The basic pay:"+bp);
		System.out.println("The deduction:"+ded);
		System.out.println("The bonus amount is:"+bonus);
		
	}

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		SalaryChildC obj=new SalaryChildC();
		obj.parentDisplay();
		obj.salaryDisplay();
		obj.calDisplay();
		obj.totDisplay();
		

	}

}
