package lk.ijse.dinemore.server.business.custom;

import lk.ijse.dinemore.common.dto.TelephoneOperatorDTO;

import java.util.ArrayList;

public interface TelephoneOperatorBO {

    public ArrayList<TelephoneOperatorDTO> getAll() throws Exception;
}
