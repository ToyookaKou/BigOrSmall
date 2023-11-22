package 実践_chapter13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BigOrSmall {

	private static final String outputFile = "log.txt";

	private int Score = 0;
	private int gameCount = 10;
	private int bonusPoint = 0;

	//インスタンス生成
	BigOrSmallGame game = new BigOrSmallGame();

	//メソッド作成
	public void play() {

		System.out.println("Big or Smallをプレイします");

		while (true) {
			System.out.println("残りのプレー数：" + gameCount);

			//ゲーム開始
			int result = game.Game();

			//得点、ゲーム回数の管理
			if (result == 1) {
				this.Score += 100;
				this.gameCount--;
				this.bonusPoint++;
				Score += (bonusPoint - 1) * 100;
			} else if (result == 2) {
				gameCount--;
				bonusPoint = 0;
			}
			//プレイ数、スコア、数字を表示
			System.out.println("残りプレイ回数:" + this.gameCount + " ,スコア" + this.Score);
			System.out.println("");

			//gameCountが0になったらループ抜ける
			if (gameCount == 0) {
				System.out.println("GAME OVER");
				System.out.println("トータル：" + Score);
				System.out.println("");
				break;
			}
		}

		//記録用の日時取得
		LocalDateTime localDateTime = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		try (
				FileWriter fw = new FileWriter(outputFile, true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw);) {
			out.println("スコア:" + Score + "  " + dateTimeFormatter.format(localDateTime));
			out.println("");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}