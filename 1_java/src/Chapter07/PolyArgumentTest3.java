package Chapter07;

import java.util.*;;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		
		Buyer2 b2 = new Buyer2();
		
		Tv2 tv = new Tv2();
		Computer2 com = new Computer2();
		Audio1 audio = new Audio1();
		
		b2.buy(tv);
		b2.buy(com);
		b2.buy(audio);
		b2.summary();
		System.out.println();
		b2.refund(com);
		b2.summary();
		
		
	}

}

class Product2{
	int price;
	int bonusPoint;
	
	public Product2(int price) {
		super();
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	//기본생성자
	public Product2() {	
		price = 0;
		bonusPoint = 0;
	}
}

class Tv2 extends Product2{

	Tv2(){
		super(100);
	}
	
	public String toString(){
		return "Tv";
	}
}

class Computer2 extends Product2{

	public Computer2() {
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio1 extends Product2{
	public Audio1() {
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector item =  new Vector();
	
	void buy(Product2 p2) {
		if(money < p2.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p2.price;
		bonusPoint +=p2.bonusPoint;
		item.add(p2) ;
		System.out.println(p2 + "을/를 구입하셨습니다");	
	}
	
	void refund(Product2 p2) {
		if(item.remove(p2)) {
			money += p2.price;
			bonusPoint -= p2.bonusPoint;
			System.out.println(p2 + "을/를 반품하셨습니다.");
		}
		else
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");

	}
	
	
	void summary() {
		int sum = 0;
		String itemList ="";
		
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없습니다.");
			return;
		}
		
		for(int i=0;i<item.size();i++) {
			Product2 p2 = (Product2) item.get(i);
			sum += p2.price;
			itemList += (i==0)? "" + p2 : ", " + p2;
			}
		System.out.println("구입하신 물품의 총 금액은" + sum + "만원입니다.");
		System.out.println("구입하신 제품은" + itemList + "입니다.");

	}
}
