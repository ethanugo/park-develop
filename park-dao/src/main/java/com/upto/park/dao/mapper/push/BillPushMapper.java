package com.upto.park.dao.mapper.push;

import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.dao.model.push.BillPush;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "billPushMapper")
public interface BillPushMapper extends BaseMapper {
    Integer insertBillPush(BillPush billPush);

    Integer checkNumberExit(@Param("billPushNumber") String billPushNumber);
}
