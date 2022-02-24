package structural.AdapterPattern.Example2;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public void pay(int dollars) {
		// TODO Auto-generated method stub
		
		System.out.println("Paid  in dollars" +" : "+ dollars);
	}

}
