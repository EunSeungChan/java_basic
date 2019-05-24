package day04;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		int[]num = new int[5]; //선언과 생성

		//1-100사이의 난수
		
		for(int i = 0 ; i<num.length ; i++) {
			num[i] = (int) (Math.random()*100); //Math.random : 난수
		}
		System.out.println(Arrays.toString(num));
		int[] num2 = num; //call by reference
		System.out.println(Arrays.toString(num2));

//		num2[0]=77;
//		num[0]=11;
//		System.out.println(Arrays.toString(num2));
	
		//배열원본보존할경우
		int[] num3 = num.clone(); //clone(복제.?) ->새로운값 assign
		System.out.println(Arrays.toString(num3));
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
	
	
	}
	

}
