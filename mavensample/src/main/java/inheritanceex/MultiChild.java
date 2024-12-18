package inheritanceex;


public class MultiChild extends MultiIntermediate {
public void display2()
{
	System.out.println("Multi Child");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiChild obj=new MultiChild();
		obj.display();
		obj.display1();
		obj.display2();
	}

}
