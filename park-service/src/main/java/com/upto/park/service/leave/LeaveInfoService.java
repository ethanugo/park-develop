package com.upto.park.service.leave;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.leave.LeaveInfo;

public interface LeaveInfoService {
    Boolean insertLeaveInfo(LeaveInfo leaveInfo) throws ParkException;
}
