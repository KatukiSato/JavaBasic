/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

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

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		ArrayList<Player> gk = new ArrayList<>();
		ArrayList<Player> df = new ArrayList<>();
		ArrayList<Player> mf = new ArrayList<>();
		ArrayList<Player> fw = new ArrayList<>();

		Collections.shuffle(array);

		for (int i = array.size() - 1; i >= 0; i--) {
			if (array.get(i).getPosition().equals("GK")) {
				gk.add(array.get(i));
			}
			if (array.get(i).getPosition().equals("DF")) {
				df.add(array.get(i));
			}
			if (array.get(i).getPosition().equals("MF")) {
				mf.add(array.get(i));
			}
			if (array.get(i).getPosition().equals("FW")) {
				fw.add(array.get(i));
			}
		}

		System.out.println(gk.get(1).toString());

		for (int i = 0; 4 > i; i++) {
			System.out.println(df.get(i).toString());
		}

		for (int i = 0; 4 > i; i++) {
			System.out.println(mf.get(i).toString());
		}

		for (int i = 0; 2 > i; i++) {
			System.out.println(fw.get(i).toString());
		}
	}
}
