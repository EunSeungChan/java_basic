package day04;

import java.util.Arrays;

public class Prob4 {

	public static void main(String[] args) {
		
		//문제... ->1-45  6개 난수
		int[] num = new int[6];
		//boolean[] exst = new boolean[45]; 
		
		//중복처리데이터 초기화
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = (int) (Math.random()*45)+1;
				for(int j = 0 ; i>j ; j++ ) {
					if(num[j] == num[i]) {
						i--; //중복된거다시하기위해,재발행 다시난수발생시키기위해
						break; //안쓰면계속비교함
						//toggle breakpoint :디버깅하기적절한곳분석 , debug실행하면 switch
					}
				}
				System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));

		//sort
		int count = 0;	
		for(int i = 0 ; i < num.length-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < num.length ; j++) {
				
				if(num[min] > num[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = num[i];
				num[i] = num[min];
				num[min] = temp;
				count++;
			}
		}

		System.out.println("swap 횟수 : "+count);
		System.out.println(Arrays.toString(num));

	}
		
		
}



