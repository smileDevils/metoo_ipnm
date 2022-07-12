package com.metoo.ipnm.core.service.impl;

import com.metoo.ipnm.core.mapper.NodeMapper;
import com.metoo.ipnm.core.service.INodeService;
import com.metoo.ipnm.dto.TopoNodeDto;
import com.metoo.ipnm.entity.TopoNode;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class NodeServiceImpl implements INodeService {

    @Autowired
    private NodeMapper nodeMapper;

    @Override
    public TopoNode getObjById(Long id) {
        return this.nodeMapper.getObjById(id);
    }

    @Override
    public TopoNode getObjByHostAddress(String hostAddress) {
        return this.nodeMapper.getObjByHostAddress(hostAddress);
    }

    @Override
    public Page<TopoNode> query(TopoNodeDto nodeDto) {
        Page<TopoNode> page = PageHelper.startPage(nodeDto.getStart(), nodeDto.getLimit());
        this.nodeMapper.query(nodeDto);
        return page;
    }

    @Override
    public int save(TopoNode instance) {
        return this.nodeMapper.save(instance);
    }

    @Override
    public int update(TopoNode instance) {
        return this.nodeMapper.update(instance);
    }

    @Override
    public int delete(Long id) {

        return this.nodeMapper.delete(id);
    }
}
