package day05;

public class Test03_time {
	public static void main(String[] args) {

//		int hour;
//		int second; Time class로
		
		Time t1 =  new Time();
		t1.setHour(14);
		t1.setSecond(20); //유효하지않은 값이들어와도 assign -> 유효성체크해야함
		t1.print();
		
		
	}

}


// 묶어서관리하는Time class
class Time{

	private int hour; // private-사용된class영역에서만사용가능 , member variable
	private int second;
	private boolean am;
	
	public boolean isAm() {
		return hour < 12;
	}
	
//	public void setAm(boolean am) {
//		this.am = am;
//	}
	
	public void setHour(int hour) {//유효성검증작업가능 
		if(hour >=0 && hour<=23)
		this.hour = hour; //this생략X
	}
	
	public int getHour(int h) { //void는 return뒤에값이오면안됨 
		return hour; 
	}
	
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}


	public void print() {
		System.out.printf("[%d %2d시 %2d분] %n",am,this.hour, this.second); 
		//적어도 public한,print메소드가 있으면 출력은가능, 
		//void setHour(세팅할값,int h), int getHour()메소드사용
		
	}
	
}