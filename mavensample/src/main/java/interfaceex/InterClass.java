package interfaceex;

public class InterClass implements InterfaceExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample obj=new InterClass();
		obj.display();
		System.out.println(obj.a);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Interface");
	}

}
