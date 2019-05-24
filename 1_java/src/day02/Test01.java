package day02;

import java.util.Date;

public class Test01 {

	public static void main(String[] args) {

		char i = 'A'; //local variable : 명시적으로 초기화직업을 해주어야함,선언과 동시에초기화 가능
					//A 아스키코드 =65 , A -> a
		i = 'a';
		System.out.println(i);
		
		Date d = new Date(); //자바생성객체에는 new를써야함
		//에러나는 이유 데이터를 찾지 못해서 -> import 값을쓰면 오류없어짐
		System.out.println(d.toLocaleString());
		Date d2 = d; // d에서도 엑세스할수있고 d2에도 엑세스할수 있음 
		//d=null이지만d2는 정보를 가지고 있름 ,=을 기준으로 데이터타입일치하는지확인!!
		d = null; //어떤정보가들어올지모름, 다른 정보가 들어올수 있음 garbage의명시적인 역할
		
		String ss = new Date().toString(); //데이터 객체, String ss->주소 
		//new Date()잠깐쓰고 버릴것 .에서엑세스하러들어갔더니 ~쓸거알려줌(API기능있음,함수호출가능)
		//toString()문자열떨궈짐, 변수기억공간에담아야함, toString()을toLocaleString()로바꾸면 문자열바뀜
		System.out.println(ss); //파싱가능
		
		double pi = Math.PI; //데이터타입 double형 PI는 바뀔수없기때문에상수화처리 되어있음 
		//변수앞에 final이 붙으면 한번만 변경가능 ,ctrl 누르고 Math클릭 ,(static) class variable
		//random메소드 : math안에는 랜덤메소드가있는데 난수(데이터타입:더블형, 0<=r<1 : 0......)를 돌려주는거
		double r = Math.random(); //자동으로 형변환
		int r1 = (int)(Math.random()*45+1); //!!!자바는 앞에데이터타입이꼭와야함,데이터 일치!!! 프로모션 자동으로 형변환
		System.out.println(pi+","+r+","+r1); //산술연산되서 나옴,(pi+","+r+","+r1)잘안쓰이는방법(성능저하!!!!)
		
		System.out.printf("pi=%f r=%f r1=%d %n",pi,r,r1); // 책36p, 데이터타입:더블 %f실수 %d정수
		System.out.printf("pi=%.4f r=%.2f r1=%d %n",pi,r,r1); //%n줄바꿈
		
		String s1 =  new String("hello");//세미타입,기본형처럼사용 heap로 올라감
		String s11 =  new String("hello"); //문자열이 같으면 하나의 결과값만나옴
		
		String s2 = "hello";//사용방법은 같은데 올라가는 메모리영역이틀림 코드표영역으로올라감..?
		String s22 = "hello"; //동작하는거는같은데 이방법많이사용! 주소모르면 handling 안됨
	}

}
