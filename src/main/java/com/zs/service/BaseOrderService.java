/*
 * @(#)BaseOrderService.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.service;

import java.util.List;

import com.zs.entity.BaseOrder;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 下午2:32:54 $
 */

public interface BaseOrderService {

    List<BaseOrder> getOrderList();

    BaseOrder getOrderListByClassId(String classId);
}
