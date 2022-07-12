package com.metoo.ipnm.core.service.impl;

import com.metoo.ipnm.core.mapper.DeviceMapper;
import com.metoo.ipnm.core.service.IDeviceService;
import com.metoo.ipnm.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DeviceServiceImpl implements IDeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    @Override
    public List<Device> query() {
        return this.deviceMapper.query();
    }
}
