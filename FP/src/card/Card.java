package card;

public class Card {
	public String name;
	public String element;
	public int level;
	public int mana;
	public int attack;
	
	public int add_mana;
	public int add_card;
	public int copy_card;
	
	public Card(String nm, String ele, int lv, int mn, int atk)
	{
		name = nm;
		element = ele;
		level = lv;
		mana = mn;
		attack = atk;
	}
	
	public void effect(int amana, int acard, int ccard)
	{
		add_mana = amana;
		add_card = acard;
		copy_card = ccard;
	}
	
}
