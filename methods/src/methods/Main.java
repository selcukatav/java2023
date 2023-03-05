package methods;

public class Main {

	// class names Pascal case
	public static void main(String[] args) {
		
		String message="Today is a good day";
		String newMessage=message.substring(0,5);
		System.out.println(newMessage);
		
		int number = sum(5,4);
		System.out.println(number);
	}

	// method names camel case
	public static void add() {
		System.out.println("Today is a good day");
	}
	
	public static void delete() {
		System.out.println("Today is a good day");
	}
	public static void update() {
		System.out.println("Today is a good day");
	}
	
	public static int sum(int number1, int number2) {
		return number1+number2;
		
	}

}
