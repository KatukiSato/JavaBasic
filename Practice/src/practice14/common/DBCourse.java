package practice14.common;

public class DBCourse implements Course{

	public String getCourseName(){
		return "「【Eラーニング】DB基礎」";
	}

	public String[] getCourseUnit(){
		String[] units = {"DB基礎","SQL基礎","正規化","SQL応用"};
		return units;
	}

}
/*
 * ★ common.Courseを実装した、DBCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】DB基礎」
 * 単元
 * 		DB基礎
 * 		SQL基礎
 * 		正規化
 * 		SQL応用
 */
