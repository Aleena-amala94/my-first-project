package mavensample1;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world"; 
		System.out.println(s);
		char c[]= {'a','b','c'};
		String s1=new String(c);
		System.out.println(s1);
		//Length
		int len=s.length();
		System.out.println(len);
		//concatenation
		String s2="welcome";
		System.out.println(s2.concat(s));
		//contains
		String s3="xmas is coming";
		System.out.println(s3.contains(" is"));
		//equals
		String s4="hi";
		String s5="hi";
		String s6="hello";
		String s7="Hi";
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s4.equals(s7));
	}

}
