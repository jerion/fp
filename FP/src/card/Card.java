package card;

public class Card {
	public String name;
	public String element;
	public int level;
	public int mana;
	public int attack;
	public int add_mana;
	public int add_card;
	
	public Card()
	{
		name = null;
		element = null;
		level = 0;
		mana = 0;
		attack = 0;
		add_mana = 0;
		add_card = 0;
	}
	
	public void set_AttackCard(String Name, String Element, int Level, int Mana, int Attack)
	{
		name = Name;
		element = Element;
		level = Level;
		mana = Mana;
		attack = Attack;
	}

	public void set_EffectCard(String Name, String Element, int Level, int Mana, int AddMana, int AddCard)
	{
		name = Name;
		element = Element;
		level = Level;
		mana = Mana;
		add_mana = AddMana;
		add_card = AddCard;
	}
}
