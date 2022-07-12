package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.Policy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PolicyMapper {

    Policy getObjById(String id);
    List<Policy> getObjByParentId(String parentId);
    List<Policy> getObjOrderNo(String orderNo);
    List<Policy> getObjByMap(Policy instance);
    int save(Map policy);
    int delete(Policy policy);
    int update(List<Policy> policies);
}
