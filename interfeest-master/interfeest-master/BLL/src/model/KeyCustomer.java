package model;

import interfaces.Customer;
import interfaces.Walkable;

public class KeyCustomer implements Customer, Walkable {

    private String name;

    @Override
    public String getName() {

        return name;
    }

    @Override
    public String getShoes() {

        return "Pantoffels";
    }

    @Override
    public void setName(String name) {

        this.name = name;
    }
}
