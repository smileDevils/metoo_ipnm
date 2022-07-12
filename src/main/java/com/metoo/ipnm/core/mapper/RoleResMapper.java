package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.RoleRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleResMapper {

    int insert(List<RoleRes> roleResList);

    int delete(Long id);
}
