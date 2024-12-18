package aggregationex;

public class AggreChild {
	int roll;
	String sub;
	AggreParent ref;
	public AggreChild(int roll,String sub,AggreParent ref)
	{
	this.roll=roll;
	this.sub=sub;
	this.ref=ref;
	
	}
	
	public void display()
	{
		System.out.println("The age is:"+ref.age);
		System.out.println("The name is:"+ref.name);
		System.out.println("The roll number is:"+roll);
		System.out.println("The subject is:"+sub);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreParent obj1=new AggreParent(21,"Arun");
		AggreChild obj=new AggreChild (112,"Maths",obj1);
		obj.display();

	}

}
