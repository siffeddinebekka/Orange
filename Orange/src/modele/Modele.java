package modele;

import java.beans.Statement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import controleur.Client;
import controleur.Intervention;
import controleur.Technicien;




public class Modele {
	private static Bdd uneBdd ("localhost","orange","root","");
	
	public static void insertClient (Client unClient) {
		String requete = "INSERT INTO client VALUES (null '"
				+unClient.getNomc() + "',"
				+unClient.getPrenomc() + "',"
				+unClient.getMailc() +",";
		try {
			uneBdd.seConnecter();
			Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
			unStat.execute();
			((ResultSet) unStat).close();
			uneBdd.seDeconnecter();
		}catch(SQLException exp) {
			System.out.println("Erreur de requete : " + requete);
		}
	}
	public static ArrayList<Client>  ArrayList<Client> selectAllClients(){
		ArrayList<Client> lesClients = new ArrayList<Client>();
		String requete = "SELECT * FROM client;";
		try{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desResultats = unStat.executeQuery(requete);
			while (desResultats.next()) {
				Client unClient = new Client(
						desResultats.getInt("codec"),
						desResultats.getString("Nomc"),
						desResultats.getString("Prenomc"),
						desResultats.getString("Mailc")
						);
				lesClients.add(unClient);				
			}
			unStat.close();
			uneBdd.seDeconnecter();
		}catch (SQLException exp) {
			System.out.println("Erreur de requete : " + requete);
		}
		return lesClients;
	}
	public static void deleteClient (int codec) {
		String requete="DELETE * FROM client where codec = "+codec+";";
		try { 
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		}catch (SQLException exp) {
			System.out.println("Erreur de la requete : " +requete);
		}
	}	
		public static Client selectWhereClient(int codec) {
			Client unClient = null;
			String requete ="SELECT * FROM client WHERE codec = "+codec+";";
			try {
				uneBdd.seConnecter();
				Statement unStat = uneBdd getMaConnexion1().createstatement();
				ResultSet unResutat = unStat.executeQuery(requete);
				if(unResutat.next()) {
					unClient = new Client(
							unResultat.getInt("codec"),
							unResultat.getString("Prenomc"),
							unResultat.getString("Nomc"),
							unResultat.getString("Mailc")
							);
				}
				unStat.close();
				uneBdd.seDeconnecter();
			}catch (SQLException exp) {
				System.out.println("Erreur de requete : " + requete);
			}
			return unClient;
		}
		public static void updateClient(Client unClient) {
			String requete ="UPDATE client set nom ='"
					+unClient.getNomc() +"', prenom = '"
					+unClient.getPrenomc() +"'mail = '"
					+unClient.getMailc() + "'WHERE codec = '"+unClient.getCodec()+";";
		try { 
		uneBdd.seConnecter();
		java.sql.Statement unStat = uneBdd.getMaConnexion().createStatement();
		unStat.execute(requete);
		unStat.Close();
		uneBdd.seDeconnecter();
	}catch (SQLExeption exp) {
		System.out.println("Erreur de la requete : " +requete);
	}
}

public static int countClient () {
	int nbclient = 0;
	String requete = "SELECT count(*) as nb from client;";
	try {
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		ResultSet unResultat = unStat.executeQuery(requete);
		if (unResultat.next()) {
			nbclient +unResultat.getInt(nb);
		}
		unStat.close();
		uneBdd.seDeconnecter();
	}catch (SQLException exp) {
		System.out.println("Erreur de requete : " +requete);
	}
	return nbclient;
}
}

	
	public static void insertIntervention (Invertvention uneIntervention) {
		String requete = "INSERT INTO intervention VALUES (null '"
				+uneIntervention.getadressei() + "',"
				+uneIntervention.getdate() + "',"
				+uneIntervention.getobjet() +",";
		try {
			uneBdd.seConnecter();
			Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
			unStat.execute(requete);
			unStat.close();
			uneBdd.seDeconnecter();
		}catch(SQLException exp) {
			System.out.println("Erreur de requete : " + requete);
		}
	}
	public static ArrayList‹Intervention> selectAllInterventions(){
		ArrayList‹Intervention> lesInterventions = new ArrayList‹Intervention>();
		String requete = "SELECT * FROM intervention;";
		try{
			uneBdd.seConnecter();
			Statemet unStat = uneBdd.getMaConnexion().createStatement();
			ResultSet desResultats = unStat.executeQuery(requete);
			while (desResultat.next()) {
				Intervention uneIntervention = new Intervention(
						desResultat.getInt("codei"),
						desResultat.getString("adressei"),
						desResultat.getString("date"),
						desResultat.getString("objet")
						);
				lesInterventions.add(uneIntervention);				
			}
			unStat.close();
			uneBdd.seDeconnecter();
		}catch (SQLException exp) {
			System.out.println("Erreur de requete : " + requete);
		}
		return lesInterventions;
	}
	public static void deleteIntervention (int codei) {
		String requete="DELETE * FROM intervention where codei = "+codei+";";
		try { 
			uneBdd.seConnecter();
			Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
			unStat.execute();
			unStat.Close();
			uneBdd.seDeconnecter();
		}catch (SQLExeption exp) {
			System.out.println("Erreur de la requete : " +requete);
		}
	}	
		public static Intervention selectWhereIntervention(int codei) {
			Intervention uneIntervention = null;
			String requete ="SELECT * FROM intervention WHERE codei = "+codei+";";
			try {
				uneBdd.seConnecter();
				Statement unStat = uneBdd getMaConnexion11().createstatement();
				ResultSet unResutat = unStat.executeQuery(requete);
				if(unResutat.next()) {
					uneIntervention = new Intervention(
							unResultat.getInt("codei"),
							unResultat.getString("adressei"),
							unResultat.getString("date"),
							unResultat.getString("Objet")
							);
				}
				unStat.close();
				uneBdd.seDeconnecter();
			}catch (private void createstatement() {
					// TODO Auto-generated method stub
					
				}
			SQLException exp) {
				System.out.println("Erreur de requete : " + requete);
			}
			return uneIntervention;
		}
		public static void updateIntervention(Intervention uneIntervention) {
			String requete ="UPDATE client set adresse ='"
					+uneIntervention.getAdressei() +"', date = '"
					+uneIntervention.getDate() +"'objet = '"
					+uneIntervention.getObjet() + "'WHERE codei = '"+uneIntervention.getCodei()+";";
	}try { 
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		unStat.execute(requete);
		unStat.Close();
		uneBdd.seDeconnecter();
	}catch (SQLExeption exp) {
		System.out.println("Erreur de la requete : " +requete);
	}
}

