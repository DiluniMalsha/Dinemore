package lk.ijse.dinemore.server.dao.custom.impl;

import lk.ijse.dinemore.server.dao.CrudUtil;
import lk.ijse.dinemore.server.dao.custom.CustomerDAO;
import lk.ijse.dinemore.server.entity.Customer;
import lk.ijse.dinemore.server.entity.TelephoneOperator;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    CrudUtil crudUtil=new CrudUtil();

    @Override
    public boolean saveCustomer(Customer customer) throws Exception {
        String SQL="Insert into Customer values(?,?,?)";
        String customerID=customer.getCustomerID();
        String customerName=customer.getCustomerName();
        String customerTel=customer.getCustomerTel();

        int i = crudUtil.executeUpdate(SQL, customerID, customerName, customerTel);

        return i > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        String SQL="Update Customer set Name=? , Tel=? where CID=?";
        String customerID=customer.getCustomerID();
        String customerName=customer.getCustomerName();
        String customerTel=customer.getCustomerTel();

        int i = crudUtil.executeUpdate(SQL, customerName, customerTel, customerID);

        return i > 0;
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        String SQL="Delete from Customer where CID=?";

        int i = crudUtil.executeUpdate(SQL, id);

        return i > 0;
    }

    @Override
    public ArrayList<Customer> getCustomerByTelephone(String tel) throws Exception {

        ArrayList<Customer> customers=new ArrayList<>();
        String SQL="Select * from Customer where Tel=?";
        ResultSet resultSet = crudUtil.executeQuery(SQL,tel);
        while (resultSet.next()){
            Customer customer=new Customer(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
            customers.add(customer);
        }
        return customers;
    }

}
