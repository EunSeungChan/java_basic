package day04;

import java.util.Arrays;

public class Test06 {
	public static void main(String[] args) {
		
		//local variable
		int[][] t =  {{5,4,3},{1,2,3,4,5},{9,4}}; //1차원배열을 모은 2차원배열 t[0],t[1],t[2]
		t[1][2] = 99;
		
		//for
		for(int i = 0 ; i<t.length ; i++) {
			for(int j = 0 ; j<t[i].length ; j++) {
			
				System.out.print(t[i][j]+",");
				
			}
				System.out.println();
		}
		System.out.println(Arrays.toString(t));
		
//		System.out.print(t[0][0]);
//		System.out.print(t[0][1]);
//		System.out.print(t[0][2]);
//		System.out.print(t[1][0]);
		
	}

}
