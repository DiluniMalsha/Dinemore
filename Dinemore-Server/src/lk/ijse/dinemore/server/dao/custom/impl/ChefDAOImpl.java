package lk.ijse.dinemore.server.dao.custom.impl;

import lk.ijse.dinemore.server.dao.CrudUtil;
import lk.ijse.dinemore.server.dao.custom.ChefDAO;
import lk.ijse.dinemore.server.entity.Chef;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ChefDAOImpl implements ChefDAO {

    CrudUtil crudUtil=new CrudUtil();

    @Override
    public ArrayList<Chef> getAll() throws Exception {
        ArrayList<Chef> chefs=new ArrayList<>();
        String SQL="Select * from Chef";
        ResultSet resultSet = crudUtil.executeQuery(SQL);
        while (resultSet.next()){
            Chef chef=new Chef(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),resultSet.getInt(4));
            chefs.add(chef);
        }
        return chefs;
    }

}
