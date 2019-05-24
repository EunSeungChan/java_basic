package day07;

public class Test_Car {
	public static void main(String[] args) {

		Car c1 = new Car();
		Car c2 = new Car("아반떼","black");
		Car c3 = new Car(c2);

		c1.print();
		c2.print();
		c3.print();
		
		c1=null;
		c2=null;
		c3=null;

		Car c4 =  new Car(c3); // null넣어도 동작함
		c4.print(); // NullPointerException발생
		
	}

}

class Car{
	
	String kind;
	String color;
	
	//기본생성자
	public Car() { 
//		super(); //부모의 생성자를 호출
	}

	
	//파라미터 2개생성자
	public Car(String kind, String color) { 
//		super();
		this.kind = kind; // 밑에꺼랑 중복
		this.color = color;
	}
	 
	//파라미터 1개생성자
	public Car(Car c) { 
		if(c != null) {
		this.kind = c.kind;
		this.color = c.color;
		}
	}
	
	
	public void print() {
		System.out.printf("Car[%s : %s]%n",kind,color);
	}
	
}
