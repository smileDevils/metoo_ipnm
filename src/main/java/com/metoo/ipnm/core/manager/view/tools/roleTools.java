package com.metoo.ipnm.core.manager.view.tools;

import com.metoo.ipnm.core.service.IRoleService;
import com.metoo.ipnm.entity.Role;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class roleTools {


    private IRoleService roleService;

    public List<Role> getAllRole(String type){
        List<Role> roles = this.roleService.findRoleByType(type);

        return roles;
    }
}
