package assessments;
 
public class Ecommerce {
     int prod_id;
     String name;
     int price;
     static int discount=5;
     public void static_assignment() {
    	 prod_id=1045;
    	 name="Mindsprint";
    	 price=100;
    	
    	
     }
     public void display() {
    	 System.out.println("product id:"+prod_id);
    	 System.out.println("Name :"+name);
    	 System.out.println("price :"+price);
     }
     public int original() {
    	 return price-price*discount/100;
     }
     public int print() {
    	 return price*100-price*discount/100;
     }
     
	public static void main(String[] args) {
		Ecommerce p1=new Ecommerce();
		Ecommerce p2=new Ecommerce();
		Ecommerce p3=new Ecommerce();
		Ecommerce p4=new Ecommerce();
		p1.name="phone";
		p1.price=30000;
		p1.prod_id=1001;
		p1.display();
		System.out.println(p1.original());
		p2.name="laptop";
		p2.price=80000;
		p2.prod_id=1002;
		p2.display();
		System.out.println(p2.original());
		p3.name="watch";
		p3.price=2000;
		p3.prod_id=1003;
		p3.display();
		
		System.out.println(p3.original());
		p4.name="shirt";
		p4.price=900;
		p4.prod_id=1004;
		p4.display();
		System.out.println(p4.original());	
		Ecommerce.discount=10;
		System.out.println(p1.print());
		System.out.println(Ecommerce.discount);
		System.out.println(p2.print());
		Ecommerce.discount=30;
		System.out.println(p3.print());
		System.out.println(p4.print());
	}
 
}
 