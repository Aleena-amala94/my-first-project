package exceptionhandling;

public class ExceptionClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a[]= {1,2,3,4};
  try
  {
  for(int i=0;i<=4;i++)
  {
	  System.out.println(a[i]);
  }
	}
  catch(ArrayIndexOutOfBoundsException obj1)
  {
	  System.out.println("Exception handled");
  }
  finally
  {
	  System.out.println("End of program");
  }

}
}
