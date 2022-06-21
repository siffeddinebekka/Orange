package vue;

import controleur.Intervention;

public class VueIntervention {
	
	public static Intervention saisirIntervention()
	{
		Intervention uneIntervention = null;
		System.out.println("-------------------------");
		System.out.println("--------Ajout d'une Intervention-----");
		System.out.println("-------------------------");
		System.out.println("Donner l'adresse de l'intervention :");
		String adressei = Console.saisirString();
		System.out.println("Donner la date de l'intervention:");
		 String date = Console.saisirString();
		System.out.println("Donner l'objet de l'intervention :");
		String objeti = Console.saisirString();
		uneIntervention = new Intervention(adressei,date,objeti);
		return uneIntervention;
	}
	public static void afficherIntervention(Intervention uneIntervention)
	{
		System.out.println("-------------------------");
		System.out.println("----------INFO De L'intervention-------");
		System.out.println("-------------------------");
		System.out.println("ID de l'intervention :" + uneIntervention.getCodei());
		System.out.println("Adresse :" + uneIntervention.getAdressei());
		System.out.println("date :" + uneIntervention.getDate());
		System.out.println("Objet :" +uneIntervention.getObjet());
		System.out.println("-------------------------");	
	}
	public static int saiirID()
	{
		System.out.println("-------------------------");
		System.out.println("---------SUPPRESSION D'UNE INTERVENTION-------");
		System.out.println("Donner l'id du client");
		return Console.saisirInt();
	}
	public static Intervention modifierIntervention(Intervention uneIntervention)
	{
		System.out.println("-------------------------");
		System.out.println("------EDITION D'UNE INTERVENTION-------");
		System.out.println("-------------------------");
		System.out.println("Ancien adresse de l'intervention : " + uneIntervention.getAdressei());
		System.out.println("Donner la nouvelle adresse de l'intervention");
		uneIntervention.setAdressei(Console.saisirString());
		System.out.println("Ancien Date de l'intervention : " + uneIntervention.getDate());
		System.out.println("Donner le nouveau prenom du client");
		uneIntervention.setDate(Console.saisirString());
		System.out.println("Ancien Objet de l'intervention : " + uneIntervention.getObjet());
		System.out.println("Donner le nouveau mail du client");
		uneIntervention.setObjet(Console.saisirString());
		return uneIntervention;	
	}
}
