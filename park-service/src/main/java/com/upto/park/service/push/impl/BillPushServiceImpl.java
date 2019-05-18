package com.upto.park.service.push.impl;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ConstantUtil;
import com.upto.park.common.tools.ErrorEnum;
import com.upto.park.dao.mapper.push.BillPushMapper;
import com.upto.park.dao.model.push.BillPush;
import com.upto.park.service.baseimpl.BaseServiceImpl;
import com.upto.park.service.push.BillPushService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "billPushService")
public class BillPushServiceImpl extends BaseServiceImpl implements BillPushService {
    private static final Logger logger = LoggerFactory.getLogger(BillPushServiceImpl.class);

    @Autowired
    private BillPushMapper billPushMapper;

    @Override
    public Boolean insertBillPush(BillPush billPush) throws ParkException {
        Boolean result = false;
        billPush.setBillPushNumber(this.generateNumber(billPushMapper, ConstantUtil.CommonNoun.BILL_PUSH_NUMBER_PREFIX));
        try {
            Integer i = billPushMapper.insertBillPush(billPush);
            if (0 < i) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("插入账单推送异常", e);
            throw new ParkException(ErrorEnum.SERVICE_ERROR.getErrorCode(), e.getMessage());
        }
        return result;
    }
}
