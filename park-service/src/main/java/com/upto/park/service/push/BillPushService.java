package com.upto.park.service.push;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.push.BillPush;

public interface BillPushService {
    Boolean insertBillPush(BillPush billPush) throws ParkException;
}
