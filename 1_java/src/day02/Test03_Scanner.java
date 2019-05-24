package day02;

import java.util.Scanner;

public class Test03_Scanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //System.in : 키보드
		
		System.out.print("이름을 입력하세요_");
		System.out.println();
		String name =  keyboard.nextLine();
		
		System.out.print("나이를 입력하세요_");
		System.out.println();
		int age = Integer.parseInt(keyboard.next());
		
		System.out.println("국어/영어/수학 점수를 입력하세요_"); //리스트상자,선택할수있게
		System.out.println("입력예)90 90 70 처럼 점수를입력후 엔터"); //가이드라인제시
		
		int k1 = keyboard.nextInt(); //90
		int k2 = keyboard.nextInt(); //90
		int k3 = keyboard.nextInt(); //70, 이렇게하면 뒤에 엔터가남아있음,데이터가섞일수 있음
		keyboard.hasNextLine(); //뒤에남아있는엔터를처리
		
		System.out.println("**** 입력정보 확인 ****");
		System.out.printf("[이름=%s , 나이=%d]%n",name,age);
		System.out.printf("[국어=%s 영어=%s 수학=%s 평균=%.2f %n]",
				k1,k2,k3,(k1=k2=k3)/3.);
		System.out.println("**** 입력정보 확인 ****");
		
		keyboard.close(); //컴파일러가잡아내지못하기때문에 null전에 써야함
		keyboard = null; //명시적인자원반납해야함 
		
	}

}
