package assignmentsuper;

public class SuperDivision extends SuperAddition {

	
	public void division()
	{
		super.sum();
		System.out.println("The sum is:"+sum);
		if(sum%10==0)
			
		{
			System.out.println("The sum is divisible");
		}
		
		else
		{
			System.out.println("The sum is not divisible");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperDivision obj=new SuperDivision();
		obj.sum();
		obj.division();
	}

}
