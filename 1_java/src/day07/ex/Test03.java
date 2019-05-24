package day07.ex;

public class Test03 {
	public static void main(String[] args) {
	
//		Student s1 = new Student("홍길동",20,200201);
//		//s1.print();
//		Teacher t1 = new Teacher("이순신",30,"JAVA");
//		//t1.print();
//		Employee e1 = new Employee("유관순",40,"교무과");
//		//e1.print();

//		Person p;
//		
//		p = s1;
//		
//		p.print();
	
		Person s1 = new Student("홍길동",20,200201);
		Person t1 = new Teacher("이순신",30,"JAVA");
		Person e1 = new Employee("유관순",40,"교무과");
	
		
		Test03.personPrint(s1);
		Test03.personPrint(t1);
		Test03.personPrint(e1);
		
		
		//down-casting - person에는 print메소드가없음 ->instanceof
		
		
		}
	
	public static void personPrint(Person p) { 
		//객체생성없이 ,person에 print 메소드있어야함 ->없으면 오류 ,객체가어떤게오느냐에 따라서 결과값틀려짐
		p.print();
	}


}