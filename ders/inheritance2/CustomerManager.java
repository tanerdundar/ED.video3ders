package video3.ders.inheritance2;

public class CustomerManager {
	
//WRONG CODE	public void add() {
//WRONG CODE		System.out.println("Customer add..");
//WRONG CODE		DatebaseLogger logger = new DatebaseLogger();
//WRONG CODE		logger.log();
//WRONG CODE		
//WRONG CODE	}
	
	
	public void add(Logger logger) {
		
		System.out.println("Customer add..");
		logger.log();
	}

}
