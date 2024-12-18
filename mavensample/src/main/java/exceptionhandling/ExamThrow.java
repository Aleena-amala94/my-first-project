package exceptionhandling;

public class ExamThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		for(int i=0;i<=3;i++)//ArrayIndexOutOfBoundsException:
		{
      
       throw new ArrayIndexOutOfBoundsException(a[i]);
	}

	}

}
