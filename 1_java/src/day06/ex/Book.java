package day06.ex;

//Book 클래스의 제약조건
//1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
//2. 멤버변수는 모두 private 접근제한자를 가져야 한다. 
//3. 멤버변수를 모두 초기화하는 생성자 메서드가 있어야 한다. 
//기본 생성자 메서드가 있어야 한다. 
//4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
//setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
//String getTitle() : 멤버변수 title 값을 반환하는 메소드
//    void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
//int getPrice() : 멤버변수 price 값을 반환하는 메소드 
//5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다. 


//Book - data type강함

public class Book { 
	
	//1.2
	private String title;
	private int price;
	
	//초기화
	public Book() {
		this("",0);
	}
	////source - using fields
	
//	public Book(String title, int price) {
//		this.title = title;
//		this.price = price;
//	}
	
	public Book(String title, int price) {
		this.setTitle(title);
		this.setPrice(price);
	}
	
	//encapsulaton캡슐화 - set/get method 반드시 있어야함
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title !=null && title.length()>0)
			this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price>0)	
			this.price = price; //member variable접근
	}
	
	public void print() {
		System.out.printf("Book[제목:  %s , 가격:  %d]%n",title,price);
	}
	

}
