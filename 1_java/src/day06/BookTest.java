package day06;

public class BookTest {
	public static void main(String[] args) {

		Book bk =new Book();
		bk.setTitle("java");
		bk.setPrice(9000); //set property
		
		System.out.println(bk); //주소찍음
		bk.print(); //retrun type = void
		
	}

}


//class Book { 
//	
//	private String title;
//	private int price;
//	
//	//encapsulaton캡슐화
//	
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		if(title !=null && title.length()>0)
//		this.title = title;
//	}
//	public int getPrice() {
//		return price;
//	}
//	public void setPrice(int price) {
//		if(price>0)	this.price = price; //member variable접근
//	}
//	
//	
//	public void print() {
//		System.out.printf("Book[제목:  %s , 가격:  %d]%n",title,price);
//	}
//	
//
//}
