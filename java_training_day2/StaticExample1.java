package java_training_day2;

public class StaticExample1 {
	static int x = 33;
	//static methods are called without objects
	public static int add(int num1, int num2) {
		System.out.println("x is : " + x);
		return num1 + num2;

	}
	
	static {
		System.out.println("Printing from first static block");
	}
	
	static {
		x=3434;
		System.out.println("Printing from second static block");
	}
	
	public static void main(String[] args) {
		//StaticExample1 s = new StaticExample1();
		System.out.println("Result is "  + add(22, 8));
	}

}