public static int countIntervention () {
	int nbintervention = 0;
	String requete = "SELECT count(*) as nb from intervention;";
	try {
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		ResultSet unResultat = unStat.executeQuery(requete);
		if (unResultat.next()) {
			nbitervention +unResultat.getInt(nb);
		}
		unStat.close();
		uneBdd.seDeconnecter();
	}catch (SQLException exp) {
		System.out.println("Erreur de requete : " +requete);
	}
	return nbintervention;
}
public static void insertTechnicien (Technicien unTechnicien) {
	String requete = "INSERT INTO technicien VALUES (null '"
			+unTechnicien.getNomt() + "',"
			+unTechnicien.getPrenomt() + "',"
			+unTechnicien.getMailt() +",";
	try {
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		unStat.execute();
		((ResultSet) unStat).close();
		uneBdd.seDeconnecter();
	}catch(SQLException exp) {
		System.out.println("Erreur de requete : " + requete);
	}
}
public static ArrayList<Technicien> selectAllTechnicien(){
	ArrayList<Technicien> unTechnicien = new ArrayList<Technicien>();
	String requete = "SELECT * FROM technicien;";
	try{
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		ResultSet desResultats = ((java.sql.Statement) unStat).executeQuery(requete);
		while (desResultat.next()) {
			Technicien unTechnicien = new Technicien(
					desResultat.getInt("codet"),
					desResultat.getString("nomt"),
					desResultat.getString("prenomt"),
					desResultat.getString("mailt")
					);
			lesInterventions.add(unTechnicien)v;				
		}
		unStat.close();
		uneBdd.seDeconnecter();
	}catch (SQLException exp) {
		System.out.println("Erreur de requete : " + requete);
	}
	return unTechnicien);
}
public static void deleteTechnicien (int codet) {
	String requete="DELETE * FROM technicien where codet = "+codet+";";
	try { 
		uneBdd.seConnecter();
		Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
		unStat.execute(requete);
		unStat.Close();
		uneBdd.seDeconnecter();
	}catch (SQLExeption exp) {
		System.out.println("Erreur de la requete : " +requete);
	}
}	
	public static Technicien selectWhereTechnicien(int codet) {
		Intervention uneIntervention = null;
		String requete ="SELECT * FROM technicien WHERE codet = "+codet+";";
		try {
			uneBdd.seConnecter();
			Statement unStat = uneBdd getMaConnexion().createstatement();
			ResultSet unResutat = unStat.executeQuery(requete);
			if(unResutat.next()) {
				uneIntervention = new Intervention(
						unResultat.getInt("codet"),
						unResultat.getString("nomt"),
						unResultat.getString("prenomt"),
						unResultat.getString("mailt")
						);
			}
			unStat.close();
			uneBdd.seDeconnecter();
		}catch (SQLException exp) {
			System.out.println("Erreur de requete : " + requete);
		}
		return unTechnicien;
	}
	public static void updateTechnicien(Technicien unTechnicien)) {
		String requete ="UPDATE intervention set nom ='"
				+unTechnicien.getNomt() +"', prenom = '"
				+unTechnicien.getPrenomt() +"'mail = '"
				+unTechnicien.getMailt() + "'WHERE codet = '"+unTechnicien.getCodet()+";";
}try { 
	uneBdd.seConnecter();
	Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
	unStat.execute(requete);
	unStat.Close();
	uneBdd.seDeconnecter();
}catch (SQLExeption exp) {
	System.out.println("Erreur de la requete : " +requete);
}
}

public static int countTechnicien () {
int nbtechnicien = 0;
String requete = "SELECT count(*) as nb from technicien;";
try {
	uneBdd.seConnecter();
	Statement unStat = (Statement) uneBdd.getMaConnexion().createStatement();
	ResultSet unResultat = ((java.sql.Statement) unStat).executeQuery(requete);
	if (unResultat.next()) {
		nbtechnicien = unResultat.getInt(nbtechnicien);
	}
	((ResultSet) unStat).close();
	uneBdd.seDeconnecter();
}catch (SQLException exp) {
	System.out.println("Erreur de requete : " +requete);
}
return nbtechnicien;
}
public static ArrayList<Technicien> selectAllTechniciens() {
	// TODO Auto-generated method stub
	return null;
}
}












