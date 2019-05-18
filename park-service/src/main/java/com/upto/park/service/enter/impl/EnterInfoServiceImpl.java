package com.upto.park.service.enter.impl;


import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ErrorEnum;
import com.upto.park.dao.mapper.enter.EnterInfoMapper;
import com.upto.park.dao.model.enter.EnterInfo;
import com.upto.park.service.enter.EnterInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "enterInfoService")
public class EnterInfoServiceImpl implements EnterInfoService {

    private static final Logger logger = LoggerFactory.getLogger(EnterInfoServiceImpl.class);

    @Autowired
    private EnterInfoMapper enterInfoMapper;

    @Override
    public Boolean insertEnterInfo(EnterInfo enterInfo) throws ParkException {
        Boolean result = false;
        try {
            Integer i = enterInfoMapper.insertEnterInfo(enterInfo);
            if (0 < i) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("插入车辆进场信息异常", e);
            throw new ParkException(ErrorEnum.SYSTEM_ERROR.getErrorCode(), e.getMessage());
        }
        return result;
    }
}
