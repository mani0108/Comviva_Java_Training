package java_training;

public class Car {
	private int fuelCapacity;
	
	Car(int fuelCapacity){
		this.fuelCapacity = fuelCapacity;
	}
	
	public int getfuelCapacity() {
		return fuelCapacity;
	}
	
	public void doors() {
		System.out.println("All cars come with 4 + 1 doors");
	}
}
