package day06.ex;

//[Prob6 실행결과] 
//=== 책 목록 ===
//Java Program
//JSP Program
//SQL Fundamentals
//JDBC Program
//EJB Program
//=== 책 가격의 총합 ===
//전체 책 가격의 합 : 132000

public class Prob6 {
	public static void main(String[] args) {
		
			BookMgr mgr = new BookMgr();
		
			mgr.addBook(new Book("Java Program",6600));
			mgr.addBook(new Book("JSP Program",5600));
			mgr.addBook(new Book("SQL Fundamentals",7600));
			mgr.addBook(new Book("JDBC Program",8600));
			mgr.addBook(new Book("EJB Program",9600));
			
			mgr.printBookList();
			mgr.printTotalPrice();
	}

}
