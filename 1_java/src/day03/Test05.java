package day03;

public class Test05 {
	public static void main(String[] args) {
		
		int sum = 0; //초기화
		for(int i = 1; i<=100 ;i++) {
			if(i % 2 == 0) { //0:짝수 1:홀수
			sum = sum + i; //1-100까지의 합
			System.out.print(i+"+");
			}
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("=====================");
		
		for(int i = 0; i<5 ; i++) {
			for(int j = 11 ; j<13 ; j++) {
		
			System.out.printf("i=%2d , j=%2d %n",i,j);
			}
		}
	}

}
