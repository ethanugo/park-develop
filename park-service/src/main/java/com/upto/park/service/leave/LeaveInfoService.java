package com.upto.park.service.leave;


import com.upto.park.common.exception.ParkException;
import com.upto.park.dao.model.leave.LeaveInfo;
import com.upto.park.service.BaseService;

public interface LeaveInfoService extends BaseService {
    Boolean insertLeaveInfo(LeaveInfo leaveInfo) throws ParkException;
}
