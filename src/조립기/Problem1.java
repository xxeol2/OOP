package 조립기;

import java.util.List;

import 조립기.problem1.Assembler;
import 조립기.problem1.GameController;

class Problem1 {
	public static int solution(List<Integer> pobi, List<Integer> crong) {
		Assembler assembler = new Assembler();
		assembler.createAndWire();
		final GameController gameController = assembler.getGameController();
		int answer = gameController.playGame(pobi, crong);
		return answer;
	}
}