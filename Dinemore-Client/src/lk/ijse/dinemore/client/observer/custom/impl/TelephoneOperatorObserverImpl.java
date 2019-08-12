/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.client.observer.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.dinemore.client.view.TelephoneOperatorView;
import lk.ijse.dinemore.common.observer.custom.TelephoneOperatorObserver;

/**
 *
 * @author HP
 */
public class TelephoneOperatorObserverImpl extends UnicastRemoteObject implements TelephoneOperatorObserver{
    
    TelephoneOperatorView telephoneOperatorView;

    public TelephoneOperatorObserverImpl(TelephoneOperatorView view) throws RemoteException {
        this.telephoneOperatorView=view;
    }

    @Override
    public void update() throws RemoteException {
        telephoneOperatorView.updateTables();
        System.out.println("TPUpdate2");
    }
}
