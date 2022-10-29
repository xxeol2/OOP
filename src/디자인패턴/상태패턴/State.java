package 디자인패턴.상태패턴;

public interface State {
	public void increaseCoin(int coin, VendingMachine vm);
	public void select(int productId, VendingMachine vm);
}
