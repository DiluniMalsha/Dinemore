/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.server.controllerImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import lk.ijse.dinemore.common.controller.ChefController;
import lk.ijse.dinemore.common.dto.ChefDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;
import lk.ijse.dinemore.common.observer.custom.ChefObserver;
import lk.ijse.dinemore.server.business.custom.ChefBO;
import lk.ijse.dinemore.server.business.custom.OrderBO;
import lk.ijse.dinemore.server.business.custom.impl.ChefBOImpl;
import lk.ijse.dinemore.server.business.custom.impl.OrderBOImpl;
import lk.ijse.dinemore.server.observable.ChefObservable;
import lk.ijse.dinemore.server.observable.TelephoneOperatorObservable;

/**
 *
 * @author HP
 */
public class ChefControllerImpl extends UnicastRemoteObject implements ChefController {

    ChefBO chefBO;
    OrderBO orderBO;
    ChefObservable chefObservable = new ChefObservable();
    TelephoneOperatorObservable telephoneOperatorObservable;

    public ChefControllerImpl() throws RemoteException {
        chefBO = new ChefBOImpl();
        orderBO = new OrderBOImpl();
        telephoneOperatorObservable = new TelephoneOperatorObservable();
    }

    @Override
    public boolean setStatusTaken(String id, String chefID, String time) throws Exception {
        boolean setStatusTaken = orderBO.setStatusTaken(id, chefID, time);
        chefObservable.notifyChefObservers();
        telephoneOperatorObservable.notifyChefObservers();
        return setStatusTaken;
    }

    @Override
    public boolean setStatusFinished(String id, String time) throws Exception {
        boolean setStatusFinished = orderBO.setStatusFinished(id, time);
        chefObservable.notifyChefObservers();
        telephoneOperatorObservable.notifyChefObservers();
        return setStatusFinished;
    }

    @Override
    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception {
        return orderBO.getAllPendingOrders();
    }

    @Override
    public ArrayList<ChefDTO> getAllChefs() throws Exception {
        return chefBO.getAll();
    }

    @Override
    public void registerObserver(ChefObserver observer) throws Exception {
        chefObservable.addChefObserver(observer);
    }

    @Override
    public void unRegisterObserver(ChefObserver observer) throws Exception {
        chefObservable.removeChefObserver(observer);
    }

}
