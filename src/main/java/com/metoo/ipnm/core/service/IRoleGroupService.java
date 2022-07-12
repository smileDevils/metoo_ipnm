package com.metoo.ipnm.core.service;

import com.metoo.ipnm.dto.RoleGroupDto;
import com.metoo.ipnm.entity.RoleGroup;
import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface IRoleGroupService {

    RoleGroup getObjById(Long id);

    boolean checkExist(String name);

    Page<RoleGroup> query(Map<String, Integer> params);

    RoleGroup change(Long id);

    boolean save(RoleGroupDto instance);

    Object update(RoleGroup instance);

    int delete(Long id);

    List<RoleGroup> roleUnitGroup(Map<String, Integer> params);

    List<RoleGroup> selectByPrimaryType(String type);

}
