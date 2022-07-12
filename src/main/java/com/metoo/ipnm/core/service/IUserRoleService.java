package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.UserRole;

import java.util.List;

public interface IUserRoleService {

    int batchAddUserRole(List<UserRole> userRoles);

    boolean deleteUserByRoleId(Long id);
}
