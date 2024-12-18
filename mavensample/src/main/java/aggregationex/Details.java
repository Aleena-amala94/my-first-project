package aggregationex;

public class Details {
	
	int quan;
	int price;
	Product ref;
	public Details(int quan,int price,Product ref)
	{
		this.quan=quan;
		this.price=price;
		this.ref=ref;
	}
  public void display()
  {
	  System.out.println("The product id is:"+ref.id);
	  System.out.println("The product name id is:"+ref.name);
	  System.out.println("The product quantity is:"+quan);
	  System.out.println("The product price is:"+price);
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj1=new Product(111,"cake");
		Details obj=new Details (2,300,obj1);
		obj.display();
		
		
		
	}

}
