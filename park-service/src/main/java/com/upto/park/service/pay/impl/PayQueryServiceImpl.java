package com.upto.park.service.pay.impl;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ErrorEnum;
import com.upto.park.dao.mapper.pay.PayQueryMapper;
import com.upto.park.dao.model.pay.PayQuery;
import com.upto.park.service.pay.PayQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "payQueryService")
public class PayQueryServiceImpl implements PayQueryService {
    private static final Logger logger = LoggerFactory.getLogger(PayQueryServiceImpl.class);

    @Autowired
    private PayQueryMapper payQueryMapper;

    @Override
    public Boolean insertPayQuery(PayQuery payQuery) throws ParkException {
        Boolean result = false;
        try {
            Integer i = payQueryMapper.insertPayQuery(payQuery);
            if (0 < i) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("插入无感支付查询异常", e);
            throw new ParkException(ErrorEnum.SYSTEM_ERROR.getErrorCode(), e.getMessage());
        }
        return result;
    }
}
