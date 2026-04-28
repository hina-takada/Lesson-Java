package jp.co.aforce.sample.ApplicationClass;
//10章：オーバーロード
//10章：キャスト(インタフェ　Shape)
public class Rectangle implements Shape {
	private int width;
	private int height;

	public Rectangle(int width ,int height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width) {
		this.width = width;
		this.height = width;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	//キャスト
	@Override
	public void calc() {
		/*int product = height * width;*/
		
	}
	
}
