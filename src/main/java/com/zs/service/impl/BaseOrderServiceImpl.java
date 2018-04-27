/*
 * @(#)BaseOrderServiceImpl.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.dao.BaseOrderMapper;
import com.zs.entity.BaseOrder;
import com.zs.service.BaseOrderService;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 下午2:45:23 $
 */
@Service
public class BaseOrderServiceImpl implements BaseOrderService {

    @Autowired
    private BaseOrderMapper baseOrderMapper;

    public List<BaseOrder> getOrderList() {
        return baseOrderMapper.selectAll();
    }

    public BaseOrder getOrderListByClassId(String classId) {
        return baseOrderMapper.selectOrderByClassId(classId);
    }

}
