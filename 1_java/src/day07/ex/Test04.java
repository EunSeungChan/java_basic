package day07.ex;
public class Test04 {
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
	
//Student 200명 Teacher 100명 -> 배열
		
		Person[] p1 = {
				new Student("홍길동",20,200201),
				new Student("김길동",23,200202),
				new Student("최길동",25,200203),
				new Student("한길동",27,200204),
				new Teacher("이선생",30,"JAVA"),
				new Teacher("고선생",34,"SQL"),
				new Employee("유관순",40,"교무과")
		};
	
		
		for(Person data : p1) {
			personPrint(data); //data.print();가능 ,personPrint앞에 class이름 생략
		}
		for(int i=0;i<p1.length;i++) { //for(Person data : p1)
			//p1배열에서 Student 객체만 찾아서 학생이름만 출력 -> down-casting , instanceof
			if(p1[i] instanceof Student) {
				System.out.print("학번 : "+((Student)p1[i]).getId());
				System.out.println(p1[i].getName().charAt(0)+"**");
				Student s = (Student)p1[i];
			}
			
		}
			System.out.println("------------------------------");
		
		
		}
	
	public static void personPrint(Person p) { 
		//객체생성없이 ,person에 print 메소드있어야함 ->없으면 오류 ,객체가어떤게오느냐에 따라서 결과값틀려짐
		p.print();
	}


}