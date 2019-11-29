package vettedatabasepackage;

import interfaces.Customer;
import vettedatabasepackage.datamodels.KeyCustomerDataModel;

public class CustomerRepository {

    public Customer getCustomer() {
        var datamodel = new KeyCustomerDataModel();
        datamodel.setName("Yorick");

        return datamodel;
    }

}
