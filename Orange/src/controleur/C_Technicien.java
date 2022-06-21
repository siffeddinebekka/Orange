package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Console;
import vue.VueTechnicien;

public class C_Technicien {
	public static void insertTechnicien() {
		Technicien unTechnicien = VueTechnicien.saisirTechnicien();
		Modele.insertTechnicien(unTechnicien);
	}
	public static void afficherLesTechniciens() {
		ArrayList<Technicien> lesTechniciens = Modele.selectAllTechnicien();
		System.out.println("______________Liste des Techniciens_____");
		for (Technicien unTechnicien : lesTechniciens) {
			VueTechnicien.afficherTechnicien(unTechnicien);
		}
	}
	public static void deleteTechnicien() {
		int codet = VueTechnicien.saiirID();
		Modele.deleteTechnicien(codet);
	}
	public static void modifierTechnicien() {
		int codet = VueTechnicien.saiirID();
		Technicien  unTechnicien = Modele.selectWhereTechnicien(codet);
		if(unTechnicien != null) {
			VueTechnicien.modifierTechnicien(unTechnicien);
			Modele.updateTechnicien(unTechnicien);
		}
	}
	public static void count () {
		int nb;
		nb = Modele.countTechnicien();
		System.out.println("Le nombre de technicien est de : " + nb);
	}
	public static void menueTechnicien() {
		int choix = 0;
		do {
			System.out.println("______Menu Technicien_____");
			System.out.println("_----------------------------");
			System.out.println("1 - Ajouter un Technicien ");
			System.out.println("2 - Lister les Technicien ");
			System.out.println("3 - Supprimer un Technicien ");
			System.out.println("4 - Editer un Technicien ");
			System.out.println("0 - Quitter le menu ");
			System.out.println(" Votre choix");
			choix = Console.saisirInt();
			switch(choix) {
			case 1 : insertTechnicien(); break;
			case 2 : menueTechnicien(); break;
			case 3 : deleteTechnicien(); break;
			}
		}while (choix != 0);
	}
}