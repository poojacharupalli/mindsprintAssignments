package Assignment.java;

public class methods {
	public void display() {
		System.out.println("calculating si");
	}
	public int si(int p,int t,int r) {
		display();
		return p*t*r/100;
	}
	

	public static void main(String[] args) {
		
		methods s=new methods();
		
		int p=1000;
		int t=10;
		int r=2;
		
		
		System.out.println(p+r);
		System.out.println(s.si(p, t, r));
		

	}

}
