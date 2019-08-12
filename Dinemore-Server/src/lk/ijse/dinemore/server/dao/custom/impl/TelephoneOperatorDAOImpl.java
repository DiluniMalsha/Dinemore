package lk.ijse.dinemore.server.dao.custom.impl;

import lk.ijse.dinemore.server.dao.CrudUtil;
import lk.ijse.dinemore.server.dao.custom.TelephoneOperatorDAO;
import lk.ijse.dinemore.server.entity.Chef;
import lk.ijse.dinemore.server.entity.TelephoneOperator;

import java.sql.ResultSet;
import java.util.ArrayList;

public class TelephoneOperatorDAOImpl implements TelephoneOperatorDAO {

    CrudUtil crudUtil=new CrudUtil();

    @Override
    public ArrayList<TelephoneOperator> getAll() throws Exception {

        ArrayList<TelephoneOperator> telephoneOperators=new ArrayList<>();
        String SQL="Select * from TelephoneOperator";
        ResultSet resultSet = crudUtil.executeQuery(SQL);
        while (resultSet.next()){
            TelephoneOperator telephoneOperator=new TelephoneOperator(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4));
            telephoneOperators.add(telephoneOperator);
        }
        return telephoneOperators;
    }
}
