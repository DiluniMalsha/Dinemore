package lk.ijse.dinemore.server.business.custom.impl;

import lk.ijse.dinemore.common.dto.CustomerDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;
import lk.ijse.dinemore.server.business.custom.OrderBO;
import lk.ijse.dinemore.server.dao.custom.CustomerDAO;
import lk.ijse.dinemore.server.dao.custom.OrderDAO;
import lk.ijse.dinemore.server.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.dinemore.server.dao.custom.impl.OrderDAOImpl;
import lk.ijse.dinemore.server.entity.Order;
import java.util.ArrayList;

public class OrderBOImpl implements OrderBO {

    OrderDAO orderDAO = new OrderDAOImpl();
    CustomerDAO customerDAO = new CustomerDAOImpl();

    @Override
    public boolean save(OrderDTO orderDTO) throws Exception {

        Order order = new Order(orderDTO.getOrderID(), orderDTO.getCustomerName(), orderDTO.getCustomerTel(), orderDTO.getDate(), orderDTO.getStatus(), orderDTO.getQty(), orderDTO.getAddedTime(), orderDTO.getTakenTime(), orderDTO.getFinishedTime(), orderDTO.getTpID(), orderDTO.getChefID());
        boolean saveOrder = orderDAO.saveOrder(order);
        return saveOrder;
    }

    @Override
    public boolean update(OrderDTO orderDTO, CustomerDTO customerDTO) throws Exception {
        Order order = new Order(orderDTO.getOrderID(), orderDTO.getCustomerName(), orderDTO.getCustomerTel(), orderDTO.getDate(), orderDTO.getStatus(), orderDTO.getQty(), orderDTO.getAddedTime(), orderDTO.getTakenTime(), orderDTO.getFinishedTime(), orderDTO.getTpID(), orderDTO.getChefID());
        boolean updateOrder = orderDAO.updateOrder(order);
        return updateOrder;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return orderDAO.deleteOrder(id);
    }

    @Override
    public boolean setStatusPending(String id) throws Exception {
        return orderDAO.setStatusPending(id);
    }

    @Override
    public boolean setStatusTaken(String id, String chefID, String time) throws Exception {
        return orderDAO.setStatusTaken(id, chefID, time);
    }

    @Override
    public boolean setStatusFinished(String id, String time) throws Exception {
        return orderDAO.setStatusFinished(id, time);
    }

    @Override
    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception {

        ArrayList<OrderDTO> orderDTOs = new ArrayList<>();
        ArrayList<Order> allPendingOrders = orderDAO.getAllPendingOrders();
        for (Order order : allPendingOrders) {
            OrderDTO orderDTO = new OrderDTO(order.getOrderID(), order.getCustomerName(), order.getCustomerTel(), order.getDate(), order.getStatus(), order.getQty(), order.getAddedTime(), order.getTakenTime(), order.getFinishedTime(), order.getTpID(), order.getChefID());
            orderDTOs.add(orderDTO);
        }
        return orderDTOs;
    }

    @Override
    public ArrayList<OrderDTO> getAllTakenOrders() throws Exception {
        ArrayList<OrderDTO> orderDTOs = new ArrayList<>();
        ArrayList<Order> allPendingOrders = orderDAO.getAllTakenOrders();
        for (Order order : allPendingOrders) {
            OrderDTO orderDTO = new OrderDTO(order.getOrderID(), order.getCustomerName(), order.getCustomerTel(), order.getDate(), order.getStatus(), order.getQty(), order.getAddedTime(), order.getTakenTime(), order.getFinishedTime(), order.getTpID(), order.getChefID());
            orderDTOs.add(orderDTO);
        }
        return orderDTOs;
    }

    @Override
    public ArrayList<OrderDTO> getAllFinishedOrders() throws Exception {
        ArrayList<OrderDTO> orderDTOs = new ArrayList<>();
        ArrayList<Order> allPendingOrders = orderDAO.getAllFinishedOrders();
        for (Order order : allPendingOrders) {
            OrderDTO orderDTO = new OrderDTO(order.getOrderID(), order.getCustomerName(), order.getCustomerTel(), order.getDate(), order.getStatus(), order.getQty(), order.getAddedTime(), order.getTakenTime(), order.getFinishedTime(), order.getTpID(), order.getChefID());
            orderDTOs.add(orderDTO);
        }
        return orderDTOs;
    }
}
