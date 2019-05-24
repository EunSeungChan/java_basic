package day06.ex;

//BookMgr 클래스의 제약조건 
//1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
//2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
//4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
//5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
//6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 
//★모든 가능성생각해보기 ★배열핸들링★  

//나중에 ArrayList로 

public class BookMgr {
	private Book[] booklist;
	int count = 0; //count
	
	//기본생성자
	public BookMgr() {
		booklist =  new Book[3];		
		
	}
	//source - using fields
	public BookMgr(Book[] booklist) {
			this.booklist = booklist;
	}
	
	public void addBook(Book book) {
		if(count == booklist.length) {
			Book[] temp = new Book[booklist.length *2]; //공간늘린 새로운 Book[] temp생성 
			System.arraycopy(booklist, 0, temp, 0, booklist.length); //arraycopy
			booklist = temp;
		}
		booklist[count] = book;
		count++;
	}
	
	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for(int i=0;i<count;i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		int sum=0;
		for(int i=0;i<count;i++) {
			sum += booklist[i].getPrice();					
			}
			System.out.printf("전체 책 가격의 합 : %d ",sum);
		}
	}
	
	
	
	

