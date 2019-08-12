package lk.ijse.dinemore.server.dao.custom;

import lk.ijse.dinemore.server.entity.Customer;

import java.util.ArrayList;

public interface CustomerDAO{

    public boolean saveCustomer(Customer customer) throws Exception;

    public boolean updateCustomer(Customer customer) throws Exception;

    public boolean deleteCustomer(String id) throws Exception;

    public ArrayList<Customer> getCustomerByTelephone(String tel) throws Exception;
}
