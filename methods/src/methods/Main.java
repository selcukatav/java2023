package methods;

public class Main {

	// class names Pascal case
	public static void main(String[] args) {
		
		String message="Today is a good day";
		String newMessage=message.substring(0,5);
		System.out.println(newMessage);
		
		int number = sum1(5,4);
		System.out.println(number);
		
		
		int total =sum2(2,3,4,5,6);
		System.out.println(total);
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

	public static int sum1(int number1, int number2) {
		return number1 + number2;

	}

	// "..." means that you can have many amount of numbers. not like in sum1.
	public static int sum2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;

	}

}
