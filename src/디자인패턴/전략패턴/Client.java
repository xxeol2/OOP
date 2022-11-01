package 디자인패턴.전략패턴;

public class Client {
	private DiscountStrategy strategy;

	public void onFirstGuestButtonClick() {
		strategy = new FirstGuestDiscountStrategy();
	}

	public void onCalculationButtonClick() {
		Calculator cal = new Calculator(strategy);
		int price = cal.calculate(items);
	}
}
