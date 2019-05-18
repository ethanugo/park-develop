package com.upto.park.dao.mapper.pay;

import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.dao.model.pay.PayQuery;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "payQueryMapper")
public interface PayQueryMapper extends BaseMapper {
    Integer insertPayQuery(PayQuery payQuery);

    Integer checkNumberExit(@Param("payQueryNumber") String payQueryNumber);
}
