package lk.ijse.dinemore.server.business.custom.impl;

import lk.ijse.dinemore.common.dto.ChefDTO;
import lk.ijse.dinemore.common.dto.CustomerDTO;
import lk.ijse.dinemore.server.business.custom.CustomerBO;
import lk.ijse.dinemore.server.dao.custom.CustomerDAO;
import lk.ijse.dinemore.server.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.dinemore.server.entity.Chef;
import lk.ijse.dinemore.server.entity.Customer;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {

    CustomerDAO customerDAO=new CustomerDAOImpl();

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {
        Customer customer=new Customer(customerDTO.getCustomerID(),customerDTO.getCustomerName(),customerDTO.getCustomerTel());
        boolean saveCustomer = customerDAO.saveCustomer(customer);
        return saveCustomer;
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        Customer customer=new Customer(customerDTO.getCustomerID(),customerDTO.getCustomerName(),customerDTO.getCustomerTel());
        boolean updateCustomer = customerDAO.updateCustomer(customer);
        return updateCustomer;
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        boolean deleteCustomer = customerDAO.deleteCustomer(id);
        return deleteCustomer;
    }

    @Override
    public ArrayList<CustomerDTO> getCustomerByTelephone(String tel) throws Exception {

        ArrayList<CustomerDTO> customerDTOS=new ArrayList<>();
        ArrayList<Customer> customerByTelephone = customerDAO.getCustomerByTelephone(tel);
        for (Customer customer : customerByTelephone) {
            CustomerDTO customerDTO=new CustomerDTO(customer.getCustomerID(),customer.getCustomerName(),customer.getCustomerTel());
            customerDTOS.add(customerDTO);
        }
        return customerDTOS;
    }
}
