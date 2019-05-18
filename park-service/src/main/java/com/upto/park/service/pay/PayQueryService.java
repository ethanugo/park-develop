package com.upto.park.service.pay;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.pay.PayQuery;
import com.upto.park.service.BaseService;

public interface PayQueryService extends BaseService {
    Boolean insertPayQuery(PayQuery payQuery) throws ParkException;
}
