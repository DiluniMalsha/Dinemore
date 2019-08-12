package lk.ijse.dinemore.server.business.custom.impl;

import java.util.ArrayList;
import lk.ijse.dinemore.common.dto.TelephoneOperatorDTO;
import lk.ijse.dinemore.server.business.custom.TelephoneOperatorBO;
import lk.ijse.dinemore.server.dao.custom.TelephoneOperatorDAO;
import lk.ijse.dinemore.server.dao.custom.impl.TelephoneOperatorDAOImpl;
import lk.ijse.dinemore.server.entity.TelephoneOperator;

public class TelephoneOperatorBOImpl implements TelephoneOperatorBO{

    TelephoneOperatorDAO telephoneOperatorDAO=new TelephoneOperatorDAOImpl();
    
    @Override
    public ArrayList<TelephoneOperatorDTO> getAll() throws Exception {
        
        ArrayList<TelephoneOperatorDTO> telephoneOperatorDTOs=new ArrayList<>();
        ArrayList<TelephoneOperator> telephoneOperators = telephoneOperatorDAO.getAll();
        for (TelephoneOperator operator : telephoneOperators) {           
            TelephoneOperatorDTO telephoneOperatorDTO=new TelephoneOperatorDTO(operator.getTpID(), operator.getTpName(), operator.getTpTel(), operator.getTpOrderQty());
            telephoneOperatorDTOs.add(telephoneOperatorDTO);
        }
        return telephoneOperatorDTOs;
    }
}
