package day06;

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
		
		BookMgr bl = new BookMgr();
		
		bl.addBook("Java Program",22000);
		bl.addBook("JSP Program",30000);
		bl.addBook("SQL Fundamentals",30000);
		bl.addBook("JDBC Program",25000);
		bl.addBook("EJB Program",25000);
		
		bl.printBookList();
		bl.printTotalPrice();
		
		 
	}

}
