package com.metoo.ipnm.core.service.impl;

import com.metoo.ipnm.core.mapper.RoleResMapper;
import com.metoo.ipnm.core.service.IRoleResService;
import com.metoo.ipnm.entity.RoleRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class RoleResServiceImpl implements IRoleResService {

    @Autowired
    private RoleResMapper roleResMapper;

    @Override
    public boolean batchAddRoleRes(List<RoleRes> roleRes) {
        try {
            this.roleResMapper.insert(roleRes);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteRoleResByRoleId(Long role_id) {
        try {
            this.roleResMapper.delete(role_id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
