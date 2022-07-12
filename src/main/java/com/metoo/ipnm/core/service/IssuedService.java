package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.Policy;
import com.metoo.ipnm.entity.Task;

import java.util.List;

public interface IssuedService {

    void pushtaskstatuslist();

    List<Task> query();

    void queryTask(String invisibleName, String type, List<Policy> policysNew, String command);

    void createOrder(String userName, String type, List<Policy> policysNew);
}
