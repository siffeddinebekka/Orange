package controleur;

import java.sql.Array;
import java.util.ArrayList;


import modele.Modele;
import vue.Console;
import vue.VueIntervention;

public class C_Intervention {
	public static void insertIntervention() {
		controleur.Intervention uneInterventions = VueIntervention.saisirIntervention();
	

	}
	public static void afficherLesInterventions() {
		ArrayList<Intervention> lesInterventions = Modele.selectAllInterventions();
		System.out.println("______________Liste les Interventions_____");
		for (Intervention uneIntervention : lesInterventions) {
			VueIntervention.afficherIntervention(uneIntervention);
		}
	}
	public static void deleteIntervention() {
		int codei = VueIntervention.saiirID();
		Modele.deleteIntervention(codei);
	}
	public static void modifierIntervntion() {
		int codei = VueIntervention.saiirID();
		Intervention  uneIntervention = Modele.selectWhereIntervention(codei);
		if(uneIntervention != null) {
			VueIntervention.modifierIntervention(uneIntervention);
			Modele.updateIntervention(uneIntervention);
		}
	}
	public static void count () {
		int nb;
		nb = Modele.countIntervention();
		System.out.println("Le nombre d'intervention est de : " + nb);
	}
	public static void menueIntervention() {
		int choix = 0;
		do {
			System.out.println("______Menu Intervention_____");
			System.out.println("_----------------------------");
			System.out.println("1 - Ajouter une Intervention ");
			System.out.println("2 - Lister les Intervention ");
			System.out.println("3 - Supprimer une Intervention ");
			System.out.println("4 - Editer une Intervention ");
			System.out.println("0 - Quitter le menu ");
			System.out.println(" Votre choix");
			choix = Console.saisirInt();
			switch(choix) {
			case 1 : insertIntervention(); break;
			case 2 : menueIntervention(); break;
			case 3 : deleteIntervention(); break;
			}
		}while (choix != 0);
	}
}