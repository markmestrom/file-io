package vetteTekstRepo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BoekRepository {
    public void VoekBoekToe(String titel, String auteur)
    {
        String pad = System.getProperty("user.dir");
        String bestand = "Boeken.txt";

        String boekenbestand = pad + bestand;

        File file = new File(boekenbestand);
        FileWriter fr = null;

        try {
            fr = new FileWriter(file, true);
            fr.write(titel + " " + auteur + "\n");
            fr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
