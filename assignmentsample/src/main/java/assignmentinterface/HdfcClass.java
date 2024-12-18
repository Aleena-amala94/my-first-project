package assignmentinterface;

public class HdfcClass implements RBIinterface {
 double amount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBIinterface obj=new HdfcClass();
		obj.recurringDeposit();

	}

	@Override
	public void recurringDeposit() {
		// TODO Auto-generated method stub
		double dep=5000;
		int duration=2;
		amount=dep*Math.pow(1+interest, duration);
		System.out.println("The deposit amount is:"+dep);
		System.out.println("The interest is:"+interest);
		System.out.println("The duration of deposit is:"+duration);
		System.out.println("The final amount is:"+amount);
		
		
	}

	
		
	}


