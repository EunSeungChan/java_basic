package day09.exception;

import javax.swing.JOptionPane;

public class Test01 {
	public static void main(String[] args) {

		System.out.println("start");
		String num = JOptionPane.showInputDialog("숫자를 입력하세요...");
		
		
		//예외발생
		try {
			System.out.println(1);
			System.out.println(4./Integer.parseInt(num));
			System.out.println(2); //결과 안찍힘 4/0에서 예외발생해서 catch블럭으로 넘어감	
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("0으로 나누면안됨 ...");
		}catch (NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("문자는 안되요... 숫자만 입력해주세요");
		}catch (Exception e) {
			e.printStackTrace(); 
		}finally {
			System.out.println(9);			
		}
		
		
		System.out.println("end");

		
		
	}

}
