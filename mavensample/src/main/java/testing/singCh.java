package testing;

public class singCh extends sinPa{
	int a=3;
	int b=7;
	public void childA()
	{
		int d=a-b;
		System.out.println("The value is:"+d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singCh obj=new singCh();
		obj.childA();
		obj.parentA();
		
		

	}

}
