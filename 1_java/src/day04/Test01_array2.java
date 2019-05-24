package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01_array2 {
	public static void main(String[] args) {
		
		int count=0; 				//기본형,4byte ->명시적초기화필요int count=0
//		System.out.println(count);
		
		double m = 0.0;	//평균구하는거
		
		int[] jumsu; 			//참조형(주소),배열선언
		jumsu = new int[5]; 	
		//배열생성, new(heaf영역에 int타입(4byte)으로) : int타입으로 5개의 방만듬, 모든방에 0으로 default
		//위치값 0-4
		
	
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 77;
		jumsu[3] = 70;
		jumsu[4] = 50;
		
		for(int i = 0 ; i<jumsu.length ; i++ ) {
			System.out.print(jumsu[i]+" ,"); 
		}
		
		System.out.println();
		System.out.println(jumsu);
		System.out.println(Arrays.toString(jumsu)); //배열 출력, 배열내용확인API

		int[] num= {88,55,77,99,77,33}; //배열선언,생성,초기화 한번에 ,int num; 일반변수
		System.out.println(Arrays.toString(num));
		
		String[] names;  
		names = new String[5];	//null로 default초기화
		names[0] = "홍길동";
		names[1] = "김길동";
		names[2] = "최길동";
		
		System.out.println(Arrays.toString(names));
		System.out.println("====================================");
		
		int sum = 0; 
		for(int i =0 ; i<jumsu.length ;i++){
			sum += jumsu[i];
			
		}		
		m = sum/jumsu.length;
		
		for(int i =0 ; i<jumsu.length ;i++) {
			
			if(names[i] != null && names[i].length()>0) //names[i].length()>0 or !=0
				System.out.printf("%s ** : %3d %n", names[i].charAt(0), jumsu[i]); 
			else
				System.out.printf("이름없음 : %3d %n",jumsu[i]);
		}
		
		System.out.printf("학생평균 %.2f  %n", m);
		

	}

}

//배열:같은타입의 여러개의 데이터를 묶은거,이름은하나인데 위치index 사용 = 조건:동일한데이터타입