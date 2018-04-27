/*
 * @(#)BaseFamilyServiceImpl.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.dao.BaseFamilyMapper;
import com.zs.entity.BaseFamily;
import com.zs.service.BaseFamilyService;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 下午4:05:14 $
 */
@Service
public class BaseFamilyServiceImpl implements BaseFamilyService {

    @Autowired
    private BaseFamilyMapper baseFamilyMapper;

    public List<BaseFamily> getFamilyByOrderId(String orderId) {
        return baseFamilyMapper.selectFamilyByOrderId(orderId);
    }

    public List<BaseFamily> getFamilyList() {
        return baseFamilyMapper.selectAll();
    }

}
