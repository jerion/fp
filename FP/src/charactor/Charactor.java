package charactor;

public class Charactor {
	public int level;
	public int health, mana;
	public int experience;
	
	public Charactor() {
		level = 0;
		health = 0;
		mana = 0;
		experience = 0;
	}
	
	public void setcharactor(int lv, int h, int m, int e) {
		level = lv;
		health = h;
		mana = m;
		experience = e;
	}
}
