package lk.ijse.dinemore.server.startup;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.dinemore.server.factory.impl.ControllerFactoryImpl;

public class StartServer {

    public static void main(String args[]) {

        try {
            System.setProperty("java.rmi.server.localhost", "192.168.0.100");           
            Registry registry = LocateRegistry.createRegistry(5050);
            System.out.println("Server has been started");
            registry.rebind("Server", new ControllerFactoryImpl());            
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

