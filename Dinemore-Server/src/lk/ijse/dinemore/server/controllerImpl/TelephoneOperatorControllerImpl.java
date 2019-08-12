/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.server.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import lk.ijse.dinemore.common.controller.TelephoneOperatorController;
import lk.ijse.dinemore.common.dto.CustomerDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;
import lk.ijse.dinemore.common.dto.TelephoneOperatorDTO;
import lk.ijse.dinemore.common.observer.custom.TelephoneOperatorObserver;
import lk.ijse.dinemore.server.business.custom.CustomerBO;
import lk.ijse.dinemore.server.business.custom.OrderBO;
import lk.ijse.dinemore.server.business.custom.TelephoneOperatorBO;
import lk.ijse.dinemore.server.business.custom.impl.CustomerBOImpl;
import lk.ijse.dinemore.server.business.custom.impl.OrderBOImpl;
import lk.ijse.dinemore.server.business.custom.impl.TelephoneOperatorBOImpl;
import lk.ijse.dinemore.server.observable.ChefObservable;
import lk.ijse.dinemore.server.observable.TelephoneOperatorObservable;

/**
 *
 * @author HP
 */
public class TelephoneOperatorControllerImpl extends UnicastRemoteObject implements TelephoneOperatorController{

    OrderBO orderBO=new OrderBOImpl();
    CustomerBO customerBO=new CustomerBOImpl();
    TelephoneOperatorBO telephoneOperatorBO=new TelephoneOperatorBOImpl();
    TelephoneOperatorObservable telephoneOperatorObservable=new TelephoneOperatorObservable();
    ChefObservable chefObservable=new ChefObservable();
    
    public TelephoneOperatorControllerImpl() throws RemoteException {
    }

    @Override
    public boolean save(OrderDTO orderDTO) throws Exception {
        boolean save = orderBO.save(orderDTO);
        telephoneOperatorObservable.notifyChefObservers();
        chefObservable.notifyChefObservers();
        return save;
    }

    @Override
    public boolean update(OrderDTO orderDTO, CustomerDTO customerDTO) throws Exception {
        boolean update = orderBO.update(orderDTO, customerDTO);
        telephoneOperatorObservable.notifyChefObservers();
        chefObservable.notifyChefObservers();
        return update;
    }

    @Override
    public boolean delete(String id) throws Exception {
        boolean delete = orderBO.delete(id);
        telephoneOperatorObservable.notifyChefObservers();
        chefObservable.notifyChefObservers();
        return delete;
    }

    @Override
    public boolean setStatusPending(String id) throws Exception {
        boolean setStatusPending = orderBO.setStatusPending(id);
        telephoneOperatorObservable.notifyChefObservers();
        chefObservable.notifyChefObservers();
        return setStatusPending;
    }

    @Override
    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception {       
        return orderBO.getAllPendingOrders();
    }

    @Override
    public ArrayList<OrderDTO> getAllTakenOrders() throws Exception {
        return orderBO.getAllTakenOrders();
    }

    @Override
    public ArrayList<OrderDTO> getAllFinishedOrders() throws Exception {
        return orderBO.getAllFinishedOrders();
    }

    @Override
    public boolean saveCustomer(CustomerDTO customerDTO) throws Exception {
        return customerBO.saveCustomer(customerDTO);
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        return customerBO.updateCustomer(customerDTO);
    }

    @Override
    public boolean deleteCustomer(String id) throws Exception {
        return customerBO.deleteCustomer(id);
    }

    @Override
    public ArrayList<CustomerDTO> getCustomerByTelephone(String tel) throws Exception {
        return customerBO.getCustomerByTelephone(tel);
    }

    @Override
    public ArrayList<TelephoneOperatorDTO> getAllTelephoneOperators() throws Exception {
        return telephoneOperatorBO.getAll();
    }

    @Override
    public void registerObserver(TelephoneOperatorObserver observer) throws Exception {
        telephoneOperatorObservable.addTelephoneOperatorObserver(observer);
    }

    @Override
    public void unRegisterObserver(TelephoneOperatorObserver observer) throws Exception {
        telephoneOperatorObservable.removeTelephoneOperatorObserver(observer);
    }

}
