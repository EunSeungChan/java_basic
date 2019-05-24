package day07.ex;

public class Test02 {
	public static void main(String[] args) {
	
//		Student s11 = new Student("홍길동",20,200201);
//		//s1.print();
//		Teacher t1 = new Teacher("이순신",30,"JAVA");
//		//t1.print();
//		Employee e1 = new Employee("유관순",40,"교무과");
//		//e1.print();

//		Person p;
//		
//		p = s;
//		
//		p.print();
	
		Student s1 = new Student("홍길동",20,200201);
		Teacher t1 = new Teacher("이순신",30,"JAVA");
		Employee e1 = new Employee("유관순",40,"교무과");
	
		Test02.personPrint(s1);
		Test02.personPrint(t1);
		Test02.personPrint(e1);
		
		
		//down-casting - person에는 print메소드가없음 ->instanceof
		
		
		}
	
	public static void personPrint(Student s) { //객체생성없이 
		s.print();
	}
	
	public static void personPrint(Teacher t) { //객체생성없이 
		t.print();
	}
	
	public static void personPrint(Employee e) { //객체생성없이 
		e.print();
	}

}