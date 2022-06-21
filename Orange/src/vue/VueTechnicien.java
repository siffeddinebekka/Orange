package vue;

import controleur.Technicien;

public class VueTechnicien {
	
	public static Technicien saisirTechnicien()
	{
		Technicien unTechnicien = null;
		System.out.println("-------------------------");
		System.out.println("--------Ajout d'une Intervention-----");
		System.out.println("-------------------------");
		System.out.println("Donner le nom du Technicien :");
		char nomt = Console.saisirString();
		System.out.println("Donner la prenom du techniciens:");
		char prenomt = Console.saisirString();
		System.out.println("Donner le mail du techinicien :");
		char mailt = Console.saisirString();
		unTechnicien = new Technicien(0, nomt,prenomt,mailt, 0);
		return unTechnicien;
	}
	public static void afficherIntervention(Technicien unTechnicien)
	{
		System.out.println("-------------------------");
		System.out.println("----------INFO De L'intervention-------");
		System.out.println("-------------------------");
		System.out.println("ID de l'intervention :" + unTechnicien.getCodet());
		System.out.println("Nom:" + unTechnicien.getNomt());
		System.out.println("Prenom :" + unTechnicien.getPrenomt());
		System.out.println("Mail :" + unTechnicien.getMailt());
		System.out.println("-------------------------");	
	}
	public static int saiirID()
	{
		System.out.println("-------------------------");
		System.out.println("---------SUPPRESSION D'UN Technicien-------");
		System.out.println("Donner l'id du client");
		return Console.saisirInt();
	}
	public static Technicien modifierIntervention(Technicien unTechnicien)
	{
		System.out.println("-------------------------");
		System.out.println("------EDITION D'UNE INTERVENTION-------");
		System.out.println("-------------------------");
		System.out.println("Ancien nom du technicien : " + unTechnicien.getNomt());
		System.out.println("Donner le nouveau nom du technicien");
		unTechnicien.setNomt(Console.saisirString());
		System.out.println("Ancien Prenom du technicien : " + unTechnicien.getPrenomt());
		System.out.println("Donner le nouveau prenom du client");
		unTechnicien.setNomt(Console.saisirString());
		System.out.println("Ancien mail du technicien : " + unTechnicien.getMailt());
		System.out.println("Donner le nouveau mail du technicien");
		unTechnicien.setMailt(Console.saisirString());
		return unTechnicien;	
	}
	public static void afficherTechnicien(Technicien unTechnicien) {
		// TODO Auto-generated method stub
		
	}
	public static void modifierTechnicien(Technicien unTechnicien) {
		// TODO Auto-generated method stub
		
	}
}
