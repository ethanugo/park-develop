package com.upto.park.controller.push;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ResponseData;
import com.upto.park.common.tools.ResponseUtils;
import com.upto.park.dao.model.push.BillPush;
import com.upto.park.service.push.BillPushService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/billPush")
public class BillPushController {
    private static final Logger logger = LoggerFactory.getLogger(BillPushController.class);

    @Autowired
    private BillPushService billPushService;

    @RequestMapping(value = "/insertBillPush", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> insertBillPush(@RequestBody BillPush billPush) {
        ResponseData responseData = null;
        try {
            Boolean result = billPushService.insertBillPush(billPush);
            responseData = ResponseUtils.buildSuccessData(result);
        } catch (ParkException e) {
            logger.error("=====insert bill push=====");
            responseData = ResponseUtils.buildErrorData(e.getErrorCode(), e.getMessage());
        }
        return responseData;
    }
}
