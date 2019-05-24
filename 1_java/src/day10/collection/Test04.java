package day10.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		/*
		//HashSet - 중복제거 
		Set<String> set = new HashSet<String>();
		set.add("hello1");
		set.add("hello3");
		set.add("hello9");
		set.add("hello2");
		set.add("hello2");
		System.out.println(set);
		*/
		
		// TreeSet - 중복제거, 정렬
		Set<Book> set = new TreeSet<Book>();
		
		set.add(new Book("java", 9000));
		set.add(new Book("SQL", 8000));
		set.add(new Book("DB", 7000));
		set.add(new Book("spring", 6000));
		set.add(new Book("spring", 6000));
		set.add(new Book("SQL", 8000));
		set.add(new Book("SQL", 8000));
		set.add(new Book("SQL", 8000));
		
		System.out.println(set);
		
		//index X -> 새로운for
//		for(Book data:set) {
//			System.out.println(data);
//		}
		
		Iterator<Book> it = set.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			//System.out.println(book);
			if(book.getTitle().equalsIgnoreCase("spring")) {
				it.remove();
			}
		}
		
		System.out.println(set);
		
//		Book b = new Book("java", 9000);
//		Book b2 = new Book("java", 9000);
//		System.out.println(b.equals(b2));
	}

}
