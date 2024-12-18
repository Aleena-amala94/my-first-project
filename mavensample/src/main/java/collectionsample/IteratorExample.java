package collectionsample;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s=new ArrayList<String>();
		
		s.add("red");
		s.add("white");
		s.add("black");
		s.add("rose");
		s.add("purple");
		System.out.println(s);
		
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		it.remove();//last element remove
		System.out.println(s);
	}

}
