package video3.ders.inheritance;

public class Main {
	
	public static void main (String [] args) {
		
		IndividualCustomer taner = new IndividualCustomer();
		taner.customerNumber= "12345";
		
		UnionCustomer abc = new UnionCustomer();
		abc.customerNumber= "678910";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "9999";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(taner);
//		customerManager.add(abc);
		Customer [] customers = {taner,hepsiBurada,abc}; 
		customerManager.addMultiple(customers);
		
		
	}

}
