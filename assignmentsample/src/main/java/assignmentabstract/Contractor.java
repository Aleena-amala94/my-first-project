package assignmentabstract;

public class Contractor extends Employee {
	

	private int perhr;
	
	private int wrkhr;
	public Contractor(int perhr,int wrkhr)
	{
		this.perhr=perhr;
		this.wrkhr=wrkhr;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Contractor obj=new Contractor(60,8);
		System.out.println("The contarctor salary is:"+ obj.calculateSalary());
		FullTimeEmp obj1= new FullTimeEmp(400);
		System.out.println("The salary of full time employee:"+obj1.calculateSalary());
		
	}

	
	
	

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		
		return perhr*wrkhr;
		
	}
	
	

}
