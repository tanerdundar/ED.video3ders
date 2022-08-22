package video3.ders.inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + " numbered customer added.");
	}
	
	//bulk insert
	public void addMultiple(Customer[] customers) {

		for(Customer customer : customers) {
			add(customer);
		}
	}

}
