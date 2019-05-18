package com.upto.park.service.pay;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.pay.PayQuery;

public interface PayQueryService {
    Boolean insertPayQuery(PayQuery payQuery) throws ParkException;
}
