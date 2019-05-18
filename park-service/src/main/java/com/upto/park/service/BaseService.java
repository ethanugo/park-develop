package com.upto.park.service;

import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.mapper.BaseMapper;


public interface BaseService {
    String generateNumber(BaseMapper baseMapper, String mark) throws ParkException;
}
