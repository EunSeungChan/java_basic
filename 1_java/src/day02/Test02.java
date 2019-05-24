package day02;

public class Test02 {

	public static void main(String[] args) {
		double j = Integer.parseInt("90"); 
		// "90"문자열 90 -> 산술연산안됨(Integer.parseInt사용) int타입은 double형으로 변경가능
		double y = Double.parseDouble("89.9"); 
		//89.9는 int타입 아님 소수점은 double형 -> Double.parseDouble 사용
		System.out.printf("j=%5.2f , y=%5.2f %n", j,y);
		double temp; //스와핑할때는임시기억공간이필요함
		temp = j;
		j=y;
		y=temp;
		System.out.printf("j=%5.2f , y=%5.2f %n", j,y); 
		
	}

}
