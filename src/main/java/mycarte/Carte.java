package mycarte;

import java.util.ArrayList;
//import org.apache.log4j.Logger;

public class Carte {

	//final static Logger log = Logger.getLogger(Carte.class);
	final static int nombre_carte = 52;
	private int numero_carte;
	private String libelle_carte;

	Carte() {
		numero_carte = 0;
		libelle_carte = "";
	}

	Carte(int id, String desc) {
		this.numero_carte = id;
		this.libelle_carte = desc;
	}

	// Getters et Setters
	public int getNumero_carte() {

		return numero_carte;
	}

	public void setNumero_carte(int num) {

		this.numero_carte = num;
	}

	public String getLibelle_carte() {

		return libelle_carte;
	}

	public void setLibelle_carte(String lib) {

		this.libelle_carte = lib;
	}

	public String toString() {
		return this.getLibelle_carte();
	}

	// parcourir la liste de cartes
	public static void parcoursListe(ArrayList<Carte> mylist) {

		for (Carte s : mylist) {

			System.out.println(s);
			//log.info(s);

		}
	}

	public static void main(String[] args) {

		// Créer une liste de carte

		//final Logger log = Logger.getLogger(Carte.class);
		
		ArrayList<Carte> jeu_de_carte = new ArrayList<Carte>();
		//log.info("initialisation du tableau des couleurs");
		String couleurs[] = { "trèfle", "pique", "carreau", "coeur" };

		// Alimenter la liste des cartes, 2 boucles imbriqués, une pour la couleur
		// l'autre pour les 13 cartes par couleur
		//log.info("Remplissage de la liste des cartes");
		for (int x = 0; x < couleurs.length; x++) {
			for (int i = 1; i <= 13; i++) {

				Carte uneCarte = new Carte();
				uneCarte.setNumero_carte(i);
				// le libellé est composé de l'identifiant et de la couleur, ex: 2 de coeur, on
				// adapte le libellé pour l'as, le valet, le roi et la reine
				uneCarte.setLibelle_carte(i + " de " + couleurs[x]);
				if (i == 1) {
					uneCarte.setLibelle_carte("As de " + couleurs[x]);
				}
				if (i == 11) {
					uneCarte.setLibelle_carte("Valet de " + couleurs[x]);
				}
				if (i == 12) {
					uneCarte.setLibelle_carte("Reine de " + couleurs[x]);
				}
				if (i == 13) {
					uneCarte.setLibelle_carte("Roi de " + couleurs[x]);
				}
			 
				jeu_de_carte.add(uneCarte);

			}
		}
		//Appel de la méthode de parcours de la liste
		//log.info("Parcourir la liste");
		parcoursListe(jeu_de_carte);
	}
}
