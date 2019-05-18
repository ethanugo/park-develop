package com.upto.park.controller.enter;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ResponseData;
import com.upto.park.common.tools.ResponseUtils;
import com.upto.park.dao.model.enter.EnterInfo;
import com.upto.park.service.enter.EnterInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/enterInfo")
public class EnterInfoController {
    private static final Logger logger = LoggerFactory.getLogger(EnterInfoController.class);

    @Autowired
    private EnterInfoService enterInfoService;

    @RequestMapping(value = "/insertEnterInfo", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> insertEnterInfo(@RequestBody EnterInfo enterInfo) {
        ResponseData<Boolean> responseData = null;
        try {
            Boolean result = enterInfoService.insertEnterInfo(enterInfo);
            responseData = ResponseUtils.buildSuccessData(result);
        } catch (ParkException e) {
            logger.error("=====insert enter info error=====");
            responseData = ResponseUtils.buildErrorData(e.getErrorCode(), e.getMessage());
        }
        return responseData;
    }
}
