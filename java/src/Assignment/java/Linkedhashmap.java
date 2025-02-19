package Assignment.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhashmap {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> l = new LinkedHashMap<Integer, String>();
		l.put(1,"india" );
        l.put(2, "aus");
        l.put(3,"usa" );
        l.put(4, "spain");
        l.put(5, "arge");
        l.put(6, "japan");
        l.put(7, "china");
        l.put(8, "eng");
        l.put(9, "srilan");
        l.put(10, "bhu");
        System.out.println(l.keySet());
        System.out.println(l.sequencedValues());
        if(l.containsKey("india")) {
        	System.out.println("yes india is present");
        }
        System.out.println(l.containsKey(45));
        l.remove("bhu");
        LinkedHashMap<Integer, String>l1 = new LinkedHashMap<Integer, String>();
        l1.put(11, "telangana");
        l1.put(12, "andra");
        l.putAll(l1);
        l.remove(5);
        System.out.println(l.isEmpty());
        System.out.println(l);
        l.clear();
        System.out.println(l.isEmpty());
	}

}
