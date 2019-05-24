package day09.inner;

//interface Command {
//
//	void exec(); 
//	default public void process() { 
//		System.out.println("process()");
//	}
//	
//} -> import사용
import day09.Command;

public class Test03 {
	public static void main(String[] args) {
		
		//람다표현 -> 추상메서드가 꼭 하나여야함
		Command delete = () -> System.out.println("delete 수행");
		Command update = () ->	System.out.println("update 수행");
		Command create = ()	->	System.out.println("create 수행");
		Command list = () -> System.out.println("list 수행");
		
		delete.exec(); //객체지향
				
		
		
	}

}
