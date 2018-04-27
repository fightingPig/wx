/*
 * @(#)BaseSpeciesServiceImpl.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zs.dao.BaseSpeciesMapper;
import com.zs.entity.BaseSpecies;
import com.zs.service.BaseSpeciesService;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 下午4:05:03 $
 */
@Service
public class BaseSpeciesServiceImpl implements BaseSpeciesService {

    @Autowired
    private BaseSpeciesMapper baseSpeciesMapper;

    public List<BaseSpecies> getSpeciesByFamilyId(String familyId) {
        return baseSpeciesMapper.selectByFamilyId(familyId);
    }

    public List<BaseSpecies> getSpeciesList() {
        return baseSpeciesMapper.selectAll();
    }

}
