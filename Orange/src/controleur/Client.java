package controleur;

public class Client{
	private int codec;
	char nomc;
	char prenomc;
	private char  mailc; 
	private int telc;
	
	
	public Client(int codec, String nomc, String prenomc, String mailc, int telc)
	{
	this.codec   = codec;
	this.nomc    = nomc;
	this.prenomc = prenomc;
	this.mailc   = mailc;
	this.telc    = telc;
}

public Client(char nomc2, char prenomc2, char mailc2, int telc)
{
	this.codec = 0;
	this.nomc    = nomc2;
	this.prenomc = prenomc2;
	this.mailc   = mailc2;
	this.telc    = telc;
}

public int getCodec() {
	return codec;
}

public void setCodec(int codec) {
	this.codec = codec;
}

public String getNomc() {
	return nomc;
}

public void setNomc(String nomc) {
	this.nomc = nomc;
}

public String getPrenomc() {
	return prenomc;
}

public void setPrenomc(String prenomc) {
	this.prenomc = prenomc;
}

public String getMailc() {
	return mailc;
}

public void setMailc(String mailc) {
	this.mailc = mailc;
}

public int getTelt() {
	return telc;
}

public void setTelt(int telt) {
	this.telc = telt;
}

public String getTelc() {
	// TODO Auto-generated method stub
	return null;
}

public void setTelc(int saisirInt) {
	// TODO Auto-generated method stub
	
}

}
