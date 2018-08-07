package java_training_day2;

public class Human extends Appearance implements IAnimal {

	@Override
	public void talk() {
		System.out.println("Human talks with some accent");
		
	}

	@Override
	public void walk() {
		System.out.println("Human walks with 2 legs");
		
	}

	@Override
	public void shout() {
		System.out.println("Human shouts");
		
	}

}
