package Assignment.java;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("april");
		l.add("may");
		l.add("june");
		l.add("july");
		l.add("august");
		
		l.add("november");
		l.addLast("december");
		l.addFirst("january");
		l.add(1,"febraury");
		l.add(2,"march");
		l.add(8,"september");
		l.add(9,"october");
		System.out.println(l);
		for(int i=0;i<l.size();i+=2) {
			l.get(i);
		}
		for(int i=1;i<l.size();i+=2) {
			l.get(i);
		}

        Iterator itr1=l.iterator();
        while(itr1.hasNext()) {
        System.out.println(itr1.next());}
        System.out.println(l.get(0));
        System.out.println(l.get(l.size()-1));
        l.remove(4);
        System.out.println(l);
        if(l.contains("january") ||  l.contains("febrauary") ||  l.contains("december") ) {
        	System.out.println("these are winter months");
        }
        System.out.println(l.peek());
        System.out.println(l.peekFirst());
        System.out.println(l.peekLast());
        System.out.println(l.pollFirst());
        System.out.println(l.pollLast());
        System.out.println(l);
	
	}
}
