package Assignment.java;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("orange");
		a.add("banana");
		a.add("apple");
		a.add("guava");
		a.add("strawberry");
		a.add("kiwi");
		a.add("hyderabad");
		a.add("chennai");
		a.add("dance");
		a.add("netflix");
		System.out.println(a);
		a.remove("netflix");
		a.contains("cricket");
		a.remove(3);
		a.remove(5);
		a.set(6, "singing");
		Collections.reverse(a);
		a.add(3, "kerala");
		a.add(1,"Mango");
		   System.out.println("New Arraylist is "+a);
	        System.out.println(a.subList(2, 5));
		
		}

}
