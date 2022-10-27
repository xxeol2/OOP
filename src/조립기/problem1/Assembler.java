package 조립기.problem1;

public class Assembler {
	private static GameController gameController;

	public void createAndWire() {
		PageValidChecker pageValidChecker = new PageValidCheckerImp();
		ScoreCalculator scoreCalculator = new ScoreCalculatorImp();
		WinnerSelector winnerSelector = new WinnerSelectorImp();
		this.gameController = new GameController(pageValidChecker, scoreCalculator, winnerSelector);
	}

	public GameController getGameController() {
		return this.gameController;
	}
}
