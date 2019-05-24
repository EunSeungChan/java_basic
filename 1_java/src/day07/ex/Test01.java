package day07.ex;

public class Test01 {
	public static void main(String[] args) {
	
//		Student s = new Student("홍길동",20,200201);
//		//s.print();
//		Teacher t = new Teacher("이순신",30,"JAVA");
//		//t.print();
//		Employee e = new Employee("유관순",40,"교무과");
//		//e.print();

//		Person p;
//		
//		p = s;
//		
//		p.print();
	
		Person s1 = new Student("홍길동",20,200201);
		s1.print();
		Person t1 = new Teacher("이순신",30,"JAVA");
		t1.print();
		Person e1 = new Employee("유관순",40,"교무과");
		e1.print();
	
		//down-casting - person에는 print메소드가없음 ->instanceof
		
		
		}

}