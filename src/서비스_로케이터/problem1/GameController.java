package 서비스_로케이터.problem1;

import static 서비스_로케이터.problem1.ResultType.*;

import java.util.List;

public class GameController {

	public int playGame(List<Integer> pobi, List<Integer> crong) {
		List<List<Integer>> users = List.of(pobi, crong);
		PageValidChecker pageValidChecker = Locator.getInstance().getPageValidChecker();
		if (!users.stream().allMatch(pageValidChecker::checkValid)) {
			return ERROR.getCode();
		}

		ScoreCalculator scoreCalculator = Locator.getInstance().getScoreCalculator();
		int pobiScore = scoreCalculator.getScore(pobi);
		int crongScore = scoreCalculator.getScore(crong);

		WinnerSelector winnerSelector = Locator.getInstance().getWinnerSelector();
		ResultType winner = winnerSelector.getWinner(pobiScore, crongScore);

		return winner.getCode();
	}
}
