package com.metoo.ipnm.core.service.impl;

import com.metoo.ipnm.core.mapper.SysConfigMapper;
import com.metoo.ipnm.core.service.ISysConfigService;
import com.metoo.ipnm.entity.SysConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysConfigServiceImpl implements ISysConfigService {

    @Autowired
    private SysConfigMapper sysConfigMapper;

    @Override
    public SysConfig findObjById(Long id) {
        return this.sysConfigMapper.findObjById();
    }

    @Override
    public SysConfig findSysConfigList() {
        return this.sysConfigMapper.select();
    }

    @Override
    public int modify(SysConfig instance) {
        instance.setDomain("httpclient://" + instance.getIp());
        return this.sysConfigMapper.update(instance);
    }

    @Override
    public boolean update(SysConfig instance) {
        try {
            this.sysConfigMapper.update(instance);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
