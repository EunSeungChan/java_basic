package day04;

import java.util.Arrays;

public class Test07_sort {

	public static void main(String[] args) {
		
		//문제... ->6개 난수
		int[] num = new int[6];
		
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = (int) (Math.random()*45+1);
		}
		
		System.out.println(Arrays.toString(num));
		
		int count = 0;
		for(int i = 0 ; i < num.length-1 ; i++) {
			for(int j = i+1 ; j < num.length ; j++) {
				
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
					count++;
					
			//if(num[i] == num[j]) System.out.println(Arrays.toString()); 	

				}				
//				System.out.print("[%d , ] ",num[i]);
			}
			System.out.println("swap 횟수 : "+ count);		
			System.out.println(Arrays.toString(num));			
//		System.out.println();

		}
		
		
	}
}


