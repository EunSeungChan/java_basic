package Chapter07;

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		
		System.out.println("현재 남은 돈은" + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는" + b.bonusPoint + "점입니다.");		

	}

}

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{

	Tv(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer extends Product{

	public Computer() {
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price;
		bonusPoint +=p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다");	
	}

}
