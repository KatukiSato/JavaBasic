package practice13.common;

public class Item {

	private String Name;
	private int AdditionalDamage;

	public String getName() {
		return this.Name;
	}

	public int getAdditionalDamage() {
		return this.AdditionalDamage;
	}

	public void setName (String name){
		this.Name = name;
	}

	public void setAdditionalDamage (int additionalDamage) {
		this.AdditionalDamage = additionalDamage;
	}

	public Item(String name,int additionalDamage){
		this.Name = name;
		this.AdditionalDamage = additionalDamage;
	}




}

/*
 * ★ common.Itemクラスを作成してください
 *
 * フィールド
 * 		name	:	String
 * 		additionalDamage	:	int
 * メソッド
 * 		各フィールドのアクセサ
 * コンストラクタ
 * 		name, additionalDamageに初期値を設定するコンストラクタ
 * 		上記2つを設定するための引数を持つ
 */

