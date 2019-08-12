package lk.ijse.dinemore.server.business.custom;

import lk.ijse.dinemore.common.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerBO {

    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean deleteCustomer(String id) throws Exception;

    public ArrayList<CustomerDTO> getCustomerByTelephone(String tel) throws Exception;

}
