package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.vo.MenuVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IndexMapper {

    /**
     * 根据用户id查询角色及角色组
     * @param id
     * @return
     */
    List<MenuVo> findMenu(Long id);
}
