package com.metoo.ipnm.core.service;

import com.metoo.ipnm.dto.MonitorDto;
import com.metoo.ipnm.entity.Monitor;
import com.github.pagehelper.Page;

public interface IMonitorService {

    Monitor getObjById(Long id);

    Monitor getObjBySign(String sign);

    Page<Monitor> query(MonitorDto dto);

    boolean save(MonitorDto instance);

    boolean update(MonitorDto instance);

    int delete(Long id);
}
