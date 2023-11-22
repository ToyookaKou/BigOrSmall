package 実践_chapter13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	private int playerChoice;
	private String[] bigOrSmall = { "big", "small" };

	public void input() {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.print("次の数値はBig or Small?(Big:0 Small:1)");
				this.playerChoice = scanner.nextInt();
				if (playerChoice != 0 && playerChoice != 1) {
					throw new IntException("0または1で入力してください");
				} else {
					System.out.println("あなたの予想は:" + bigOrSmall[playerChoice]);
					break;
				}
			} catch (IntException e) {
				System.out.println("0または1で入力してください");
			} catch (InputMismatchException e) {
				System.out.println("数値を入力してください");
			}

		}
	}

	public int getPlayerChoice() {
		return this.playerChoice;
	}

}
