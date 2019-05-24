package day07.ex;

class Employee extends Person{
	private String dept;
	
	//default생성자
	public Employee() {
		super(); //생략가능
	}
	
//	public Employee(String dept) {
//			this.dept = dept;
//		}
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.printf("[Employee]부서 : %s %n",this.dept);
	}

	
}