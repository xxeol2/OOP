package 디자인패턴.상태패턴;

public class SelectableState implements State {

	@Override
	public void increaseCoin(int coin, VendingMachine vm) {
		vm.insertCoin(coin);
	}

	@Override
	public void select(int productId, VendingMachine vm) {
		vm.provideProduct(productId);
		vm.decreaseCoin();

		if (vm.hasNoCoin())
			vm.changeState(new NoCoinState());
	}
}
