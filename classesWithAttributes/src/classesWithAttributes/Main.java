package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product=new Product(1,"Laptop","Monster",3000,2);
		
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		
		
	}

}
