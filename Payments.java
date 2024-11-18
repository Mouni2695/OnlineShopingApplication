package application;

public class Payments extends AddAddress {

	@Override
	public void selectPaymentMethods() {
		// TODO Auto-generated method stub
		System.out.println("Select PaymentMode");
	}

	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Place your order");
		System.out.println("Your Order is Successfull");
	}

	@Override
	public void feedback() {
		// TODO Auto-generated method stub
		System.out.println("feedback");
	}

	public static void main(String[] args) {

		Payments p = new Payments();
		p.applicationName();
		p.registration();
		p.login();
		p.showHomepage();
		p.showInventory();
		p.selectInventory();
		p.showItems();
		p.selectItems();
		p.addtoCart();
		p.orderFullfilment();
		p.selectAddress();
		p.selectPaymentMethods();
		p.placeOrder();
		p.feedback();
	}
}
