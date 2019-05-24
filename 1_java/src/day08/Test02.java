package day08;

public class Test02 {
	public static void main(String[] args) {

//		Animal a = new Animal(); //오류
//		Animal[] animals = new Animal[3]; //타입선언가능
		Animal[] animals = {
				new Fish("쿠피"),
				new Dog("시베리안허스키","케리")
		};
		
	//배열 - for
		for(Animal a:animals) {
			exec(a);
		}
		
	}
	
	//자바다형성(폴리모피즘)
		public static void exec(Animal f) {
			f.breath();
			f.print();
			
		}

}
