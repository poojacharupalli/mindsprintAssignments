package Assignment.java;

public class Stringpool {


	public static void main(String[] args) {
		String t="Delhi";
		String o="Mumbai";
		String k="delhi";
		String y=new String("Mumbai");
		String l=new String("delhi");
		String p=new String("Hello");
		StringBuffer sf=new StringBuffer("Delhi");
		sf.append("is a place");
		System.out.println(sf);
		sf.indexOf("is");
		sf.delete(3, 5);
		System.out.println(sf);
		sf.insert(5,"welcome");
		System.out.println(sf);
		sf.reverse();
		
		if(o == l){
			 System.out.println("true address");
		 }
		 else{
			 System.out.println("false address");
		 }
		if(y == p){
			 System.out.println("true address");
		 }
		 else{
			 System.out.println("false address");
		 }
		 if(p == y){
			 System.out.println("true address");
		 }
		 else{
			 System.out.println("false address");
		 }
		if(o.equals(l)){
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		 if(y.equals(p)){
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		if(t.equals(o)){
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		if(k.equals(y)){
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		 if(p.equals(y)){
			 System.out.println("true");
		 }
		 else{
			 System.out.println("false");
		 }
		
		

	}

}

