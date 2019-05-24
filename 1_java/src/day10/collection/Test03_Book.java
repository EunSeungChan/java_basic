package day10.collection;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

//★API분석(https://docs.oracle.com/javase/8/docs/api/)★ 
public class Test03_Book {
	public static void main(String[] args) {
		
		//List<Book> list = new ArrayList<Book>();
		List<Book> list = new Vector<Book>();
								//ArrayList -> Vector 가능 

		list.add(new Book("java", 9000));
		list.add(new Book("SQL", 8000));
		list.add(new Book("DB", 7000));
		list.add(new Book("spring", 6000));
		list.add(new Book("spring", 6000));
		//System.out.println(list);
		
		//list.remove(new Book("SQL", 8000));
		//Collections.sort(list); 
		//Comparable해야만이 sort사용가능 ->Book class에 Comparable추가
		//System.out.println(list);
	
		//for(int i = 0 ; i<list.size() ;i++) {
			//System.out.println(list.get(i).getTitle().charAt(0)+"***");
			//System.out.println(list.get(i));
		//}
		
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			//System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		System.out.println(list);
	}

}


class Book implements Serializable,Comparable<Book>{ 
	//	implements Serializable - interface , 

	private String title;
	private int price;
	
	//초기화
	public Book() {
	
	}
	
	public Book(String title, int price) {
	super();
	this.title = title;
	this.price = price;
	}
	
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
	this.price = price; 
	}
	
	//toString()
	@Override
	public String toString() {
	return "Book [title=" + title + ", price=" + price + "]";
	}
	
	
	//equals(~) 중복체크 
	@Override
	public boolean equals(Object obj) {
	boolean flag = false;
	if(obj != null && obj instanceof Book) {
	//casting
	Book temp = (Book)obj;
	
	//|비교| String세미타입 reference(주소) -> equals, data -> ==
	if(title.equals(temp.title) && price == temp.price){
	flag = true;
	}
	}
	return flag;
	}

	@Override
	public int compareTo(Book o) {
//  	가격 -> 조건
		return price-o.price;
//		책제목순서대로 sort , 오름차순
//		return title.compareTo(o.title);
	}
}
