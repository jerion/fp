package card;

public class Atk_Card extends Card {
	
	public int Attack;
	
	public Atk_Card(String name, String element, int level, int mana, int attack) {
		super(name, element, level, mana);
		Attack = attack;
	}
}
