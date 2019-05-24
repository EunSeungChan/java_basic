package day06;

public class Test03 {
	public static void main(String[] args) { //static method
			
	int a = 100; 
	int b = 10;
	
	day06.Test03.max(a,b);
	max(a,b); //매소드앞에 주소.가 있어야함 , static 쓰면 class이름생략
	new Test03().min(a, b);
	
	}
	
	public static int max(int a, int b) {
		a=1;
		return a>b ? a:b ; //instance method = new 안쓰면 못씀
	}
	public int min(int a, int b) {
		return a<b ? a:b ; //instance method = new 안쓰면 못씀
	}
}
