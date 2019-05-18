package com.upto.park.dao.mapper.leave;

import com.upto.park.dao.model.leave.LeaveInfo;
import org.springframework.stereotype.Component;

@Component(value = "leaveInfoMapper")
public interface LeaveInfoMapper {
    Integer insertLeaveInfo(LeaveInfo leaveInfo);
}
