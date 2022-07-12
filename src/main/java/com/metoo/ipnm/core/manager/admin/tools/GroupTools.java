package com.metoo.ipnm.core.manager.admin.tools;

import com.metoo.ipnm.core.service.IGroupService;
import com.metoo.ipnm.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GroupTools {

    @Autowired
    private IGroupService groupService;

    public List<Group> genericGroup(Group group){
        List<Group> groups = this.groupService.queryChild(group.getId());
        if(groups.size() > 0){
            for(Group child : groups){
                List<Group> branchList = genericGroup(child);
                if(branchList.size() > 0){
                    child.setBranchList(branchList);
                }
            }
            group.setBranchList(groups);
        }
        return groups;
    }
}
