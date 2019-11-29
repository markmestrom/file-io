package vettedatabasepackage.datamodels;

import interfaces.Customer;

public class KeyCustomerDataModel implements Customer {

    String name;

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    int age;

    @Override
    public String getName() {

        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
