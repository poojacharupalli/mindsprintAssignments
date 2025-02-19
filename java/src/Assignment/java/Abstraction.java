package Assignment.java;

abstract class MNC extends Abstraction{
	MNC() {
		System.out.println("mnc is craeted");
		
	}
	abstract void leaves();
	abstract void holidays();
	public void bye() {
		System.out.println("bye, bye");
	}
	
	
	
	
	
	
}
abstract class Mindsprint extends MNC{
	public void holidays() {
		System.out.println("these are holidays");
	}
	abstract void leaves();
	
}
class Hello extends Mindsprint{
	public void leaves() {
		System.out.println("these are leaves");
	}
	public void bye() {
		System.out.println("bye bye");
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		MNC a=new Hello();
		a.leaves();
		a.holidays();
		a.bye();
		

	}

}
