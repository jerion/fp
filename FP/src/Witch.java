
public class Witch {

	public static void main(String[] args) {
		charactor witch = new charactor();
		card[] cdgp = new card[7];
		
		witch.setchr(1, 20, 1, 2);
		
		for (int i = 0; i<3; i++)
		{
			cdgp[i].setcd("����", "���q", 1, 0, 2);
		}
		
		for (int i = 3; i<4; i++)
		{
			cdgp[i].setcd("���K����", "��", 1, 1, 3);
		}
		
		for (int i = 0; i<3; i++)
		{
			cdgp[i].setcd("�H�B�b", "��", 1, 1, 4);
		}
	}

}

class charactor{
	private int level;
	private int hp, mp, exp;
	
	public charactor()
	{
		level = 0;
		hp = 0;
		mp = 0;
		exp = 0;
	}
	
	public void setchr(int lv, int h, int m, int e)
	{
		level = lv;
		hp = h;
		mp = m;
		exp = e;
	}
}

class card{
	private String cdnm;
	private String element;
	private int cdlv;
	private int mana;
	private int atk;
	
	public card()
	{
		cdnm = "null";
		element = "null";
		cdlv = 0;
		mana = 0;
		atk = 0;
	}
	
	public void setcd(String nm, String ele, int lv, int mag, int atc)
	{
		cdnm = nm;
		element = ele;
		cdlv = lv;
		mana = mag;
		atk = atc;
	}
}