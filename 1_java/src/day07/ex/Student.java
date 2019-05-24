package day07.ex;

public class Student extends Person{
	private int id;
	
	//default생성자
	public Student() {
		
	}
//	public void Student(int id) {
//		this.id = id;
//		}
	
	public Student(String name, int age, int id) {
		super(name, age );
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print();
		System.out.printf("[Student]학번 : %d %n",this.id);
	}

}