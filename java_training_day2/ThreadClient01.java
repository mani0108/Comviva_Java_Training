package java_training_day2;

public class ThreadClient01 {
	
	//if a class has main method then that class id
	//implicitly threaded
	
	public static void main(String[] args)  {
		System.out.println("The thread name in main is "+ Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	BusinessLogic bl = new BusinessLogic();
	BusinessLogic bl1 = new BusinessLogic();
	
	bl.setName("Laptop");
	bl1.setName("Monitor");
	
	bl.start();
	bl1.start();
	
	//NORM = 5 (default) MAX = 10 MIN = 1
	bl.setPriority(Thread.NORM_PRIORITY);
	bl1.setPriority(bl.getPriority()+1);
	
	for(int i=0 ; i<3 ; i++) {
		System.out.println("I value " + i + " in thread " + Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	System.out.println("Thread " + Thread.currentThread().getName() + " Exiting.....");
}

}
