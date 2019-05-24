package day06;

//BookMgr 클래스의 제약조건 
//1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
//2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
//4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
//5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
//6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

//전체가격의 합 : sum


public class BookMgr {
 
	private Book[] booklist;
	
	//초기화
	public BookMgr(){

		booklist = new Book[5];
		
	}
	
	public Book[] getBooklist() {
		return booklist;
	}

	public void setBooklist(Book[] booklist) {
		this.booklist = booklist;
	}


	public void addBook(Book book) {
//		for() {		}
	}
		
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for() {
			if(!= null)
				System.out.printf("%s %n");
		}
	}
	

	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum = 0;
			for() {
				if()
					sum += 
			}
		System.out.printf("전체 책 가격의 합 : %d ",sum); //sum
	}
	
}
