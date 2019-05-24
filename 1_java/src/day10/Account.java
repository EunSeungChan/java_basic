package day10;

import java.io.Serializable;

/**
 *
 * @author student 
 * @since : 2019.05.08
 * @version 1.0
 * 
 */

// 계좌번호,잔고,입금,출금,계좌이체,통장정보출력 ,동사-기능 명사-

public class Account extends Object implements Serializable {

	private String number; //=null -> 명시적초기화
	private int money;		//=0
	
	public Account() { 
//		this("000",0); 
		
	}
	
	//throws MoneyException -> AccountTest에서 try-catch 필요
	public Account(String number, int money) throws MoneyException{ 
		this.setNumber(number);
//		try {
			this.setMoney(money);
//		}catch (MoneyException e) {
//			System.out.println(e.getMessage());
//		}	
	}
	
	//캡슐화(source-setter/getter)
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	
	//예외처리(Exception) - 이름(길게표현)으로 함수,생성자에서 발생하는 문제점 알려준
	//MoneyException - checked Exception -> setMoney로가서 try-catch사용
	public void setMoney(int money) throws MoneyException {
		//money가 음수일때
		if(money < 0) throw new MoneyException();
		
		//음수가 아닌 수가 들어올때
		this.money = money;
//		return;
	}
	
	//입금
	public void input(int money) {
		if(money>0) {
			this.money += money; // this꼭 있어야함 
		}
		//return; //void일경우 생략(retrun 뒤에 값이X) 
	}
	
	//출금
	public int output(int money) {
		if(this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족!!!");
		return 0;
		//return; 오류남 int랑 타입일치X
//		else {
//			return 0;
//		} //else구문 없을때 : 반드시정수값을 가져가야함
	}
	
	//계좌이체 transfer O -> O ,계좌2개필요
	
	
	public static void transfer(Account from,Account to,int money) { 
		to.input(from.output(money)); 
	}
	
	//통장정보출력
	public void print() {
		System.out.printf("Account[통장번호 : %20s , 잔고 : %d 원 ]%n",number,money);
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	
	
}
