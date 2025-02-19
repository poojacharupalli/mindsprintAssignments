package mind.core.java;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		
		
		hs.add("INDIA");
		System.out.println("the hashset is"+hs);
		System.out.println(hs.contains("INDIA"));
		System.out.println(hs.remove(340));
		System.out.println(hs.isEmpty());
		//hs.clear();
		
		LinkedHashSet<String> hss=new LinkedHashSet<String>();
		hss.add("india");
		hss.add(new String("java"));
		hss.add("sri lanka");
		hss.add("html");
		hss.add("python");
		
		System.out.println("the hashset is "+hss);
		hss.addAll(hs);
		System.out.println("the hashset is "+hss);
		
		TreeSet<String> hsss=new TreeSet<String>();
		hsss.add("india");
		hsss.add(new String("java"));
		hsss.add("sri");
		hsss.add("html");
		hsss.add("python");
		
		System.out.println("the hashset is "+hsss);
		hsss.addAll(hss);
		System.out.println("the hashset is "+hsss);
		
		
		
		
		

	}

}
