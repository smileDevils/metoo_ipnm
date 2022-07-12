package com.metoo.ipnm.core.service;

import com.metoo.ipnm.entity.Order;

public interface IOrderService {

    Order getObjByOrderId(Long orderId);

    Order getObjByOrderNo(String orderNo);

    int save(Order instance);
}
