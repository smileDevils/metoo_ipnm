package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.ProgramPlayback;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProgramPlaybackMapper {

    /**
     * 保存一个ProgramPlayback对象
     * @param instance
     * @return
     */
    int insert(ProgramPlayback instance);


}
