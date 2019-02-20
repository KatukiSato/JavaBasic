package practice18.entity;

public class Player {
	private String Position;
	private String Name;
	private String Country;
	private String Team;

	public String getPosition() {
		return this.Position;
	}

	public void setPosition(String position) {
		this.Position = position;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getCountry() {
		return this.Country;
	}

	public void setCountry(String country) {
		this.Country = country;
	}

	public String getTeam() {
		return this.Team;
	}

	public void setTeam(String team) {
		this.Team = team;
	}

	public String toString(){
		return this.Position + "," + this.Name + "," + this.Country + "," + this.Team;

	}

}

/*
 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
 *
 * フィールド
 * 		position	：	String
 * 		name		：	String
 * 		country		：	String
 * 		team		：	String
 * メソッド
 * 		各アクセサ
 *
 * 		toString()	：	Objectクラスのオーバーライド
 * 		各フィールドの値を、カンマ区切りの文字列で取得する
 */