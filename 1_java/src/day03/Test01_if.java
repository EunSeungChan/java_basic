package day03;

import java.util.Scanner;

public class Test01_if {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("성적처리 Application 시작하려면 yes를 입력하세요_");
		
		String msg = input.nextLine(); 
		
		if(!(msg != null && msg.equalsIgnoreCase("yes"))) {
			System.out.println("Application stop");
			
			if(input != null) {
				input.close(); //null이 아닐때만 close사용
				input = null; // 자원반납	
			}
			
			return; //종료
		}
			

		else 
			System.out.println("성적처리 Application start");
			System.out.println("성적을 입력하세요..");
			System.out.println("국어 영어 수학  \n 입력예) 90 90 90 엔터");
		
			int k1 = input.nextInt();
			int k2 = input.nextInt();
			int k3 = input.nextInt();
			input.nextLine(); //지금상태에서는에러X 반복처리하면 에러남
			
			
		
			double m = 0.0;
			System.out.printf("국어: %d ,영어: %d 수학: %d", k1,k2,k3);
			System.out.printf(" \t 평균:%.2f %n", m=(k1+k2+k3)/3.);
			
			//등급처리
			// 90~100 A
			// 80~90 B
			// 70~80 C
			// 60~70 D
			// 0~60 F

			char grade = ' ';
			
			if(m >= 90 && m <= 100) grade = 'A'; //{}블락생략
			else if(m >= 80 && m <= 90) grade = 'B';
			else if(m >= 70 && m <= 80) grade = 'C';
			else if(m >= 60 && m <= 70) grade = 'D';
			else grade = 'F';
			System.out.printf("성적처리결과 [%c] 등급 %n",grade);
			
			
			//Scanner 자원반납 코드를 완성하세요. 코드중복X - 회피해야함 ->
			if(input != null) {
				input.close(); 
				input = null; 
			}
			
			System.out.println("Application stop");
			
	}

}
