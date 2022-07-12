package com.metoo.ipnm.core.service;

import com.metoo.ipnm.dto.GroupDto;
import com.metoo.ipnm.entity.Group;

import java.util.List;
import java.util.Map;

public interface IGroupService {

    // 查询所有组
    List<Group> query(Map map);

    Group queryObjById(Long id);

    Group getObjByLevel(String level);

    // 获取子集
    List<Group> queryChild(Long id);


    boolean save(GroupDto instance);

    boolean del(Long id);

}
