package 서비스_로케이터;

import java.util.List;

import 서비스_로케이터.problem1.GameController;
import 서비스_로케이터.problem1.Locator;
import 서비스_로케이터.problem1.PageValidCheckerImp;
import 서비스_로케이터.problem1.ScoreCalculatorImp;
import 서비스_로케이터.problem1.WinnerSelectorImp;

class Problem1 {
	public static int solution(List<Integer> pobi, List<Integer> crong) {
		int lastPage = 400;
		PageValidCheckerImp pageValidChecker = new PageValidCheckerImp(lastPage);
		ScoreCalculatorImp scoreCalculator = new ScoreCalculatorImp();
		WinnerSelectorImp winnerSelector = new WinnerSelectorImp();

		Locator locator = new Locator(pageValidChecker, scoreCalculator, winnerSelector);
		Locator.init(locator);

		final GameController gameController = new GameController();
		int answer = gameController.playGame(pobi, crong);
		return answer;
	}
}