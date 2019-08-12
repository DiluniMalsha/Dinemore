package lk.ijse.dinemore.server.business.custom;

import lk.ijse.dinemore.common.dto.CustomerDTO;
import lk.ijse.dinemore.common.dto.OrderDTO;

import java.util.ArrayList;

public interface OrderBO {

    public boolean save(OrderDTO orderDTO) throws Exception;

    public boolean update(OrderDTO orderDTO, CustomerDTO customerDTO) throws Exception;

    public boolean delete(String id) throws Exception;

    public boolean setStatusPending(String id) throws Exception;

    public boolean setStatusTaken(String id, String chefID, String time) throws Exception;

    public boolean setStatusFinished(String id, String time) throws Exception;

    public ArrayList<OrderDTO> getAllPendingOrders() throws Exception;

    public ArrayList<OrderDTO> getAllTakenOrders() throws Exception;

    public ArrayList<OrderDTO> getAllFinishedOrders() throws Exception;

}
