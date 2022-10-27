package 조립기.problem1;

public class Locator {
	private static Locator instance;

	public static Locator getInstance() {
		return instance;
	}

	public static void init(Locator locator) {
		instance = locator;
	}

	private PageValidChecker pageValidChecker;
	private ScoreCalculator scoreCalculator;
	private WinnerSelector winnerSelector;

	public Locator(PageValidChecker pageValidChecker, ScoreCalculator scoreCalculator,
		WinnerSelector winnerSelector) {
		this.pageValidChecker = pageValidChecker;
		this.scoreCalculator = scoreCalculator;
		this.winnerSelector = winnerSelector;
	}

	public PageValidChecker getPageValidChecker() {
		return pageValidChecker;
	}

	public ScoreCalculator getScoreCalculator() {
		return scoreCalculator;
	}

	public WinnerSelector getWinnerSelector() {
		return winnerSelector;
	}
}
