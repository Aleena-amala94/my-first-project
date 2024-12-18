package inheritanceex;

public class HierChildB extends HieraParent {
	public void display2()
	{
		System.out.println("hierachial child B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildB obj1=new HierChildB();
		obj1.display();
		obj1.display2();
	}

}
