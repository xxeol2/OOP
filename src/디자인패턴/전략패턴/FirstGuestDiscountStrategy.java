package 디자인패턴.전략패턴;

public class FirstGuestDiscountStrategy implements DiscountStrategy {

	@Override
	public int getDiscountPrice(Item item) {
		return (int)(item.getPrice() * 0.9);
	}
}
