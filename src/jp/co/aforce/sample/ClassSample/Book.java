package jp.co.aforce.sample.ClassSample;

public class Book {
	private String title;
	private String author;
	private int price;
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println(String.format("タイトル:%s 著者:%s 価格:%d円", title,author,price));
	}
	
	
}
