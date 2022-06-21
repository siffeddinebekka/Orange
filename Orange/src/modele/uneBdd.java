package modele;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class uneBdd{
	
	public uneBdd (String serveur, String bdd, String user, String mdp)
	{
		this.setMaConnexion(null);
	}
	public static void seConnecter()
	{
		String url ="jbdc:mysql//"+ this.serveur+"/"+this.bdd;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.maConnexion = DriverManager.getConnection(url, this.user,this.mdp);			
		}catch(ClassNotFoundException exp) {
			System.out.println("Absence du pilote jdbc");
		}catch(SQLException exp) {
			System.out.println("Erreur de connexion a :" +url);
			exp.printStackTrace();
		}
	}
	public static void seDeconnecter ()
	{
		try {
			if (this.maConnexion != null) {
				this.maConnexion.close();
			}
		}catch(SQLException exp) {
			System.out.println("Erreur de déconnexion au serveur !");
		}
	}
	public static Connection getMaConnexion() {
		return this.maConnexion;
		
	}
	public void setMaConnexion(Connection maConnexion) {
	}
}