package 디자인패턴.전략패턴;

import java.util.List;

public class Calculator {

	private DiscountStrategy discountStrategy;

	public Calculator(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public int calculate(List<Item> items) {
		int sum = 0;
		for (Item item: items) {
			sum += discountStrategy.getDiscountPrice(item);
		}
		return sum;
	}
}
