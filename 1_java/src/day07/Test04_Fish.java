package day07;

public class Test04_Fish {
	public static void main(String[] args) {

		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리안허스키","케리");

		
		Animal a = f; //f,d허용
		
		a.breath();
		
		//print method 캐스팅안하고 호출하는거 -> overriding 유도해야함
		a.print();
		
	//	f.print();
	//	f.breath(); //그냥실행하면 폐로숨쉬기가나옴 -> 오버라이딩해서 피쉬자바에 아가미로숨쉬기 수정
	}

}
