/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] p = line.split(",");

				Player pl = new Player();

				pl.setPosition(p[0]);
				pl.setName(p[1]);
				pl.setCountry(p[2]);
				pl.setTeam(p[3]);

				array.add(pl);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください

		// ★ 削除後のArrayListの中身を全件出力してください

		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ")) {
				array.remove(i);
			}
		}
		System.out.println(array.toString());

	}
}
