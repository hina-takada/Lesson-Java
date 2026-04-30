package jp.co.aforce.sample.abstInter;
//第12章：抽象ｸﾗｽ(Animalに使用)
//インタフェース(AnimalInterに使用)
//extends Animal
public class Dog implements AnimalInter{
	@Override
	public void makeSound() {
		System.out.println("わんわん");
	}
	
	//
	public class Cat extends Animal {
		@Override
		public void makeSound() {
			System.out.println("ニャーニャー");
		}
		
	}


	
}
