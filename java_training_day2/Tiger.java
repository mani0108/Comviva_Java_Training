package java_training_day2;

public class Tiger implements IAnimal {

	@Override
	public void talk() {
		System.out.println("grrr.....grrr.....grrr");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger walks with 4 legs");
	}

	@Override
	public void shout() {
		System.out.println("GRR....GRR....GRR");
	}
	
	public void survive() {
		System.out.println("Tiger hunts for survival");
	}

}
