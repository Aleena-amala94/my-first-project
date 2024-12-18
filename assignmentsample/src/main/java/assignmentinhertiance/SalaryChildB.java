package assignmentinhertiance;

public class SalaryChildB extends SalaryChildA {
	double tot;
	
	public void totDisplay()
	{
		tot=bp+hra-pf-ded+bonus;
		System.out.println("The total salary is:"+tot);
		
	}

}
