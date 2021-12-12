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

import java.util.Collections;
import java.util.Vector;

public class EspritVector implements University{

    private Vector<Etudiant> vector;

    public EspritVector()
    {
        this.vector = new Vector<>();
    }
    @Override
    public void ajouterEtudiant(Etudiant e) {
        if(!rechercherEtudiant(e))
            this.vector.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {

        return (this.vector.contains(e));
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(Etudiant etudiant :this.vector)
        {
            if(etudiant.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        if(rechercherEtudiant(e))
            this.vector.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for(Etudiant etudiant :this.vector)
            System.out.println(etudiant);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(this.vector);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(this.vector,new EtudiantComparatorParNom());
    }

}
