package assignmentabstract;

public class FullTimeEmp extends Employee {
     private int sal;
     
     public FullTimeEmp(int sal)
     {
    	 this.sal=sal;
     }
     
	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		
		return sal*8;
	}

}
