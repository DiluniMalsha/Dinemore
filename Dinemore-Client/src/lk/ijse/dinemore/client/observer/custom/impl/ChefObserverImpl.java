/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.client.observer.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.dinemore.client.view.ChefView;
import lk.ijse.dinemore.common.observer.custom.ChefObserver;

/**
 *
 * @author HP
 */
public class ChefObserverImpl extends UnicastRemoteObject implements ChefObserver{ 
    
    ChefView chefView;

    public ChefObserverImpl(ChefView chefView) throws RemoteException {
        this.chefView=chefView;
    }

    @Override
    public void update() throws RemoteException {
        System.out.println("chefUpdate2");
        chefView.updateTable();
        
    }       
    
}
