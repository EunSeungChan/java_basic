package day04;

public class Test01_array {
	public static void main(String[] args) {
		
//		int jumsu1;
//		int jumsu2;
//		int jumsu3;
//		int jumsu4;
//		int jumsu5;

		int count=0; 				//기본형,4byte ->명시적초기화필요int count=0
//		System.out.println(count);
		
		int[] jumsu; 			//참조형(주소),배열선언
		jumsu = new int[5]; 	
		//배열생성, new(heaf영역에 int타입(4byte)으로) : int타입으로 5개의 방만듬, 모든방에 0으로 defalt
		//위치값 0-4
		
		jumsu[0] = 90;
		jumsu[1] = 80;
		jumsu[2] = 77;
		jumsu[3] = 70;
		jumsu[4] = 50;
		
		for(int i = 0 ; i<jumsu.length ; i++ ) {
			System.out.print(jumsu[i]+" ,"); 
			
		}
//		System.out.println(jumsu[0]);
//		System.out.println(jumsu[1]);
//		System.out.println(jumsu[2]);
//		System.out.println(jumsu[3]);
//		System.out.println(jumsu[4]);
//		System.out.println(jumsu[5]);
		
	}

}

//배열:같은타입의 여러개의 데이터를 묶은거,이름은하나인데 위치index 사용 = 조건:동일한데이터타입