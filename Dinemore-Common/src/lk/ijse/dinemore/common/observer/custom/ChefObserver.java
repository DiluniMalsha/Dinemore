/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.common.observer.custom;

import java.rmi.RemoteException;
import lk.ijse.dinemore.common.observer.SuperObserver;

/**
 *
 * @author HP
 */
public interface ChefObserver extends SuperObserver{
    
    public void update() throws RemoteException;
    
}
