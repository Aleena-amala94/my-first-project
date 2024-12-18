package accessmodifier;

public class Access1 {
	
	private void privateMethod()
	{
		System.out.println("private method");
	}
 
	public void publicMethod()
	{
		System.out.println("public method");
	}
	
	 void defaultMethod()
		{
			System.out.println("default method");
		}
	 protected void protectedMethod()
		{
			System.out.println("protected method");
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Access1 obj=new Access1 ();
		obj.privateMethod();
		obj.publicMethod();
		obj.defaultMethod();
		obj.protectedMethod();

	}

}
