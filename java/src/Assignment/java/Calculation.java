package Assignment.java;

public class Calculation {
	public int method(int a,int b) {
		return a+b;
	}
	public long method(long a,long b) {
		return a/b;
	}
	public float method(float a,float b) {
		return a*b;
	}
	public double method(double a,double b) {
		return a-b;
	}
	public boolean even(int a) {
		return a%2==0;
		
		
	}
	public boolean prime(int a) {
	    if (a <= 1) {
	        return false;
	    }
	    for (int i = 2; i <= Math.sqrt(a); i++) {
	        if (a % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
    public static void main(String[] args) {
		Calculation obj=new Calculation();
		System.out.println(obj.method(6, 2));
		System.out.println(obj.method(4, 1));
		System.out.println(obj.method(6.5, 4.2));
		System.out.println(obj.method(24, 4));
		System.out.println(obj.even(5));
		System.out.println(obj.prime(7));

	}

	
}
