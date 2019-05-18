package com.upto.park.service.enter;

import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.enter.EnterInfo;

public interface EnterInfoService {
    Boolean insertEnterInfo(EnterInfo enterInfo) throws ParkException;
}
