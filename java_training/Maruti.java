package java_training;

public class Maruti extends Car {
	boolean isAirBrake;
	
	Maruti(int fuelCapacity , boolean isAirBrake){
		super(fuelCapacity);
		this.isAirBrake = isAirBrake;
		System.out.println("Maruti car is created.....");
	}

	@Override
	public void doors() {
		System.out.println("Maruti has doors 2 + 1 ...");
	}

	public boolean isAirBrake() {
		return isAirBrake;
	}

	public void carWheels() {
		System.out.println("Radial wheels");;
	}
}
