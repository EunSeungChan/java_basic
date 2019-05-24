package Chapter07;

public class FnalCardTest {
	public static void main(String[] args) {

		Card c = new Card("HEART",10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c.toString()); // = System.out.println(c);
	}

}

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	public Card(String kind, int num) {
		super();
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART",1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
		
	}
	
}