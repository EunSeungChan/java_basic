package day10;

//사용자 정의 예외
public class MoneyException extends Exception{

	public MoneyException() {
		super("MoneyException : 금액 확인 필요");
	}

	//method overloading
	public MoneyException(String msg) {
		super(msg);
		
	}

}
