package com.upto.park.controller.leave;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ResponseData;
import com.upto.park.common.tools.ResponseUtils;
import com.upto.park.dao.model.leave.LeaveInfo;
import com.upto.park.service.leave.LeaveInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/leaveInfo")
public class LeaveInfoController {

    private static final Logger logger = LoggerFactory.getLogger(LeaveInfoController.class);

    @Autowired
    private LeaveInfoService leaveInfoService;

    @RequestMapping(value = "/insertLeaveInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> insertLeaveInfo(@RequestBody LeaveInfo leaveInfo) {
        ResponseData<Boolean> responseData = null;
        try {
            Boolean result = leaveInfoService.insertLeaveInfo(leaveInfo);
            responseData = ResponseUtils.buildSuccessData(result);
        } catch (ParkException e) {
            logger.error("=====insert leave info error=====");
            responseData = ResponseUtils.buildErrorData(e.getErrorCode(), e.getMessage());
        }
        return responseData;
    }
}
