package abstraction;

public class AbstractB extends AbstractA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractA obj=new AbstractB();
		obj.displayA();
		obj.displayB();
		//obj.displayC();// unable to get in normal class
	}

	@Override
	void displayA() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}
//public void displayC()
{
	System.out.println("december");
}
}
