package 서비스_로케이터.problem1;

import static 서비스_로케이터.problem1.ResultType.*;

public class WinnerSelectorImp implements WinnerSelector {

	@Override
	public ResultType getWinner(int pobiScore, int crongScore) {
		if (pobiScore == crongScore)
			return DRAW;
		return (pobiScore > crongScore) ? POBI_WIN : CRONG_WIN;
	}
}
