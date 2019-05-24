package day03;

public class Test06_gugudan {

	public static void main(String[] args) {
	
		OUT : for(int i = 1 ; i<9 ; i++) {
			for(int j = 2 ; j<=9 ; j++) { // J : 단
				//if(j==5) break; //break : 빠져나오는거 4단까지만나옴
				//if(j==5) continue; //continue : 재진입 5단빠짐
				if(j==5) break OUT; //5가되는순간 모든루프빠져나감
				
				System.out.printf("%d * %d = %2d|",j,i,i*j); //J가단이니까앞에!
			}
				System.out.println();
		}
	
	}

}
