package day06;

import java.util.Arrays;

import util.Sort_Util;

public class Test01 {
	public static void main(String[] args) {

		int[] num1 = {99,44,77,68,80};
		//코드중복회피 -> , method class에 만들어서 reuse
		int[] result1 = util.Sort_Util.sort(num1); //call by reference , 호출한데이터여기있음
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(result1));//result1 = 원본데이터
		
		
		
		int[] num2 = {2,3,9,1,7}; //원본
		int[] result2 = Sort_Util.sort(num2); //복사본(clone)return a
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(result2));
		
	}

}
