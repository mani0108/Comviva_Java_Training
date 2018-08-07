package java_training;

public class CarClient {
	
	
	public static void doMyJob(Car c) {
		System.out.println("********* Car details go here ********");
		c.doors();
		
		System.out.println("Fuel Capacity" + c.getfuelCapacity());
		
		
		if(c instanceof Ford) {
			((Ford)c).musicPlayer();
		}
		
		else if(c instanceof Maruti) {
			((Maruti)c).carWheels();
		}
		
	}
	
	public static void main(String[] args) {
//		Car c = new Ford(50);
//		doMyJob(c);
//		
////		c.doors();
////		//c.musicPlayer();
////		
////		((Ford)c).musicPlayer();
////		
//		c = new Maruti(45, true);
////		c.doors();
////		System.out.println("Baleno Fuel Capacity " + c.getfuelCapacity() );
////		((Maruti)c).carWheels();
//		doMyJob(c);
		
		
		
		
		
		Car [] car = new Car[5];
		
		car[0] = new Ford(40);
		car[1] = new Maruti(45, false);
		
		car[2] = new Ford(45);
		car[3] = new Maruti(55, true);
		
		car[4] = new Ford(56);
		
		for (Car temp : car) {
			doMyJob(temp);
		}
		
	}

}
