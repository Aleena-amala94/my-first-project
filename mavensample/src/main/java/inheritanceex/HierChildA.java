package inheritanceex;

public class HierChildA extends HieraParent{
public void display1()
{
	System.out.println("hierachial child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierChildA obj=new HierChildA();
		obj.display();
		obj.display1();
	}

}
