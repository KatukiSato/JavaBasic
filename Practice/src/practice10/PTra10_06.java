package practice10;

import java.util.Scanner;

/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Scanner scanner = new Scanner(System.in);

		Car[] car = new Car[3];

		for(int i = 0; i < car.length; i++) {
			System.out.println((i+1) + "台目");
			car[i] = new Car();

			System.out.println("シリアルナンバーと色、ガソリンをカンマ区切りで入力してください");
			String line = scanner.nextLine();

			String[] info = line.split(",");

			car[i].serialNo = Integer. parseInt(info[0]);
			car[i].color = info[1];
			car[i].gasoline = Integer.parseInt(info[2]);
		}

		final int distance = 300;

		int[] count = new int[car.length];

		for (int i = 0; i < car.length; i++) {
			int move = 0;
			car[i].run();

			while (distance - move > 0) {
				int progress = car[i].run();
				if (progress == -1) {
					count[i] = -1;
					break;
				}
				count[i]++;
				move += progress;
			}
		}
		for (int i = 0; i < car.length; i++) {
			if (count[i] == -1) {
				System.out.println("目的地に到達できませんでした");
			} else {
				System.out.println("目的地にまで" + count[i] + "時間かかりました。残りのガソリンは" + car[i].gasoline +"です。");
			}
		}
	}
}
