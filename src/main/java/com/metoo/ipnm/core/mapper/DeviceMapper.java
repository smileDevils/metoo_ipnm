package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.Device;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeviceMapper {

    List<Device> query();
}
