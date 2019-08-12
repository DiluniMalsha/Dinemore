package lk.ijse.dinemore.server.dao.custom.impl;

import lk.ijse.dinemore.server.dao.CrudUtil;
import lk.ijse.dinemore.server.dao.custom.OrderDAO;
import lk.ijse.dinemore.server.entity.Order;

import java.sql.ResultSet;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {

    CrudUtil crudUtil = new CrudUtil();

    @Override
    public boolean saveOrder(Order order) throws Exception {
        String SQL = "Insert into Orders values(?,?,?,?,?,?,?,?,?,?,?)";
        String orderID = order.getOrderID();
        String customerName = order.getCustomerName();
        String customerTel = order.getCustomerTel();
        String date = order.getDate();
        String status = order.getStatus();
        int qty = order.getQty();
        String addedTime = order.getAddedTime();
        String takenTime = order.getTakenTime();
        String finishedTime = order.getFinishedTime();
        String tpID = order.getTpID();
        String chefID = order.getChefID();

        int i = crudUtil.executeUpdate(SQL, orderID, customerName, customerTel, date, status, qty, addedTime, takenTime, finishedTime, tpID, chefID);

        return i > 0;
    }

    @Override
    public boolean updateOrder(Order order) throws Exception {
        String SQL = "Update Orders set customerName =? , customerTell =? , Date=? , Status=? , Qty=? , AddedTime=? , TakenTime=? , FinishedTime=? , tpID=? , ChefID=? where OrderID=?";
        String orderID = order.getOrderID();
        String customerName = order.getCustomerName();
        String customerTel = order.getCustomerTel();
        String date = order.getDate();
        String status = order.getStatus();
        int qty = order.getQty();
        String addedTime = order.getAddedTime();
        String takenTime = order.getTakenTime();
        String finishedTime = order.getFinishedTime();
        String tpID = order.getTpID();
        String chefID = order.getChefID();

        int i = crudUtil.executeUpdate(SQL, customerName, customerTel, date, status, qty, addedTime, takenTime, finishedTime, tpID, chefID, orderID);

        return i > 0;
    }

    @Override
    public boolean setStatusPending(String id) throws Exception {
        String SQL = "Update Orders set Status='Pending' where OrderID=?";

        int i = crudUtil.executeUpdate(SQL, id);

        return i > 0;
    }

    @Override
    public boolean setStatusTaken(String id, String chefID, String time) throws Exception {
        String SQL = "Update Orders set status = 'Taken' , chefID = ?, takenTime = ? where OrderID = ?";

        int i = crudUtil.executeUpdate(SQL, chefID, time, id);

        return i > 0;

    }

    @Override
    public boolean setStatusFinished(String id, String time) throws Exception {
        String SQL = "Update Orders set Status = 'Finished' , finishedTime = ? where OrderID = ? ";

        int i = crudUtil.executeUpdate(SQL, time, id);

        return i > 0;
    }

    @Override
    public boolean deleteOrder(String id) throws Exception {
        String SQL = "Delete from Orders where OrderID = ? ";

        int i = crudUtil.executeUpdate(SQL, id);

        return i > 0;
    }

    @Override
    public ArrayList<Order> getAllPendingOrders() throws Exception {

        ArrayList<Order> orders = new ArrayList<>();
        String SQL = "Select * from Orders where status = 'Pending'";
        ResultSet resultSet = crudUtil.executeQuery(SQL);
        while (resultSet.next()) {
            Order order = new Order(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
            orders.add(order);
        }
        return orders;
    }

    @Override
    public ArrayList<Order> getAllTakenOrders() throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        String SQL = "Select * from Orders where Status = 'Taken'";
        ResultSet resultSet = crudUtil.executeQuery(SQL);
        while (resultSet.next()) {
            Order order = new Order(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
            orders.add(order);
        }
        return orders;
    }

    @Override
    public ArrayList<Order> getAllFinishedOrders() throws Exception {
        ArrayList<Order> orders = new ArrayList<>();
        String SQL = "Select * from Orders where Status = 'Finished'";
        ResultSet resultSet = crudUtil.executeQuery(SQL);
        while (resultSet.next()) {
            Order order = new Order(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getString(7), resultSet.getString(8), resultSet.getString(9), resultSet.getString(10), resultSet.getString(11));
            orders.add(order);
        }
        return orders;
    }
}
