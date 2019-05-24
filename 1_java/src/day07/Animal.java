package day07;

//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★

//class 선언부
public class Animal extends Object {
	
	String kind = "동물의 종류"; //
		
	//기본 생성자 함수반드시들어가야함 , 안들어가면 Dog class에 에러남

	public Animal(){
		super();
	}

	//source - using fields
	public Animal(String kind) { 
		this.kind = kind;
	}

	public void breath() {
		System.out.println("폐로 숨쉬기");
	}
	
	public void print() {
		
	}

	//default 
	
	
}

//Animal 상속받은 dog , 상속에 대해 언급 안하면 Object로 상속받음
//default
class Dog extends Animal{
	
	String name;
	String kind;
	
//생성자 자동으로 생성 , 생략됨		
	public Dog() {
		super("강아지과");
//		super.kind = "강아지";
	}

	public Dog(String name, String kind) {
		super("강아지과"); //()안에 값을 넣으면 Animal class에서 default 생성자없어도됨
		this.name = name;
		this.kind = kind;
	}
	
	public void print() {
		System.out.printf("동물[%s(%s), %s]%n",super.kind,this.kind,this.name);
	}
	
}

