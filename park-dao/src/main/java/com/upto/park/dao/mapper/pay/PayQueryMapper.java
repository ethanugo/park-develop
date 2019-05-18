package com.upto.park.dao.mapper.pay;

import com.upto.park.dao.model.pay.PayQuery;
import org.springframework.stereotype.Component;

@Component(value = "payQueryMapper")
public interface PayQueryMapper {
    Integer insertPayQuery(PayQuery payQuery);
}
