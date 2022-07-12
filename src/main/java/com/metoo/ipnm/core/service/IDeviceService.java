package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.Device;

import java.util.List;

public interface IDeviceService {

    /**
     * 查询所有设备类型
     * @return
     */
    List<Device> query();
}
