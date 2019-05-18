package com.upto.park.service.enter;

import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.enter.EnterInfo;
import com.upto.park.service.BaseService;
import org.springframework.stereotype.Service;

public interface EnterInfoService extends BaseService {
    Boolean insertEnterInfo(EnterInfo enterInfo) throws ParkException;
}
