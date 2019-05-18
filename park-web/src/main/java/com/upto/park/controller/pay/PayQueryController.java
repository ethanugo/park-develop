package com.upto.park.controller.pay;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ResponseData;
import com.upto.park.common.tools.ResponseUtils;
import com.upto.park.dao.model.pay.PayQuery;
import com.upto.park.service.pay.PayQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/payQuery")
public class PayQueryController {
    private static final Logger logger = LoggerFactory.getLogger(PayQueryController.class);

    @Autowired
    private PayQueryService payQueryService;

    @RequestMapping(value = "/insertPayQuery", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ResponseData<Boolean> insertPayQuery(@RequestBody PayQuery payQuery) {
        ResponseData<Boolean> responseData = null;
        try {
            Boolean result = payQueryService.insertPayQuery(payQuery);
            responseData = ResponseUtils.buildSuccessData(result);
        } catch (ParkException e) {
            logger.error("=====insert pay query====");
            responseData = ResponseUtils.buildErrorData(e.getErrorCode(), e.getMessage());
        }
        return responseData;
    }
}
