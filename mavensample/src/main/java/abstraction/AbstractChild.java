package abstraction;

public class AbstractChild extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractChild obj=new AbstractChild();//reference of abstract class
		obj.methodA();
		obj.display();
		obj.displayA();
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("abstarction");
		
	}
	
	public void displayA()
	{
  System.out.println("method display");
}
}
