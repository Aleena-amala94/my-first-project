package exceptionhandling;

public class ExceptionClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException obj)
		{
			//System.out.println("Exception handled");
			 b=2;
			 int d=a/b;
			 System.out.println(d);
		}
		finally
		{
			System.out.println("Exception not handled");
		}

	}

}
