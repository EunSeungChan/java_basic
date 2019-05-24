package day11.ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//BookMgr.class - Scanner 를 이용 "c://lib/bookdata.txt" 이 파일의 내용을 읽어들여 
//I/O사용해서 구현해보기
public class BookMgr {
	private Book[] booklist;
	int count = 0; //count

	//source - using fields
	public BookMgr(Book[] booklist) {
			this.booklist = booklist;
	}
	
	//기본생성자
	public BookMgr() {
		booklist =  new Book[10];	
		
		Scanner sc = null;
		try{ 
			//Scanner - 파일 읽어들이기
			sc = new Scanner(new File("C:\\eclipse-workspace\\Sample_01")); 
										// throws FileNotFoundException
				while(sc.hasNextLine()) {
					 String data = sc.nextLine();
					 String[] bookdata = data.split("/");
//					 String title = bookdata[0];
					 addBook(new Book(bookdata[0], Integer.parseInt(bookdata[1])));
//					 int price = Integer.parseInt(bookdata[1]);
//					 System.out.println(data);
				 };
				 
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다.");
			e.printStackTrace();
		} catch (Exception e) {
			
		}finally {
			//자원반납
			if(sc != null) sc.close();
			
		}
			
	}
		
	//초기화 bookdata파일 읽어오게
		
	public void addBook(Book book) {
		if(count == booklist.length) {
			Book[] temp = new Book[booklist.length *2]; //공간늘린 새로운 Book[] temp생성 
			System.arraycopy(booklist, 0, temp, 0, booklist.length); //arraycopy
			booklist = temp;
		}
		
		//비교구문 중복체크
		for(int i=0;i<count;i++) {
			if(booklist[i].equals(book)) {
				return;
			}
		}
		
		booklist[count] = book;
		count++;
	}
	public void addbook() {
		
	}
	
	public void updatebook() {
		
	}
	
	public void deletebook() {
		
	}
	
	public void searchbook() {
		
	}
	
	public void lookBookList() {
		System.out.println("=== 책 목록 =====");
		for(int i=0;i<count;i++) {
			System.out.println(booklist[i]);
		}
	}

}
	
	
	
	

