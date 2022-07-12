package com.metoo.ipnm.core.mapper;

import com.metoo.ipnm.entity.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    Order getObjByOrderId(Long orderId);

    Order getObjByOrderNo(String orderNo);

    int save(Order instance);
}
