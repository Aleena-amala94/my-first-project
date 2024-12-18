package superpackage;

public class SuperInstChild extends SuperInstParent {
	String color="purple";
public void display()
{
	System.out.println(super.color);
	System.out.println("The color is:"+color);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperInstChild obj=new SuperInstChild();
		obj.display();
	}

}
