package practice10;
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
		Car[] car = new Car[3];

		Car car1 = new Car();
		car1.color = "blue";
		car1.serialNo = 334;
		car1.gasoline = 50;

		Car car2 = new Car();
		car2.color = "pink";
		car2.serialNo = 417;
		car2.gasoline = 60;

		Car car3 = new Car();
		car3.color = "greeen";
		car3.serialNo = 1125;
		car3.gasoline = 7;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		for (Car kuruma : car) {
			System.out.println(kuruma.color);
			System.out.println(kuruma.serialNo);
			System.out.println(kuruma.gasoline);
			System.out.println();
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
				System.out.println("目的地にまで" + count[i] + "時間かかりました。");
			}
		}
	}
}
