/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.server.factory.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinemore.common.controller.ChefController;
import lk.ijse.dinemore.common.controller.TelephoneOperatorController;
import lk.ijse.dinemore.common.factory.ControllerFactory;
import lk.ijse.dinemore.server.controllerImpl.ChefControllerImpl;
import lk.ijse.dinemore.server.controllerImpl.TelephoneOperatorControllerImpl;

/**
 *
 * @author HP
 */
public class ControllerFactoryImpl extends UnicastRemoteObject implements ControllerFactory{

    public ControllerFactoryImpl() throws RemoteException {
    }        

    @Override
    public ChefControllerImpl getChefController() throws RemoteException{                      
            return new ChefControllerImpl();        
    }

    @Override
    public TelephoneOperatorControllerImpl getTelephoneOperatorController()throws RemoteException{
        return new TelephoneOperatorControllerImpl();
    }

    
    
}
