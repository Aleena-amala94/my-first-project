package exceptionhandling;

public class ExceptionThrows {
	
	public static void displayA() throws ArithmeticException
	{
	System.out.println("hi");	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		ExceptionThrows.displayA(); 
	}
		catch(ArithmeticException obj)
		{
			System.out.println("hello");
		}
		
	}
	

}
