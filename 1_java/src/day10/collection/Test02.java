package day10.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//★API분석(https://docs.oracle.com/javase/8/docs/api/)★ 
public class Test02 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("hello");
		list.add("java");
		list.add("sql");
		list.add("hello");
		
		// 배열 뽑아내는 작업
		Object[] o = new Object[list.size()];
		o = list.toArray();
		
		String[] s = new String[list.size()];
		s = list.toArray(s);
		 				
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		System.out.println("배열");
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
	
	}

}
