package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.License;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LicenseMapper {

    List<License> query();

    int update(License instance);
}
