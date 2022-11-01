package 디자인패턴.전략패턴;

public class Client {
	private DiscountStrategy strategy;

	public void onFirstGuestButtonClick() {
		// 첫 손님 할인 버튼 누를 때 생성
		strategy = new FirstGuestDiscountStrategy();
	}

	public void onLastGuestButtonClick() {
		// 마지막 손님 대폭 할인 버튼 누를 때 생성
		strategy = new LastGuestDiscountStrategy();
	}

	public void onCalculationButtonClick() {
		// 계산 버튼 누를 때 실행
		Calculator cal = new Calculator(strategy);
		int price = cal.calculate(items);
	}
}
