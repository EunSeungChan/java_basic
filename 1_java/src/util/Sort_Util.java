package util;

public class Sort_Util {

	public static int[] sort(int[] n) { //sort매개변수
		
		int[] a = n.clone(); //원본유지,복사 . n만쓰면 유지X
		
		// sort 정렬알고리즘
		//원본유지
		for(int i = 0 ; i < a.length-1 ; i++) {
			int min = i;
			for(int j = i+1 ; j < a.length ; j++) {
				
				if(a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		return a;
		
	}//구현부
}
