package practice13.common;

public class SuperHero extends Hero{
	private Item Equipment;

	public Item getEquipment() {
		return this.Equipment;
	}

	public void setEquipment(Item epuipment) {
		this.Equipment = epuipment;
	}

	 

		public int attack() {
			return this.getPower()+Equipment.getAdditionalDamage();
		}
}
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */