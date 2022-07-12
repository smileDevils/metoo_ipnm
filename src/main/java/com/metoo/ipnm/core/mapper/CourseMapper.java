package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.Course;
import com.metoo.ipnm.vo.CourseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CourseMapper {

    Course selectByPrimaryKey(Long id);

    int insert(Course instance);

    int update(Course instance);

    int deleteByPrimaryKey(Long id);

    List<Course> query();

    List<Course> queryAll();

    List<Course> findBycondition(Map params);

    List<CourseVo> webCourseList();


}
