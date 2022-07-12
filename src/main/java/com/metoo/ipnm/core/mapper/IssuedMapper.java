package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IssuedMapper {

    Task getObjByType(Integer type);

    List<Task> query();

    int save(Task task);
    int update(Task task);
}
