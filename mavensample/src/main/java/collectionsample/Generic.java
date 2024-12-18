package collectionsample;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> sname=new ArrayList<String>();
sname.add("red");
sname.add("white");
sname.add("black");
sname.add("rose");
sname.add("purple");

System.out.println(sname);
sname.set(2, "green");//replace a word
System.out.println(sname);

sname.add("purple");
System.out.println(sname);
System.out.println(sname.indexOf("purple"));//to understand repeated word
System.out.println(sname.lastIndexOf("rose"));
System.out.println(sname.remove(4));
System.out.println(sname);
System.out.println(sname.get(1));
System.out.println(sname.contains("brown"));//to check if it's available in list
if(sname.isEmpty())
{
	System.out.println("The list is empty");
}
else
{
	System.out.println("The list is not empty");
}
	
	System.out.println(sname.size());
	/*for (int i=0;i<sname.size();i++)
	{
		System.out.println(sname.get(i));
	}*/
	for(String name:sname)
	{
		System.out.println(name);
	}
	
	}

}
