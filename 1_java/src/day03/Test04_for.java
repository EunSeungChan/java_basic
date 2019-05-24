package day03;

public class Test04_for {
	public static void main(String[] args) {
		
		for(int i=0; i<5 ; i++ ) {
			System.out.println(i+" Hello"); //블락내부의 변수는 내부에서만 사용가능
		
		} //파괴
		
		
		int i = 10; //다시사용가능 
		while(i>5) {
			System.out.println(" while Hello"); 
			i--;
		}
		
		 do {
			System.out.println("do while"); 
		}while(i > 5);
		
		 boolean flag = false;
		 while(!flag) {
			 i--;
			 System.out.println("loop~~");
			 if(i == 0) flag = !flag;
			 
		 }
	}

}