package jp.co.aforce.sample.ApplicationClass;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title,String author) {
		this(title, author, 850);
	}

	@Override
	public String toString() {
		return String.format("タイトル:%s 著者:%s 価格:%d円", title,author,price);
	}
	
	
}
