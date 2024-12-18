package assignmentinhertiance;

public class SalaryChildA extends SalaryParent {
	double hra;
	double pf;
	public void calDisplay()
	{
		hra=0.05*bp;
		pf=0.20*bp;
		System.out.println("the hra is:"+hra);
		System.out.println("the pf is:"+pf);
	}
	public static void main(String[] args) {
		SalaryChildA obj1=new SalaryChildA();
		obj1.parentDisplay();
		obj1.calDisplay();
	}
}
