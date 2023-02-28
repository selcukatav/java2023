package oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "Expiry Rate";
		Product product1 = new Product();
		product1.setName("Coffee Machine");
		product1.setDiscount(0.1);
		product1.setUnitPrice(2500);
		product1.setImageUrl("coffeemachine.jpg");
		product1.setUnitsInStock(250);

		Product product2 = new Product();
		product2.setName("Washing Machine");
		product2.setDiscount(0.2);
		product2.setUnitPrice(1500);
		product2.setImageUrl("washingmachine.jpg");
		product2.setUnitsInStock(150);

		Product product3 = new Product();
		product3.setName("Dishwasher");
		product3.setDiscount(0.5);
		product3.setUnitPrice(2521);
		product3.setImageUrl("dishwasher.jpg");
		product3.setUnitsInStock(250);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());

		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(5);
		individualCustomer.setPhone("05522235422");
		individualCustomer.setCustomerNumber("655221422");
		individualCustomer.setFirstName("Ahmet");
		individualCustomer.setLastName("Mehmet");

		CooparateCustomer cooparateCustomer = new CooparateCustomer();
		cooparateCustomer.setId(4);
		cooparateCustomer.setCompanyName("seco");
		cooparateCustomer.setPhone("05552221231");
		cooparateCustomer.setTaxNumber("222222222");
		cooparateCustomer.setCustomerNumber("55123");
		
		Customers[] customers = {individualCustomer,cooparateCustomer};

	}

}
