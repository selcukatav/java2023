package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList= {3.4,5.2,16.5,22.12};
		double total=0;
		double max= myList[0];
		for(double number: myList) {
			
			if (max<number) {
				max=number;
			} 
			total = total + number;
			System.out.println(number);
			
		}
		System.out.println("Total= "+ total);
		System.out.println("Max Number"+ max);
		
		
	}

}
