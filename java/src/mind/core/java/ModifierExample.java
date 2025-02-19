package mind.core.java;

public class ModifierExample {
	public int sum(int a,int b) {
		int result = a+b; 
		return result;
	}
	public void display() {
		System.out.println("this is the display name..");
	}

	public static void main(String[] args) {
		ModifierExample e= new ModifierExample();
		
		e.display();
		int r=e.sum(2,3);
		System.out.println("the sum is:" +r);
		

	}

}


