package com.upto.park.dao.mapper.push;

import com.upto.park.dao.model.push.BillPush;
import org.springframework.stereotype.Component;

@Component(value = "billPushMapper")
public interface BillPushMapper {
    Integer insertBillPush(BillPush billPush);
}
