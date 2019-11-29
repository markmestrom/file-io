package ovp2;

import main.MyAwesomeApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner mijnObject = new Scanner(System.in);

        System.out.println("Boektitel");
        String boektitel = mijnObject.nextLine();

        System.out.println("auteur");
        String boekauteur = mijnObject.nextLine();
        MyAwesomeApp myAwesomeApp = new MyAwesomeApp(boektitel, boekauteur);



    }
}
