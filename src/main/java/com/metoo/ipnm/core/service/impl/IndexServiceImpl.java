package com.metoo.ipnm.core.service.impl;

import com.metoo.ipnm.core.mapper.IndexMapper;
import com.metoo.ipnm.core.service.IIndexService;
import com.metoo.ipnm.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class IndexServiceImpl implements IIndexService {

    @Autowired
    private IndexMapper indexMapper;

    @Override
    public List<MenuVo> findMenu(Long id) {
        return indexMapper.findMenu(id);
    }
}
