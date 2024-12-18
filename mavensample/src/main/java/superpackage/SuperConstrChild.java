package superpackage;

public class SuperConstrChild extends SuperConstrParent  {
	
	public SuperConstrChild()
	{
		super(10,3);
	System.out.println("This is child constr");	
	}
	public SuperConstrChild(float x,int y,int z)
	{
		super(10,11,13);
		float sum=x+y+z;
	
	System.out.println("The sum is:"+sum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstrChild obj1=new SuperConstrChild ();
		SuperConstrChild obj2=new SuperConstrChild (1.2f,4,6);
	}

}
