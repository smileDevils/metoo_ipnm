package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.SysConfig;

public interface ISysConfigService {

    SysConfig findObjById(Long id);

    SysConfig findSysConfigList();

    int modify(SysConfig instance);

    boolean update(SysConfig instance);
}
