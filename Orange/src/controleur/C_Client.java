package controleur;

import java.util.ArrayList;

import AirFrance.src.controleur.Vol;
import modele.Modele;
import vue.Console;
import vue.VueClient;

public class C_Client {
	public static void insertClient() {
		Client unClient = VueClient.saisirClient();
		Modele.insertClient(unClient);
	}
	public static void afficherLesClients() {
		ArrayList<Client> lesClients = Modele.selectAllClients();
		System.out.println("______________Liste des Techniciens_____");
		Client[] lesClients;
		for (Client unClient : lesClients) {
			VueClient.afficherClient(unClient);
		}
	}
	public static void deleteClient() {
		int codec = VueClient.saiirID();
		Modele.deleteTechnicien(codec);
	}
	public static void modifierClient() {
		int codec = VueClient.saiirID();
		Client  unClient = Modele.selectWhereClient(codec);
		if(unClient != null) {
			VueClient.modifierClient(unClient);
			Modele.updateClient(unClient);
		}
	}
	public static void count () {
		int nb;
		nb = Modele.countClient();
		System.out.println("Le nombre de Client est de : " + nb);
	}
	public static void menueClient() {
		int choix = 0;
		do {
			System.out.println("______Menu Client_____");
			System.out.println("_----------------------------");
			System.out.println("1 - Ajouter un Client ");
			System.out.println("2 - Lister les Client ");
			System.out.println("3 - Supprimer un Client ");
			System.out.println("4 - Editer un Client ");
			System.out.println("0 - Quitter le menu ");
			System.out.println(" Votre choix");
			choix = Console.saisirInt();
			switch(choix) {
			case 1 : insertClient(); break;
			case 2 : menueClient(); break;
			case 3 : deleteClient(); break;
			}
		}while (choix != 0);
	}
}
