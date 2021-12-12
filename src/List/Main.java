/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author  Asma
 */
public class Main {
    public static void main(String[] args) {


        Etudiant e1 = new Etudiant(2,"benbrahim","asma");
        Etudiant e2 = new Etudiant(55,"msallem","ines");
        Etudiant e3 = new Etudiant(10,"sylla","eva");
        Etudiant e4 = new Etudiant(75,"ghebrich","aziz");

        EspritArrayList list = new EspritArrayList();
        EspritVector vector = new EspritVector();

        vector.ajouterEtudiant(e2);
        vector.ajouterEtudiant(e1);
        vector.ajouterEtudiant(e3);
        vector.ajouterEtudiant(e4);

        list.ajouterEtudiant(e2);
        list.ajouterEtudiant(e1);
        list.ajouterEtudiant(e3);
        list.ajouterEtudiant(e4);

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        
        
        
        System.out.println("Avant tri par id");
        list.displayEtudiants();
        System.out.println("************************");

        list.trierEtudiantsParId();

        System.out.println("APRES tri par id");
        list.displayEtudiants();
        System.out.println("*****************************");

        list.trierEtudiantsParNom();

        System.out.println("APRES tri par nom");
        list.displayEtudiants();
        System.out.println("*********************");

    }
}
