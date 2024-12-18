package exceptionhandling;

public class ExceptionThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=11;
		if(age>18)
		{
			System.out.println("eligible for voting");
		}
		else if(age<18)
		{
			throw new ArithmeticException("Not eligible");
		}
		else
		{
			throw new NullPointerException("null");
		}
	}

}
