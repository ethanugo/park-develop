package com.upto.park.dao.mapper.enter;

import com.upto.park.dao.model.enter.EnterInfo;
import org.springframework.stereotype.Component;

@Component(value = "enterInfoMapper")
public interface EnterInfoMapper {
    Integer insertEnterInfo(EnterInfo enterInfo);
}
