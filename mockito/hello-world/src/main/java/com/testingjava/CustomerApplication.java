package com.testingjava;

import java.util.ArrayList;
import java.util.List;

public class CustomerApplication
{
    CustomerService customerService;


    public void setCustomerService(CustomerService customerService){
        this.customerService = customerService;
    }
    List customerList = new ArrayList();

    public int save(Customer customer) {
        customerList.add(customer);
        System.out.println("Saved customer");
        return customerList.size();
    }
}