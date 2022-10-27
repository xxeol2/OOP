package 조립기.problem1;

import static 조립기.problem1.ResultType.*;

public class WinnerSelectorImp implements WinnerSelector {

	@Override
	public ResultType getWinner(int pobiScore, int crongScore) {
		if (pobiScore == crongScore)
			return DRAW;
		return (pobiScore > crongScore) ? POBI_WIN : CRONG_WIN;
	}
}
