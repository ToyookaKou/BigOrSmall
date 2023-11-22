package 実践_chapter13;

public class BigOrSmallGame {

	private int firstNum;
	private int secondNum;

	RandomNumberGenerator randomnumbergenerator = new RandomNumberGenerator();
	Player player = new Player();

	public int Game() {

		//1回目の数字を表示
		randomnumbergenerator.setNum(1, 9);
		randomnumbergenerator.getNum();
		firstNum = randomnumbergenerator.getNum();
		System.out.println("現在の数値は:" + firstNum);

		//次に出る数字の大小を予想させてから２回目の数字を出力
		player.input();

		//２回目の数字を表示
		randomnumbergenerator.setNum(1, 9);
		randomnumbergenerator.getNum();
		secondNum = randomnumbergenerator.getNum();
		System.out.println("次の数値は:" + secondNum);
		System.out.println("");

		//結果出力
		System.out.println("現在の数値：" + firstNum + "  次の数値:" + secondNum);
		if (firstNum < secondNum) {
			System.out.println("結果：Big");
		} else if (firstNum > secondNum) {
			System.out.println("結果：Small");
		} else {
			System.out.println("結果：Draw");
		}

		if (firstNum == secondNum) {
			System.out.println("Draw");
			return 0;
		} else if ((player.getPlayerChoice() == 0 && firstNum < secondNum)
				|| (player.getPlayerChoice() == 1 && firstNum > secondNum)) {
			System.out.println("Win!");
			return 1;

		} else {
			System.out.println("Lose...");
			return 2;
		}

	}

}
