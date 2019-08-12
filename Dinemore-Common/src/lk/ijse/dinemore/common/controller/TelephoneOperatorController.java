/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.common.controller;

import java.rmi.Remote;
import java.util.ArrayList;
import lk.ijse.dinemore.common.dto.CustomerDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;
import lk.ijse.dinemore.common.dto.TelephoneOperatorDTO;
import lk.ijse.dinemore.common.observer.custom.TelephoneOperatorObserver;

/**
 *
 * @author HP
 */
public interface TelephoneOperatorController extends Remote{
        
    public void registerObserver(TelephoneOperatorObserver observer) throws Exception;
    
    public void unRegisterObserver(TelephoneOperatorObserver observer) throws Exception;
    
    public boolean save(OrderDTO orderDTO) throws Exception;

    public boolean update(OrderDTO orderDTO, CustomerDTO customerDTO) throws Exception;

    public boolean delete(String id) throws Exception;

    public boolean setStatusPending(String id) throws Exception;
    
    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception;
    
    public ArrayList<OrderDTO> getAllTakenOrders() throws Exception;

    public ArrayList<OrderDTO> getAllFinishedOrders() throws Exception;
    
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception;

    public boolean deleteCustomer(String id) throws Exception;

    public ArrayList<CustomerDTO> getCustomerByTelephone(String tel) throws Exception;

    public ArrayList<TelephoneOperatorDTO> getAllTelephoneOperators() throws Exception;
}
