package structural.AdapterPattern.Example2;

public class TestMain {
	public static void main(String[] args) {
		int rupees = 10;
		PaymentApp app = new PaymentApp();
		app.makePayment(rupees);
	}
}
