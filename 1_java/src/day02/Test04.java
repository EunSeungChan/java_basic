package day02;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		int num = 15;
		System.out.println(15%3);
		System.out.println(num++);
		
		Scanner keyboard = null;
		String msg = "hello";
		String msg2 = "hello"; // ""세미타입
		
		boolean flag = num < 15 && msg.length() > 0; //&보다는 &&사용
		System.out.println(flag);
		
		
		System.out.println(num == msg.length()); //""세미타입일때만동작
		System.out.println(msg.equals(msg2)); //참조형은 equals연산자
		System.out.println(msg == msg2); // 차이점 : =는 기본형,string equals메소드는 참조형,주소와가르키는값이같음
		
		
		System.out.println("==================================");
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2); //false, 주소가다르기때문에
		System.out.println(s1.equals(s2)); //true 
		
		System.out.println(4 << 2 ); //16(1000), 4(100) 쉬프트연산자
		System.out.println(4 >> 1 ); //2(10)
		System.out.println(4 & 1); //0, 4(100)1(001)->000 비트연산자
		
		keyboard = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		int jumsu = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		keyboard = null;
		
		System.out.println("유효성 검증");
		if(!(jumsu>=0 && jumsu<=100)) {
			return; //다시돌아가
		}
		System.out.println(jumsu >= 80 ? "PASS" : "NO_PASS"); //삼항연산자
		
		System.out.println("END");
		
	}

}			
