package main;


import interfaces.Customer;
import model.Boek;
import vetteTekstRepo.BoekRepository;
import vettedatabasepackage.CustomerRepository;

public class MyAwesomeApp {

    public MyAwesomeApp(String titel, String auteur) {

        //CustomerRepository customerRepository = new CustomerRepository();
        //Customer customer = customerRepository.getCustomer();
        //System.out.println(customer.getName());
        Boek boek = new Boek(titel, auteur);

        BoekRepository boekRepository = new BoekRepository();

        boekRepository.VoekBoekToe(boek.getTitel(), boek.getAuteur());

    }
}
