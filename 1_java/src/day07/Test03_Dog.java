package day07;

public class Test03_Dog {
	public static void main(String[] args) {

		Dog d = new Dog("시베리안허스키","케리");
			d.print();
			
			//main에서 super키워드 사용 불가 -> casting
			d.breath();
			System.out.println(d.kind);
			//★Up casting
			System.out.println(((Animal)d).kind);
			System.out.println("--------------------------------------");
			
			//is ~ a(상속관계)
			Object a = new Dog("시베리안허스키","케리"); //a는 object equals랑toString
			
			//★Down Casting ->위험 ->instanceof 사용
			if(a instanceof Animal)
				System.out.println(((Animal)a).kind);
			
			if(a instanceof Dog)
				System.out.println(((Dog)a).kind);
			
			if(a instanceof String)
				System.out.println(((String)a).toString());			
	}
	

}
