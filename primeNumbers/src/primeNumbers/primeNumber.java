package primeNumbers;

import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please write a number: ");
		int number = input.nextInt();
		
		boolean isPrime = true;
		if (number < 1) {
			System.out.println("Please type an invalid number.");
			return;

		}
		try {
			if (number == 1) {
				System.out.println("Your Number is not a Prime Number");
				return;

			}

		} catch (Exception e) {
			// TODO: handle exception
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}

			}
		}

		if (isPrime) {
			System.out.println("Your Number is Prime Number");
		} else {
			System.out.println("Your number is not a Prime Number.");
		}

	}

}
