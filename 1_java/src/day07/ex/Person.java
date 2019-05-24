package day07.ex;

public class Person{
	 private String name;
	 private int age; 
	 //protected : 다른패키지의 자식한테 접근허용가능 ,private : 같은클래스(접근방법,set,get) ,default : 
	 
	
	//default생성자
	public Person() {
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//overriding 유도 ,명시적-빈칸
	public void print() {	
		System.out.printf("이름 : %s 나이 : %d  ",name,age);
	}
	
}