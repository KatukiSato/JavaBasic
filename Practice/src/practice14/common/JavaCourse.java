package practice14.common;

public class JavaCourse implements Course{



	public String getCourseName(){
		return  PREFIX + "Java";
	}

	public String[] getCourseUnit(){
		String[] units = {"式と演算","制御構文","メソッド","配列","オブジェクト指向","継承","高度な継承"};
		return units;
	}

}


/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
