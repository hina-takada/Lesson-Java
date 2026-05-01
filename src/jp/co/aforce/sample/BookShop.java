package jp.co.aforce.sample;

public class BookShop {
	private String title;
	private String name;
	private int num;
	private int price;
	
	public BookShop(String title,String name,int num,int price) {
		this.title = title;
		this.name = name;
		this.num = num;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public int getPrice() {
		return price;
	}
	
	/*
	 * totalPriceメソッド
	 * 
	 */
	
	void totalPrice() {
		int total =+ price;
	}
	
	/*
	 * tyusituメソッド
	 * 
	 */
	
	void tyusitu() {
		if(num > 1000) {
			System.out.println(name);
		}
	}
	
	/*
	 * kourituメソッド
	 * 販売効率
	 * bookより大きい値をmaxBookに代入する
	 * 
	 */
	
	void kouritu() {
		int book = num / price;
		int maxBook = 0;
		if(maxBook < book) {
			maxBook = book;
		}
	}
	
	
	/*public static void main(String[] args) {
		BookShop book1 = new BookShop("「Python入門」", "山田太郎", 1500, 2500);
		BookShop book2 = new BookShop("「データ分析の基礎」", "鈴木花子", 1500, 2500);
		BookShop book3 = new BookShop("「AI技術最前線」", "佐藤一郎", 1500, 2500);
		BookShop book4 = new BookShop("「Webデザイン口座」", "田中美咲", 1500, 2500);
		BookShop book5 = new BookShop("「はじめての機械学習」", "中村健一", 1500, 2500);
		
		
	}*/
	
	
}
