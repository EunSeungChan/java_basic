package day09.exception;

public class Test03 {
	public static void main(String[] args)  { 
										//throws InterruptedException
		System.out.println("start");

		for(int i =0; i<10 ;i++) {
			System.out.println("-------------------------");
			
			try {
				Thread.sleep(1000); //Thread.sleep
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("end");

		
	}

}
