package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

			System.out.println("出力結果");
			System.out.println("-----------------------------------");

			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					if(i<1){
					System.out.print("□");

					}else if(!(i<1) && j<1) {
						System.out.print("■");

					}else if(!(i<2) && j<2) {
						System.out.print("■");

					}else if(!(i<3) && j<3) {
						System.out.print("■");

					}else if(!(i<4) && j<4) {
						System.out.print("■");

					}else if(!(i<5) && j<5) {
						System.out.print("■");

					}else {
						System.out.print("□");

					}
				}
					System.out.println();
			}

			for (int k = 5; k < 10; k++) {
				for (int l = 0; l < 5; l++) {
					if(k<6){
						System.out.print("■");

					}else if(k<7 && l<4) {
						System.out.print("■");

					}else if(k<8 && l<3) {
						System.out.print("■");

					}else if(k<9 && l<2) {
						System.out.print("■");

					}else if(k<10 && l<1) {
						System.out.print("■");

				}else {
						System.out.print("□");
					}
				}
						System.out.println();
			}
		}
	}
