package model;

import interfaces.Tekstable;

public class Boek implements Tekstable {
    private String titel;
    private String auteur;

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Boek(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
    }

    @Override
    public void VoegBoekToe(String titel, String auteur) {

    }
}
