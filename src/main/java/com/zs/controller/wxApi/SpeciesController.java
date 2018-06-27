/*
 * @(#)SpeciesController.java    Created on 2018年4月27日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.controller.wxApi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zs.entity.BaseSpecies;
import com.zs.service.BaseSpeciesService;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 上午9:54:56 $
 */
@RestController
@RequestMapping("/wxapi/species")
public class SpeciesController {

	private Logger log = LoggerFactory.getLogger(SpeciesController.class);

	@Autowired
	private BaseSpeciesService baseSpeciesService;

	// spring2.0
	// @RequestMapping(value = "/getFamily", method = RequestMethod.GET)
	// public String getFamily(Map<String, Object> model) {
	// log.debug("1");
	// model.put("name", "javacoder.cn");
	// model.put("list", new ArrayList<String>());
	// return "jsonView";
	// }

	@RequestMapping(value = "/getSpeciesByFamilyId", method = RequestMethod.POST)
	public String getSpeciesByFamilyId(String familyId) {
		log.debug("根据科获取种[{}]", familyId);
		List<BaseSpecies> speciesList = baseSpeciesService.getSpeciesByFamilyId(familyId);
		return JSONObject.toJSONString(speciesList);
	}

	@RequestMapping(value = "/getSpeciesList", method = RequestMethod.POST)
	public String getSpeciesList() {
		log.debug("获取种列表");
		List<BaseSpecies> speciesList = baseSpeciesService.getSpeciesList();
		return JSONObject.toJSONString(speciesList);
	}
}
