package practice13.common;

public class Employee extends Person {
	private String DepartmentNm;
	private int DepaetmentCnt;

	public String getDepartmentNm() {
		return this.DepartmentNm;
	}

	public void setDepartmentNm(String departmentNm) {
		this.DepartmentNm = departmentNm;
	}

	public int getDepaetmentCnt() {
		return this.DepaetmentCnt;
	}

	public void setDepaetmentCnt(int depaetmentCnt) {
		this.DepaetmentCnt = depaetmentCnt;
	}

}
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */

