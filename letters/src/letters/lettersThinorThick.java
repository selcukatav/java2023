package letters;
import java.util.*;
public class lettersThinorThick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		char letter='E';
		switch (letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		
			System.out.println("Thick voiced letter.");
			break;

		default:
			System.out.println("Thin voiced letter.");
			break;
		}

	}

}
