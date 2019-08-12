package lk.ijse.dinemore.server.business.custom.impl;

import lk.ijse.dinemore.common.dto.ChefDTO;
import lk.ijse.dinemore.server.business.custom.ChefBO;
import lk.ijse.dinemore.server.dao.custom.ChefDAO;
import lk.ijse.dinemore.server.dao.custom.impl.ChefDAOImpl;
import lk.ijse.dinemore.server.entity.Chef;

import java.util.ArrayList;

public class ChefBOImpl implements ChefBO {

    ChefDAO chefDAO=new ChefDAOImpl();

    @Override
    public ArrayList<ChefDTO> getAll() throws Exception {

        ArrayList<ChefDTO> chefDTOS=new ArrayList<>();
        ArrayList<Chef> chefs = chefDAO.getAll();
        for (Chef chef : chefs) {
            ChefDTO chefDTO=new ChefDTO(chef.getChefID(),chef.getChefName(),chef.getChefTel(),chef.getChefMadeQty());
            chefDTOS.add(chefDTO);
        }
        return chefDTOS;
    }

}

