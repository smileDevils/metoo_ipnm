package com.metoo.ipnm.core.manager.view.tools;

import com.metoo.ipnm.core.service.IRoomProgramService;
import com.metoo.ipnm.entity.RoomProgram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class WebLiveRoomTools {

    @Autowired
    private IRoomProgramService roomProgramService;

    public boolean exists(Long id){
        Map params = new HashMap();
        params.put("roomId", id);
        params.put("status", 1);
        List<RoomProgram> roomPrograms = this.roomProgramService.findObjByCondition(params);
        if(roomPrograms.size()>0){
            return false;
        }
        return true;
    }
}
