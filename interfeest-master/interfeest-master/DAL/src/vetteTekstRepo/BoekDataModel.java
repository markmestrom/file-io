package vetteTekstRepo;

public class BoekDataModel {
    private String titel;
    private String auteur;

    public BoekDataModel(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
    }

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
}
