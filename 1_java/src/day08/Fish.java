package day08;

public class Fish extends Animal{
	
	String name;
	
	//기본생성자
	public Fish(){
		super(); //super("물고기");
	}
	
	//파라미터1개
	public Fish(String name){
		//super(); //생략
		//super.kind="물고기"; ->super("물고기");
		
		super("물고기");
		this.name =  name;
	}
	

	public void print() {
		System.out.printf("동물[%s,%s]%n",super.kind,name); //this.kind = super.kind
	}
	
	//overriding
	@Override //오버라이딩 제대로 됬는지 확인해주는..@Override
	public void breath() {
		System.out.println("아가미로 숨쉬기");
	}
	
}
