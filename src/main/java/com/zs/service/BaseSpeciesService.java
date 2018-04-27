/*
 * @(#)BaseSpeciesService.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.service;

import java.util.List;

import com.zs.entity.BaseSpecies;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 下午3:56:38 $
 */
public interface BaseSpeciesService {

    List<BaseSpecies> getSpeciesByFamilyId(String familyId);

    List<BaseSpecies> getSpeciesList();
}
