package day05;

//문제2. Account 클래스를 구현하시오.
//    계좌번호(number)  , 잔고(money)  , 입금(input) , 출금(output), 계좌이체(account), 통장정보출력(bankbook)


public class AccountTest{
	public static void main(String[] args) {
		
		Account acount = new Account();
		acount.number("");
		acount.money();
		
		acount.print();
	}
}


class Account {
	
	String number; //계좌
	int money; //잔고
	int input;
	int output;
	int account;
	long bankbook;
	
	//계좌번호
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	//잔고
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money >= 0)
		this.money = money;
	}
	//입금
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	//출금
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
	//계좌이체
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	//통장정보출력
	public long getBankbook() {
		return bankbook;
	}
	public void setBankbook(long bankbook) {
		this.bankbook = bankbook;
	}
	
	public void print() {
		System.out.printf("",);
		
	}
			
}

//public void number(String string) {
//	System.out.println("계좌번호 : " + number);
//}
//
////입금
//public void input(int money) {
//	for(;;) {
//		
//	}
//	
//}
//public void input (int money) {
//	this.money = this.money + money;
//		
//	
//	System.out.println(number + " <=입금 "+money);
//	
//	return;
//}
//
//
//
////출금
//public int output (int money) {
//	if(money > this.money){
//	 	System.out.println("잔고")
//		return 0;
//	}
//}
//
////계좌이체
//public void print() {
//	System.out.printf("계좌번호 :   잔고 :  통장정보출력 : ",number,money,bankbook);
//
//}

