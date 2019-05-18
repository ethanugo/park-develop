package com.upto.park.service.baseimpl;

import com.upto.park.common.exception.ParkException;
import com.upto.park.common.tools.ErrorEnum;
import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;


public class BaseServiceImpl implements BaseService {
    private static final Logger logger = LoggerFactory.getLogger(BaseServiceImpl.class);

    private Boolean checkNumberExit(BaseMapper baseMapper, String number) throws ParkException {
        Boolean result = false;
        try {
            Integer i = baseMapper.checkNumberExit(number);
            if (0 >= i) {
                result = true;
            }
        } catch (Exception e) {
            logger.error("查询编号是否存在异常", e);
            throw new ParkException(ErrorEnum.SYSTEM_ERROR.getErrorCode(), e.getMessage());
        }
        return result;
    }

    @Override
    public String generateNumber(BaseMapper baseMapper, String mark) throws ParkException {
        String number = null;
        while (true) {
            Random random = new Random();
            StringBuilder builder = new StringBuilder(mark);
            String dateString = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            builder.append(dateString);
            for (int i = 0; i < 10; i++) {
                builder.append(String.valueOf(random.nextInt(10)));
            }
            number = builder.toString();
            if (this.checkNumberExit(baseMapper, number)) {
                break;
            }
        }
        return number;
    }
}
