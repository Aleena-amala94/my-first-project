package collectionsample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("red");
		s.add("white");
		s.add("black");
		s.add("rose");
		s.add("purple");
		System.out.println(s);
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("brown");
		s1.add("blue");
		System.out.println(s1);
		System.out.println(s.addAll(s1));
		System.out.println(s);

	}

}
