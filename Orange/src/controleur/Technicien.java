package controleur;



public class Technicien{
	private int codet;
	private String nomt;
	private String prenomt;
	private String  mailt; 
	private int telt;
	
	public Technicien(int codet, String nomt, String prenomt, String mailt, int telt){
	this.codet   = codet;
	this.nomt    = nomt;
	this.prenomt = prenomt;
	this.mailt   = mailt;
	this.telt    = telt;
}

public Technicien(String nomt, String prenomt, String mailt, int telt)
{
	this.codet = 0;
	this.nomt    = nomt;
	this.prenomt = prenomt;
	this.mailt   = mailt;
	this.telt    = telt;
}

public Technicien(int codet2, char nomt2, char prenomt2, char mailt2, int telt2) {
	// TODO Auto-generated constructor stub
}

public int getCodet() {
	return codet;
}

public void setCodet(int codet) {
	this.codet = codet;
}

public String getNomt() {
	return nomt;
}

public void setNomt(String c) {
	this.nomt = c;
}

public String getPrenomt() {
	return prenomt;
}

public void setPrenomt(String prenomt) {
	this.prenomt = prenomt;
}

public String getMailt() {
	return mailt;
}

public void setMailt(String c) {
	this.mailt = c;
}

public int getTelt() {
	return telt;
}

public void setTelt(int telt) {
	this.telt = telt;
 	}
}












