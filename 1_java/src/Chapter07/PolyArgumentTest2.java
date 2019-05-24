package Chapter07;

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		
		Buyer2 b1 = new Buyer2();
		
		b1.buy(new Tv2());
		b1.buy(new Computer2());
		b1.buy(new Audio1());
		b1.summary();
	}

}

class Product1{
	int price;
	int bonusPoint;
	
	public Product1(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	//기본생성자
	public Product1() {	}
}

class Tv1 extends Product2{

	Tv1(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer1 extends Product2{

	public Computer1() {
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio extends Product2{
	public Audio() {
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer1{
	int money = 1000;
	int bonusPoint = 0;
	Product2[] item = new Product2[10];
	int i = 0;
	
	void buy(Product2 p1) {
		if(money < p1.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p1.price;
		bonusPoint +=p1.bonusPoint;
		item[i++] = p1 ;
		System.out.println(p1 + "을/를 구입하셨습니다");	
	}
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		for(i=0;i<item.length;i++) {
			if(item[i]==null) break;
				sum += item[i].price;
				itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은" + itemList + "입니다.");

	}
}
