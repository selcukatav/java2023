package friendNumbers;

import java.util.*;

public class FriendNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number.");
		int number1 = input.nextInt();

		System.out.print("Please enter the second number.");
		int number2 = input.nextInt();

		int total1 = 0;
		int total2 = 0;
		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {

				total1 = total1 + i;
			}
		}
		for (int i = 1; i < number2; i++) {
			if (number2 % i == 0) {

				total2 = total2 + i;
			}
		}
		if (total1 == number2 && total2 == number1) {

			System.out.println("Your number is a Friendly Number!!");
		} else {
			System.out.println("Your number is not a Friendly Number.");

		}

	}

}
