package interfaceex;

public class InterChild implements InterParentA,InterParentB,InterParentC
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterChild obj=new InterChild();
		obj.show();
		obj.displayA();
		obj.displayB();
	}

	@Override
	public void show() 
	{
		// TODO Auto-generated method stub
		System.out.println("Interface parent b");
		
	}

	@Override
	public void displayA() 
	{
		// TODO Auto-generated method stub
		System.out.println("Interface parent a");
		
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("Interface parent c");
		
	}

}
