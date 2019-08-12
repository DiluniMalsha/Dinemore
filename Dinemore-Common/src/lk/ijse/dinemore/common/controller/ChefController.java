/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.common.controller;

import java.rmi.Remote;
import java.util.ArrayList;
import lk.ijse.dinemore.common.dto.ChefDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;
import lk.ijse.dinemore.common.observer.custom.ChefObserver;

/**
 *
 * @author HP
 */
public interface ChefController extends Remote {

    public void registerObserver(ChefObserver observer) throws Exception;

    public void unRegisterObserver(ChefObserver observer) throws Exception;

    public boolean setStatusTaken(String id, String chefID, String time) throws Exception;

    public boolean setStatusFinished(String id, String time) throws Exception;

    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception;

    public ArrayList<ChefDTO> getAllChefs() throws Exception;

}
