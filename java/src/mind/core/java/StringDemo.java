package mind.core.java;

public class StringDemo {

	public static void main(String[] args) {
		String a="Java";
		String b=new String("Java");
		String r="HTML";
		String t="python";
		String m="HTML";
		String g=new String("Python");
		if(a.equals(b)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		if(a==b) {
			System.out.println("true address");
		}
		else {
			System.out.println("false address");
		}
		if(t.equals(g)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}


	}

}
