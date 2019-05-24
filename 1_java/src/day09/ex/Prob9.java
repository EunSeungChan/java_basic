package day09.ex;

import java.io.File;
import java.util.Scanner;

//Book.class - toString(),equals(~)오버라이딩
//BookMgr.class - Scanner 를 이용 "c://lib/bookdata.txt" 이 파일의 내용을 읽어들여 
//bookList에 등록(중복체크)

//가격타이틀 다찍히게 핸들링

public class Prob9 {
	public static void main(String[] args) {
		
			BookMgr mgr = new BookMgr(); //중복체크
		
//			mgr.addBook(new Book("Java Program",6600));
//			mgr.addBook(new Book("JSP Program",5600));
//			mgr.addBook(new Book("SQL Fundamentals",7600));
//			mgr.addBook(new Book("JDBC Program",8600));
//			mgr.addBook(new Book("EJB Program",9600));
			
			mgr.printBookList();
			mgr.printTotalPrice();
		
	
	
	
	}

}
