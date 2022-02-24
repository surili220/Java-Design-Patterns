package structural.AdapterPattern.Example2;

public class PaymentApp {
	
	PaymentAdapter adapter = new PaymentAdapter();
	
	 public  void makePayment(int rupees) {
		
		 adapter.convertToDollars(rupees);
		 
	 }
	 
}
