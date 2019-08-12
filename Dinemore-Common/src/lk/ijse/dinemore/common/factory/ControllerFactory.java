/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.common.factory;

import java.rmi.Remote;
import java.rmi.RemoteException;
import lk.ijse.dinemore.common.controller.ChefController;
import lk.ijse.dinemore.common.controller.TelephoneOperatorController;

/**
 *
 * @author HP
 */
public interface ControllerFactory extends Remote{
    
    public ChefController getChefController() throws RemoteException;
    public TelephoneOperatorController getTelephoneOperatorController() throws RemoteException;    
    
}
