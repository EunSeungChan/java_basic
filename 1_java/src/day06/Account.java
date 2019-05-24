package day06;

/**
 *
 * @author student 
 * @since : 2019.04.30
 * @version 1.0
 * 
 */


// 계좌번호,잔고,입금,출금,계좌이체,통장정보출력 ,동사-기능 명사-
public class Account {

	private String number; //=null -> 명시적초기화
	private int money;		//=0
	
	public Account() { //생성자 : 초기화작업을 수행해주는 class
		this("000",0); 
		//나와 또다른생성자함수 부르는 this / 주의사항 :첫번째라인에만허용
		
		//	System.out.println("Account() 생성자 수행");
		//this.setNumber("000"); //초기화작업 
		//this.setMoney(0);
		//중복발생
	}
	
	public Account(String number, int money) { 
		this.setNumber(number);
		this.setMoney(money);
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
	public void setMoney(int money) {
		if(money > 0)
		this.money = money;
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
	/**
	 * 
	 * @param from ~~~~~~ 출금
	 * @param to ~~~~ 입금
	 * @param money 이체금액
	 */
	
	public static void transfer(Account from,Account to,int money) { //매개변수 , System.arraycopy
//static사용가능 -  heap영역,this안썼기 때문
//		int t = from.output(money); //return 타입 int
//		to.input(t);
		
		to.input(from.output(money)); 
	}
	
	//통장정보출력
	public void print() {
		System.out.printf("Account[통장번호 : %20s , 잔고 : %d 원 ]%n",number,money);
	}
}
