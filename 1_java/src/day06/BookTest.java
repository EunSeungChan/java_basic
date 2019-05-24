package day06;

public class BookTest {
	public static void main(String[] args) {

		Book b1 =new Book();
		b1.setTitle("java");
		b1.setPrice(9000); //set property
		
		System.out.println(b1); //주소찍음
		b1.print(); //retrun type = void
		
	}

}


//class Book { //data type강함
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
