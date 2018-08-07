package java_training;

public class Ford extends Car {

	public Ford(int fuelCapacity) {
		super(fuelCapacity);
		System.out.println("Ford car is created......");
	}
	
	
	@Override
	public void doors() {
		System.out.println("Ford has 2 + 2 doors....");
	}


	public void musicPlayer() {
		System.out.println("Ford car comes with music player");
	}
}
