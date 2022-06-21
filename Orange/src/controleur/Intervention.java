package controleur;

public class Intervention{
	private int codei;
	private String adressei, date, objet;
	private int codet1, codet2, codec;
	
	
	public Intervention(String adressei, String date, String objet, int codei ,int codet1,int codet2,int codec)
	{
		this.codei = codei;
		this.adressei = adressei;
		this.date = date;
		this.objet = objet;
		this.codet1 = codet1;
		this.codet2 = codet2;
		this.codec = codec; 
		
	}
	public Intervention(String adressei, String date, String objet, int codet1, int codet2, int codec,)
	{
		this.codei = 0;
		this.adressei = adressei;
		this.date = date;
		this.objet = objet;
		this.codet1 = codet1;
		this.codet2 = codet2;
		this.codec = codec; 
	}
	public int getCodei() {
		return codei;
	}
	public void setCodei(int codei) {
		this.codei = codei;
	}
	public String getAdressei() {
		return adressei;
	}
	public void setAdressei(String c) {
		this.adressei = c;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet1(String objet) {
		this.objet = objet;
	}
	public int getCodet1() {
		return codet1;
	}
	public void setCodet1(int codet1) {
		this.codet1 = codet1;
	}
	public int getCodet2() {
		return codet2;
	}
	public void setCodet2(int codet2) {
		this.codet2 = codet2;
	}
	public int getCodec() {
		return codec;
	}
	public void setCodec(int codec) {
		this.codec = codec;
	}
	public void setObjet(String saisirChar) {
		// TODO Auto-generated method stub
		
	}
		
	
}