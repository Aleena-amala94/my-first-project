package inheritanceex;

public class SingleChild extends SingleParent {
	public void display1()
	{
		System.out.println("single child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleChild obj=new SingleChild();
		obj.display1();
		obj.display();
	}

}
