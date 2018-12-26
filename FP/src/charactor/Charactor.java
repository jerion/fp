package charactor;

public class Charactor {
	public String Name;
	public int Level;
	public int health, mana;
	public int experience;
	public int Money;
	
	public Charactor(String name, int level, int hp, int mp, int exp, int money) {
		Name = name;
		Level = level;
		health = hp;
		mana = mp;
		experience = exp;
		Money = money;
	}
}
