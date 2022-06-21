package vue;

import controleur.Client;

public class VueClient {
	
	public static Client saisirClient()
	{
		Client unClient = null;
		System.out.println("-------------------------");
		System.out.println("--------Ajout d'un client-----");
		System.out.println("-------------------------");
		System.out.println("Donner le nom du client :");
		char nomc = Console.saisirString();
		System.out.println("Donner le prenom du client:");
		char prenomc = Console.saisirString();
		System.out.println("Donner l'email du client :");
		char mailc = Console.saisirString();
		System.out.println("Donner le télephone du client :");
		int telc = Console.saisirInt();
		unClient = new Client(nomc,prenomc,mailc,telc);
		return unClient;
	}
	public static void afficherClient(Client unClient)
	{
		System.out.println("-------------------------");
		System.out.println("----------INFO DU CLIENT-------");
		System.out.println("-------------------------");
		System.out.println("ID du Client :" + unClient.getCodec());
		System.out.println("NOM :" + unClient.getNomc());
		System.out.println("Prenom :" + unClient.getPrenomc());
		System.out.println("Email :" +unClient.getMailc());
		System.out.println("Telephone :" +unClient.getTelc());
		System.out.println("-------------------------");	
	}
	public static int saiirID()
	{
		System.out.println("-------------------------");
		System.out.println("---------SUPPRESSION D'UN CLIENT-------");
		System.out.println("Donner l'id du client");
		return Console.saisirInt();
	}
	public static Client modifierClient(Client unClient)
	{
		System.out.println("-------------------------");
		System.out.println("------EDITION D'UN CLIENT-------");
		System.out.println("-------------------------");
		System.out.println("Ancien nom du client : " + unClient.getNomc());
		System.out.println("Donner le nouveau nom du client");
		unClient.setNomc(Console.saisirString());
		System.out.println("Ancien prenom du client : " + unClient.getPrenomc());
		System.out.println("Donner le nouveau prenom du client");
		unClient.setPrenomc(Console.saisirString());
		System.out.println("Ancien mail du client : " + unClient.getMailc());
		System.out.println("Donner le nouveau mail du client");
		unClient.setMailc(Console.saisirString());
		System.out.println("Ancien telephone du client : " + unClient.getTelc());
		System.out.println("Donner le nouveau telephone du client");
		unClient.setTelc(Console.saisirInt());
		return unClient;	
	}
}
