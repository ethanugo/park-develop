package com.upto.park.dao.mapper.leave;

import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.dao.model.leave.LeaveInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "leaveInfoMapper")
public interface LeaveInfoMapper extends BaseMapper {
    Integer insertLeaveInfo(LeaveInfo leaveInfo);

    Integer checkNumberExit(@Param("leaveInfoNumber") String leaveInfoNumber);
}
