package java_training_day2;

public class AnimalBL {
	public void display(IAnimal animal) {
		System.out.println("---------------");
		animal.talk();
		animal.walk();
		animal.shout();
		
		if(animal instanceof Human) {
			((Human)animal).eyeColor();
			((Human)animal).specialCharEyes();
			
		}
		
		if(animal instanceof Tiger) {
			((Tiger)animal).survive();
		}

	}
	

}

