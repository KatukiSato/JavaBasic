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
		car3.gasoline = 70;

		car[0] = car1;
		car[1] = car2;
		car[2] = car3;

		final int distance = 300;

		int progress = 0;
		int count = 0;

		for(int i = 0; i < car.length; i++) {
			car[i].run();
		}

		while (progress < distance) {
			count ++;
			progress += car[0].run();
			if(!(car[0].gasoline == 0)) {
				continue;
			}else {
				break;
			}
		}
		if (car[0].gasoline <= 0) {
			System.out.println("目的地に到達できませんでした");
		} else {
			System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car[0].gasoline+"リットルです");
		}

		progress =  0;
		count = 0;

		while (progress < distance) {
			count ++;
			progress += car[1].run();
			if(!(car[1].gasoline == 0)) {
				continue;
			}else {
				break;
			}
		}
		if (car[1].gasoline <= 0) {
			System.out.println("目的地に到達できませんでした");
		} else {
			System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car[1].gasoline+"リットルです");
		}
 
		progress = 0;
		count = 0;

		while (progress < distance) {
			count ++;
			progress += car[2].run();
			if(!(car[2].gasoline == 0)) {
				continue;
			}else {
				break;
			}
		}
		if (car[2].gasoline <= 0) {
			System.out.println("目的地に到達できませんでした");
		} else {
			System.out.println("目的地にまで"+count+"時間かかりました。残りのガソリンは、"+car[2].gasoline+"リットルです");
		}
	}
}

