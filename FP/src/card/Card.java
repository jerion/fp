package card;

public class Card {
	private String cdnm;
	private String element;
	private int cdlv;
	private int mana;
	private int atk;
	
	public Card()
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
