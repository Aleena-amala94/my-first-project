package superpackage;

public class SuperMethChild extends  SuperMethParent{
	
public void display1()
{
	
	System.out.println("This is super method child class");
	super.display();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperMethChild obj=new SuperMethChild();
		obj.display1();
	}

}
