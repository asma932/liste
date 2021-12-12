/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package List;

/**
 *
 * @author Asma
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EspritArrayList implements University{

    private List<Etudiant> list;

    public EspritArrayList()
    {
        this.list = new ArrayList();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        if(!rechercherEtudiant(e))
            this.list.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return (this.list.contains(e));
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for(Etudiant etudiant :this.list)
        {
            if(etudiant.getNom().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        if(rechercherEtudiant(e))
            this.list.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for(Etudiant etudiant :this.list)
            System.out.println(etudiant);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(this.list);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(this.list,new EtudiantComparatorParNom());
    }
}
