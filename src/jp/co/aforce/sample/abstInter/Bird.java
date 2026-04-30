package jp.co.aforce.sample.abstInter;

public class Bird implements Flyable , AnimalInter{
	@Override
	public void fly() {
		System.out.println("飛んだ");
	}

	@Override
	public void makeSound() {
		System.out.println("ピーピー");
	}
	
}
