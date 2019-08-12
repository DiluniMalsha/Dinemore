package lk.ijse.dinemore.server.dao.custom;

import lk.ijse.dinemore.server.entity.Order;

import java.util.ArrayList;

public interface OrderDAO {

    public boolean saveOrder(Order order) throws Exception;

    public boolean updateOrder(Order order) throws Exception;

    public boolean setStatusPending(String id) throws Exception;

    public boolean setStatusTaken(String id, String chefID, String time) throws Exception;

    public boolean setStatusFinished(String id, String time) throws Exception;

    public boolean deleteOrder(String id) throws Exception;

    public ArrayList<Order> getAllPendingOrders() throws Exception;

    public ArrayList<Order> getAllTakenOrders() throws Exception;

    public ArrayList<Order> getAllFinishedOrders() throws Exception;
}
