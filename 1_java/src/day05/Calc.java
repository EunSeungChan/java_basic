package day05;

public class Calc { 
	//member variable자체가없음->  , util,share 공유의개념이 강한것들 Static사용
	//new를 안쓰는거 : heaf로 안올라감 
	//  + - * /
	
	//int - 정수
	
//	public int add(int a, int b){
//		 return a + b;	
//	}
//	public int substract(int a, int b){
//		 return a - b;	
//	}
//	public int multiply(int a, int b){
//		 return a * b;	
//	}
//	public int divide(int a, int b){
//		 return a / b;	
//	}
	
//	static : import하고 _하면 자동으로 뜸,new 안해도
//  static으로 가기위한조건 : heap영역이 아니다보니까 this.(heap영역에서 사용)를사용못함 
//	int a, int b; ->에러남
//	public static int add(){ 
//	 return a + b;	}
	
	
	public static double add(double a, double b){ 
		 return a + b;	
	} //->에러(중복) 구분자규칙
	public static int add(int a, int b){ 
		 return a + b;	
	}
	
	//가변인자 :int의배열처리 int a, int b,int c -> int ...a
	public static int add(int ... a){ 
		int sum = 0;
//새로운 for
		for(int data:a) {
			sum += data;
		}
//전통적인 for
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
		 return sum;	
	}
	
	public static int substract(int a, int b){
		 return a - b;	
	}
	public static int multiply(int a, int b){
		 return a * b;	
	}
	public static int divide(int a, int b){
		 return a / b;	
	}
	
	

}
