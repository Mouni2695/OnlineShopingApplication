package application;

abstract class Homepage extends ApplicationName {

	@Override
	public void showHomepage() {
		// TODO Auto-generated method stub
		System.out.println("Homepage");
	}

	@Override
	public void showInventory() {
		// TODO Auto-generated method stub
		System.out.println("showItems");
		//System.out.println("1=>Gcroceries&Snacks,2=>Cloths,3=>Toys,4=>Eloctrical Items");
	}

	@Override
	public void selectInventory() {
		// TODO Auto-generated method stub
		System.out.println("selectInventory");
	}
}
