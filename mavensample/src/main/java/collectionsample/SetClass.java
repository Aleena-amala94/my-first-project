package collectionsample;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> sn=new HashSet<String>();
		sn.add("red");
		sn.add("white");
		sn.add("black");
		sn.add("rose");
		sn.add("purple");
		System.out.println(sn);
		System.out.println(sn.contains("rose"));
		System.out.println(sn.remove("black"));
		System.out.println(sn);
		System.out.println(sn.size());
		sn.clear();
		System.out.println(sn);
		sn.add("red");
		sn.add("white");
		sn.add("black");
		sn.add("rose");
		sn.add("purple");
		System.out.println(sn);
		Set<String> sn1=new HashSet<String>();
		sn1.add("blue");
		sn1.add("brown");

		System.out.println(sn1);
		System.out.println(sn1.addAll(sn));
		System.out.println(sn1);
		System.out.println(sn1.contains("blue"));
		System.out.println(sn1.containsAll(sn));
	}

}

