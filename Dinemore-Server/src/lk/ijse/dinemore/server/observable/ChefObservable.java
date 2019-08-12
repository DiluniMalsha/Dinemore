/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.server.observable;

import java.rmi.RemoteException;
import java.util.ArrayList;
import lk.ijse.dinemore.common.observer.custom.ChefObserver;

/**
 *
 * @author HP
 */
public class ChefObservable {
    
    static ArrayList<ChefObserver> chefObservers=new ArrayList<>();
    
    public void addChefObserver(ChefObserver observer) {        
        chefObservers.add(observer);
        System.out.println("ADDEDchef");
        System.out.println(chefObservers);
    }

    public void removeChefObserver(ChefObserver observer) {
        chefObservers.remove(observer);
    }

    public void notifyChefObservers() throws RemoteException {           
        for (ChefObserver chefObserver : chefObservers) {
            chefObserver.update();
            System.out.println("lala");
        }
        System.out.println("chefUpdate");
    }
    
}
