package Assignment.java;

public class overloading {

	public float area(float r) {
		return 3.14f*r*r;
		
		
	}
	public int area(int a) {
		return a*a;
	}
	public float area(float a,float b) {
		return a*b;
	}
	public int area(int a,int b) {
		return a*b/2;
	}
	

	public static void main(String[] args) {
		overloading o=new overloading();
		int circle=(int)o.area(1.2f);
		long square=o.area(5);
		float rectangle=o.area(1.2f,3.2f);
		int rhombus=o.area(4, 6);
		System.out.println(circle);
		System.out.println(square);
		System.out.println(rectangle);
		System.out.println(rhombus);
		
		
		
		
		
		
		


	}

}
