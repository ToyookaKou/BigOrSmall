package 実践_chapter13;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	private int max;
	private int min;

	//乱数の範囲を設定
	public void setNum(int min, int max) {
		this.max = max;
		this.min = min;

	}

	//乱数の取得
	public int getNum() {
		int element = max - min + 1;
		return random.nextInt(element) + min;
	}
}
