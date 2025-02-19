package Assignment.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class SetInterface {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        Random random = new Random();
	        LinkedHashSet<Integer> l2 = new LinkedHashSet<>();

	        System.out.println("10 unique random numbers:");

	       for (int i=0;i<10;i++) {
	        	l2.add(sc.nextInt());
	        	
	           }
		LinkedHashSet l1=new LinkedHashSet();
	
		l1.add(1);
		l1.add(2);
		l1.add(6.5f);
		l1.add(3.67f);
		l1.add('p');
		l1.add('o');
		l1.add(true);
		l1.add(4);
		l1.add(5);
		l1.remove(1);
		l1.isEmpty();
		l1.contains(5);
		//l1.clear();
		l2.add(78);
		l2.add(56);
		l2.remove(2);
		l2.isEmpty();
		l2.contains(5);
		System.out.println(l2);
		System.out.println(l1);
		
		
		
		
		

	
	        


	}}
