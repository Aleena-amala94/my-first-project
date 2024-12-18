package polymorphism;

public class OverrideChild extends OverrideParent{
	
	public void display(int a,int b)
	{
		super.display(12, 10);
		int c=a-b;
		System.out.println("The difference is:"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideChild obj=new OverrideChild();
		obj.display(10,6);
	}

}
