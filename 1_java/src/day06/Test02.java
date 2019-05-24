package day06;

public class Test02 {
	public static void main(String[] args) {

		Account a1 = new Account();// 기본생성자 자동호출 ,기본생성자 default
		a1.setNumber("002");
		a1.setMoney(900);
		a1.print();
		
		//생성자 매소드
		Account a2 = new Account("001",-100);
		a2.print();

		Account a3 = new Account();
		a3.print();
	
		
		
		
	}

}
