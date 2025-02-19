
import mind.core.java.*;

public class overload {
	public void area(int a,int b) {
		System.out.println("area is:"+(a+b));
		
	}
	public void area() {
		System.out.println("go away");
		
		
	}
	public void area(int a,int b,int c) {
		System.out.println("area is:"+(a+b+c));
	}

	public static void main(String[] args) {
		
		overload o=new overload();
		o.area();
		o.area(10,3);
		o.area(2,5,8);
	
		
		
		


	}