package lk.ijse.dinemore.server.dao.custom;

import lk.ijse.dinemore.server.entity.TelephoneOperator;

import java.util.ArrayList;

public interface TelephoneOperatorDAO {

    public ArrayList<TelephoneOperator> getAll() throws Exception;
}
