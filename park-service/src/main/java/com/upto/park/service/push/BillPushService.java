package com.upto.park.service.push;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.dao.model.push.BillPush;
import com.upto.park.service.BaseService;

public interface BillPushService extends BaseService {
    Boolean insertBillPush(BillPush billPush) throws ParkException;
}
