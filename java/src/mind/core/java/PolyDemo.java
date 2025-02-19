package mind.core.java;
class Bank{
	float roi=10.05f;
	public void getROI() {
		System.out.println("the roi is" + roi);
	}
}
class Axis extends Bank {
	float roi=9.45f;
	public void getROI() {
		System.out.println("the roi is" + roi);
	}
}
class ICICI extends Bank{
	float roi=8.96f;
	public void getROI() {
		System.out.println("the roi is" + roi);
	}
}



public class PolyDemo {

	public static void main(String[] args) {
		Bank b;
		b=new Axis();
		b.getROI();
		b=new ICICI();
		b.getROI();

	}

}
