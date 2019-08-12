package lk.ijse.dinemore.server.business.custom;

import lk.ijse.dinemore.common.dto.ChefDTO;

import java.util.ArrayList;

public interface ChefBO {

    public ArrayList<ChefDTO> getAll() throws Exception;

}
