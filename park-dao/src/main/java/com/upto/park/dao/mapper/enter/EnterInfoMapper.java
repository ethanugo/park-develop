package com.upto.park.dao.mapper.enter;

import com.upto.park.dao.mapper.BaseMapper;
import com.upto.park.dao.model.enter.EnterInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component(value = "enterInfoMapper")
public interface EnterInfoMapper extends BaseMapper {
    Integer insertEnterInfo(EnterInfo enterInfo);

    Integer checkNumberExit(@Param("enterInfoNumber") String enterInfoNumber);
}
