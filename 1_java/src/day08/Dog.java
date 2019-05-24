package day08;

//Animal 상속받은 dog , 상속에 대해 언급 안하면 Object로 상속받음
//default - public X
public class Dog extends Animal{ 
	
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
	
	@Override
	public void breath() {
		System.out.println("폐로 숨쉬기");
		
	}
	
	public void print() {
		System.out.printf("동물[%s(%s), %s]%n",super.kind,this.kind,this.name);
	}


	
}