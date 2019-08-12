/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.server.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import lk.ijse.dinemore.common.observer.custom.TelephoneOperatorObserver;

/**
 *
 * @author HP
 */
public class TelephoneOperatorObservable {
    
    static ArrayList<TelephoneOperatorObserver> telephoneOperatorObservers=new ArrayList<>();
    
    public void addTelephoneOperatorObserver(TelephoneOperatorObserver observer) {        
        telephoneOperatorObservers.add(observer);
        System.out.println("ADDEDtp");
        System.out.println(telephoneOperatorObservers);
    }

    public void removeTelephoneOperatorObserver(TelephoneOperatorObserver observer) {
        telephoneOperatorObservers.remove(observer);
    }

    public void notifyChefObservers() throws RemoteException {
        for (TelephoneOperatorObserver telephoneOperatorObserver : telephoneOperatorObservers) {
            telephoneOperatorObserver.update();
        }
        System.out.println("TPUpdate");
    }
}
