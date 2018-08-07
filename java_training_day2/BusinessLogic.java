package java_training_day2;

public class BusinessLogic extends Thread {

	
	//you should not call run() directly
	//Doing so will make your application single threaded application
	//rather call start() method from the client , which in turn 
	//calls operating system to create the user level thread 
	//then invokes run() method later
	
	@Override
	public void run() {
		
		//simulating might consume some time
		for(int i=0 ; i<3 ; i++) {
			System.out.println("I value" + i + "in thread " + Thread.currentThread().getName());
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " Exiting.....");
	}
	

}
