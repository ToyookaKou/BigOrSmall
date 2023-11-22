package 実践_chapter13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LogReadSample {

	private static final String INPUT = "log.txt";

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try (
				BufferedReader in = new BufferedReader(new FileReader(INPUT));) {

			while (true) {
				String line = in.readLine();

				if (line == null) {
					break;
				}
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
