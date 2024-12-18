package AssignmentCollection;

import java.util.ArrayList;

public class Color {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cl=new ArrayList<String>();
		cl.add("Black");
		cl.add("White");
		cl.add("Blue");
		cl.add("Green");
		System.out.println(cl);
		
		System.out.println(cl.get(3));
		
		String color[]= {"red,white,black"};
		for (String clr:color)
		{
			System.out.println(clr);
		}
		cl.add("Green");
		System.out.println(cl);
		System.out.println(cl.remove(2));
		System.out.println(cl);
		cl.contains("Red");
		if(cl.isEmpty())
		{
			System.out.println("The list is empty");
		}
		else
		{
			System.out.println("The list is not empty");
		}
	}

}
