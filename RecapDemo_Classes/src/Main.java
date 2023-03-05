import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FourTransactions fourTransaction = new FourTransactions();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please choose your action on your calculator: ");
		System.out.print("1= Add ");
		System.out.print("2= Subtract ");
		System.out.print("3= Divide ");
		System.out.print("4= Multiply ");
		int number=input.nextInt();
		
		System.out.print("Please enter your first number: ");
		int number1=input.nextInt();
		
		System.out.print("Please enter your second number: ");

		int number2 = input.nextInt();
		
		
		
		
		switch (number) {
		
		case '1':
			
			System.out.println(fourTransaction.Sum(number1, number2));
			break;
		case '2':
			
			System.out.println(fourTransaction.Sub(number1, number2));
			break;
		case '3':
			System.out.println(fourTransaction.Div(number1, number2));
			break;
		case '4':
			System.out.println(fourTransaction.Mul(number1, number2));
			break;

		default:
			break;
		}

	}

}
