package com.upto.park.service.leave.impl;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ConstantUtil;
import com.upto.park.common.tools.ErrorEnum;
import com.upto.park.dao.mapper.leave.LeaveInfoMapper;
import com.upto.park.dao.model.leave.LeaveInfo;
import com.upto.park.service.baseimpl.BaseServiceImpl;
import com.upto.park.service.leave.LeaveInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service(value = "leaveInfoService")
public class LeaveInfoServiceImpl extends BaseServiceImpl implements LeaveInfoService {
    private static final Logger logger = LoggerFactory.getLogger(LeaveInfoServiceImpl.class);

    @Autowired
    private LeaveInfoMapper leaveInfoMapper;

    @Override
    public Boolean insertLeaveInfo(LeaveInfo leaveInfo) throws ParkException {
        Boolean result = false;
        leaveInfo.setLeaveInfoNumber(this.generateNumber(leaveInfoMapper, ConstantUtil.CommonNoun.LEAVE_INFO_NUMBER_PREFIX));
        try {
            Integer i = leaveInfoMapper.insertLeaveInfo(leaveInfo);
            if (0 < i) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("插入车辆离场信息异常", e);
            throw new ParkException(ErrorEnum.SYSTEM_ERROR.getErrorCode(), e.getMessage());
        }
        return result;
    }
}
