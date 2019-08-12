/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dinemore.client.connector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import lk.ijse.dinemore.common.controller.ChefController;
import lk.ijse.dinemore.common.controller.TelephoneOperatorController;
import lk.ijse.dinemore.common.factory.ControllerFactory;

/**
 *
 * @author HP
 */
public class ServerConnector {
    
    private ControllerFactory controllerFactory;
    
    private static ServerConnector serverConnector;

    private ServerConnector() throws NotBoundException, MalformedURLException, RemoteException {    
                   
        controllerFactory= (ControllerFactory) Naming.lookup("rmi://localhost:5050/Server");
        
    }
    
    public static ServerConnector getInstance() throws NotBoundException, MalformedURLException, RemoteException{
    
        if(serverConnector==null){
            serverConnector=new ServerConnector();                        
        }
        return serverConnector;
    }
    
    public ControllerFactory getControllerFactory() {            
        return controllerFactory;
    }
    
}
