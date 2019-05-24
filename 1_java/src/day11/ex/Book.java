package day11.ex;

import java.io.Serializable;

//Book.class - toString(),equals(~)오버라이딩

public class Book extends Object implements Serializable{ 
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
//		this.setTitle(title);
//		this.setPrice(price);
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

	//equals(~),hashCode() 중복체크 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	
	

}
