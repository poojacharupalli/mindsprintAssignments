package mind.core.java;

public class EncapsulationDemo {
	private String name;
	private float salary;
	private int empid;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public static void main(String[] args) {
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setEmpid(101);
		ed.setName("pooja");
		ed.setSalary(520000);
		System.out.println(ed.getEmpid());
		System.out.println(ed.getName());
		System.out.println(ed.getSalary());
		
		

	}

}
