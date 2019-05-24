package day02;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
/*
  변수 num의 값에따라  양수 음수  0을 출력하는  코드를 완성하세요.
   힌트: 삼항연산자.
*/
	int num = -90;
	System.out.println("양수 음수  0 판별후 출력");
	System.out.printf("%d => ",num );
//	System.out.println((num > 0 ? "양수" : (num<0 ? "음수" : "0")));
	System.out.println(num > 0 ? "양수" : (num == 0 ? "0" : "음수"));
		
	/*
        다음은 대문자를 소문자로 변경하는 코드입니다.
        변수 ch에 저장된 문자가 대문자 인 경우에만 
	소문자로 변경하는 코드를 완성 합니다.
  	*/
	
	char ch = 'P';
	//char lowerCase = ch >= 'a' && ch <= 'z' ? ch:(char)(ch+32); //문제생길수있음,TEST중요
	char lowerCase = (ch >= 'A' && ch <= 'Z') ? (char)(ch+32):ch;

	System.out.print("ch:"+ch);
	System.out.println(" to lowerCase :"+lowerCase);


	/*  년도를 입력받아  윤년(2월을29일로 둔해) 인지 판별하여 출력해  보세요 */

	int year = 2150;
	System.out.printf(year+"==>");
	System.out.println((year  % 400 == 0 || (year % 4 == 0 && year % 100 != 0))?"윤년":"평년");
	
//	Scanner a = new Scanner(System.in);
//	int year = a.nextInt();
//	System.out.println(year%4==0 ? (year%100 ==0 ? (year%400==0? "윤년":"평년") : "윤년")  :"평년"); 
	//가독성떨어짐...중첩삼항연산자

	}
}          