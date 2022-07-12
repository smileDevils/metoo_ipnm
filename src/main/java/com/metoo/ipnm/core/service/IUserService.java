package com.metoo.ipnm.core.service;

import com.metoo.ipnm.dto.UserDto;
import com.metoo.ipnm.entity.User;
import com.metoo.ipnm.vo.UserVo;
import com.github.pagehelper.Page;

import java.util.List;

public interface IUserService {

    /**
     * 根据Username 查询一个User 对象
     * @param username
     * @return
     */
    User findByUserName(String username);

    User findRolesByUserName(String username);

    UserVo findUserUpdate(Long id);

    User findObjById(Long id);

    Page<UserVo> getObjsByLevel(UserDto dto);

    List<String> getObjByLevel(String level);

    Page<UserVo> query(UserDto dto);

    boolean save(UserDto dto);

    boolean update(User user);

    boolean delete(User id);

    boolean deleteByLevel(String level);

    boolean allocation(List<User> list);

    List<User> findObjByIds(Long[] ids) ;

    
}
