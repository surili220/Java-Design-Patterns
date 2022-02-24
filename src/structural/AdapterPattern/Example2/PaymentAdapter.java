package structural.AdapterPattern.Example2;

public class PaymentAdapter {

	PaymentProcessorImpl p = new PaymentProcessorImpl();
	
	public void convertToDollars(int rupees) {
		
		int dollarAmt = rupees*10;
		p.pay(dollarAmt);
		
	}
}
