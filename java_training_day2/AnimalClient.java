package java_training_day2;

public class AnimalClient {

	public static void main(String[] args) {
		IAnimal [] animals = new IAnimal[5];
		
		AnimalBL bl = new AnimalBL();
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		
		animals[2] = new Human();
		animals[3] = new Tiger();

		animals[4] = new Human();
		
		for(IAnimal temp : animals) {
			bl.display(temp);
		}
		
	}

}
