package vue;
import  java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console {
	private static BufferedReader entree= new BufferedReader(new InputStreamReader(System.in));
	
	public static int saisirInt()
	{
		int nb =0;
		String chaine ="";
		boolean ok = false;
		do {
			try {
				chaine = entree.readLine();
				nb = Integer.parseInt(chaine);
				ok = true;
			}catch (NumberFormatException exp) {
				System.out.println("Le format du nombre est invalide");
			}catch (IOException exp) {
				System.out.println("Erreur de la lecture sur le Clavier");
			}
		}while (ok == false);
			return nb;
	}
	public static double saisirDouble()
	{
		double nb = 0;
		String chaine ="";
		boolean ok = false;
		do {
			try {
				chaine = entree.readLine();
				nb = Double.parseDouble(chaine);
				ok = true;
			}catch (NumberFormatException exp) {
				System.out.println("Le format du nombre est invalide ");
			}catch(IOException exp) {
				System.out.println("Erreur de la lecture sur le clavier");
			}
		}while (ok == false);
		return nb;
				
	}
	public static String saisirString()
	{
		String chaine ="";
		try {
			chaine = entree.readLine();
		}catch(IOException exp) {
			System.out.println("Erreur de la lecture sur le clavier");
		}
		return chaine.charAt(0);
	}
}