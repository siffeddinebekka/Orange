package controleur;

import vue.Console;





public class Orange {

public static void menueGeneral() {
	int choix = 0;
	do {
		System.out.println("______Menue Orange______");
		System.out.println(" 1 Gerer les Technicien");
		System.out.println(" 2 Gerer les Clients");
		System.out.println(" 3 Gerer les Intervention");
		System.out.println(" 0 Quitter le Menue");
		System.out.println(" Votre Choix");
		choix = Console.saisirInt();
		switch(choix) {
		case 1 : C_Technicien.menueTechnicien(); break;
		case 2 : C_Client.menueClient(); break;
		case 3 : C_Intervention.menueIntervention(); break;
		case 4 :
				C_Technicien.count();
				C_Client.count();
				C_Intervention.count();
				break;
		case 6 : tableauBord(); break;
		}
		
	} while (choix !=0);
}


private static void tableauBord() {
	// TODO Auto-generated method stub
	
}


public static void main(String[]args) {
	menueGeneral();
	}
}