package day09.exception;

public class Test02 {
	public static void main(String[] args) {

//		try {
//			Exception e = new Exception("고의로 발생시켰음.");
//			throw e;
//		} catch (Exception e) {
//			System.out.println("에러 메시지 : " + e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("프로그램이 정상 종료되었음.");
		System.out.println("start");
	
		try {
			throw new Exception("예외발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	
		System.out.println("end");

	}

}
