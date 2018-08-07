package java_training_day2;

class Rules{
	
}

public class ShoppingLogic extends Rules implements Runnable{
	
	private Thread thread;
	
	
	public ShoppingLogic() {
		
	}
	
	

	@Override
	public void run() {
		for(int i=0 ; i<3 ; i++) {
			System.out.println("i value is " + " in " +
					Thread.currentThread().getName() + " with priority " 
					+Thread.currentThread().getPriority());
		}
		System.out.println("Thread " + Thread.currentThread() + " is exiting...");
		
	}

}
