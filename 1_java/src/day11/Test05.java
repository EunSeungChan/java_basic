package day11;

import java.util.ArrayList;
import java.util.List;

import day09.ex.Book;

public class Test05 {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();
		books.add(new Book("java",500));
		books.add(new Book("sql",5200));
		books.add(new Book("servlet&jsp",2500));
		books.add(new Book("html5",1500));
		books.add(new Book("java",500));
		books.add(new Book("java",500));

		//i->book타입
		books.forEach(i->System.out.println(i.getTitle().charAt(0)+"**"));
		//stream :소모성자원 필요할때마다불러서 써야함
		System.out.println("-----------------------------");
		books.stream().forEach(i->System.out.println(i));
		System.out.println("-----------------------------");
		//distinct() : 중복제거 ->equals,hashCode
		books.stream().distinct().forEach(i->System.out.println(i));

		long count = books.stream().filter(i->i.getPrice()>1500).count();
		System.out.println(count);
		
		long sum = books.stream().mapToInt(i->i.getPrice()).sum();		
		System.out.println(sum);
	}
}

