package perfectNumber;

import java.util.*;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Write a number");
		int number = input.nextInt();
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;

			}

		}
		if (total != number) {
			System.out.println("Your number is not a Perfect Number");

		} else {
			System.out.println("Your number is a Perfect Number!!");
		}

	}

}
