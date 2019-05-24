package day07;

/**
 * 
 * @author 김영선
 * @since 2019.05.02
 */
 

public class Prob07 {
	public static void main(String[] args) {
	
		Student s = new Student("홍길동",20,200201);
		Teacher t = new Teacher("이순신",30,"JAVA");
		Employee e = new Employee("유관순",40,"교무과");
		
		Person p;
		
		p = s;
		
		p.print();
		
//		s.print1();
//		t.print2();
//		e.print3();
		
		
		}

}

class Person{
	 private String name;
	 private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void print() {
	}
	
}


class Student extends Person{
	private int id;
	
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
		System.out.printf("이름 : %s 나이 : %d  학번 : %d %n",getName(),getAge(),this.id);
	}

}


class Teacher extends Person{
	private String subject;
	
	public Teacher() {
			
		}
	
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void print() {
		System.out.printf("이름 : %s 나이 : %d  담당과목 : %s %n",getName(),getAge(),this.subject);
	}

}


class Employee extends Person{
	private String dept;
	
	public Employee() {
		
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
		System.out.printf("이름 : %s 나이 : %d  부서 : %s %n",getName(),getAge(),this.dept);
	}

	
}