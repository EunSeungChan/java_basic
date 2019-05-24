package day07;

public class Test02_Singleton {
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();

		System.out.println(s1 == s2);
		System.out.println(s1);
		System.out.println(s2);

		
	}

}

//Singleton -객체하나로 막아버리게끔,객체관리
class Singleton{
	static Singleton s = new Singleton();
	//객체생성 , private - 사용된부분에서만사용가능 ,외부에서 사용불가능
	private Singleton(){	}
	
	public static Singleton getInstance() {
		if(s == null) 
			s = new Singleton();
		return s;
	}
	
}
