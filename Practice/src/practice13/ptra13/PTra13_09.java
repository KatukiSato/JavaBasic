/*
 * PTra13_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Employee;
import practice13.common.Person;

public class PTra13_09 {

	/*
	 * ★ PTra13_08で作成したEmployeeクラスを使用します
	 */

	/** 名前データ（定数） */
	public static final String[] NAMEDATA = {"山田", "佐藤", "小林"};

	/** メールデータ（定数） */
	public static final String[] MAILDATA = {"yamada@hoge.com","satou@hoge.com","kobayashi@hoge.com"};

	/** パスワードデータ（定数） */
	public static final String[] PASSDATA = {"rezo0001","rezo0002","rezo0003"};

	/** 部署データ（定数） */
	public static final String[][] QUATERDATA = {
														{"総務部","業務部","システム部"},
														{"5","10","35"},
													};

	/**
	 * エントリーポイント
	 * @param args
	 */
	public static void main(String[] args) {

		// ★ 定数で定義されている各データを使用して、Employeeインスタンスを３つ作成してください
		Employee[] employee = new Employee[NAMEDATA.length];

		for(int i=0;i<employee.length;i++) {
			employee[i] = new Employee();
			employee[i].setUserId(Person.BASE_NO + i);
			employee[i].setUserNm(NAMEDATA[i]);
			employee[i].setMail(MAILDATA[i]);
			employee[i].setPassword(PASSDATA[i]);
			employee[i].setDepartmentNm(QUATERDATA[0][i]);
			employee[i].setDepaetmentCnt(Integer.parseInt(QUATERDATA[1][i]));

			System.out.println(employee[i].getUserId());
			System.out.println(employee[i].getUserNm());
			System.out.println(employee[i].getMail());
			System.out.println(employee[i].getPassword());
			System.out.println(employee[i].getDepartmentNm());
			System.out.println(employee[i].getDepaetmentCnt());
			System.out.println();


		}
//		↓  以下は自分で書いてみた所
//		各データを配列にしていない
//			employee1.setUserNm(NAMEDATA[0]);
//			employee1.setMail(MAILDATA[0]);
//			employee1.setPassword(PASSDATA[0]);
//			employee1.setDepartmentNm(QUATERDATA[0][0]);
//			employee1.setDepaetmentCnt(Integer.parseInt(QUATERDATA[1][0]));
//
//
//
//			employee2.setUserNm(NAMEDATA[1]);
//			employee2.setMail(MAILDATA[1]);
//			employee2.setPassword(PASSDATA[1]);
//			employee2.setDepartmentNm(QUATERDATA[0][1]);
//			employee2.setDepaetmentCnt(Integer.parseInt(QUATERDATA[1][1]));
//
//
//			employee3.setUserNm(NAMEDATA[2]);
//			employee3.setMail(MAILDATA[2]);
//			employee3.setPassword(PASSDATA[2]);
//			employee3.setDepartmentNm(QUATERDATA[0][2]);
//			employee3.setDepaetmentCnt(Integer.parseInt(QUATERDATA[1][2]));




//		for(int i = 0; i <3; i++) {
//			System.out.println(employee[i].getUserNm());
//			System.out.println(employee[i].getMail());
//			System.out.println(employee[i].getPassword());
//			System.out.println(employee[i].getDepartmentNm());
//			System.out.println(employee[i].getDepaetmentCnt());
//			System.out.println();
//
//		}

	}
}
