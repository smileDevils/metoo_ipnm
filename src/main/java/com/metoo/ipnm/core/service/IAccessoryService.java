package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.Accessory;

import java.util.List;
import java.util.Map;

public interface IAccessoryService {

    Accessory getObjById(Long id);

    int save(Accessory instance);

    int update(Accessory instance);

    int delete(Long id);

    List<Accessory> query(Map params);
}
