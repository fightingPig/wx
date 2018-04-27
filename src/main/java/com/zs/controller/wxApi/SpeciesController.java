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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.zs.entity.BaseFamily;
import com.zs.entity.BaseOrder;
import com.zs.entity.BaseSpecies;
import com.zs.service.BaseFamilyService;
import com.zs.service.BaseOrderService;
import com.zs.service.BaseSpeciesService;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月27日 上午9:54:56 $
 */
@Controller
@RequestMapping("/wxapi")
public class SpeciesController {

    private Logger log = LoggerFactory.getLogger(SpeciesController.class);

    @Autowired
    private BaseOrderService baseOrderService;
    @Autowired
    private BaseFamilyService baseFamilyService;
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
    @ResponseBody
    @RequestMapping(value = "/getOrderList", method = RequestMethod.POST)
    public String getOrderList() {
        log.debug("获取目列表");
        List<BaseOrder> orderList = baseOrderService.getOrderList();
        return JSONObject.toJSONString(orderList);
    }

    @ResponseBody
    @RequestMapping(value = "/getFamilyByOrderId", method = RequestMethod.POST)
    public String getFamilyByOrderId(@RequestParam String orderId) {
        log.debug("根据目获取科[{}]", orderId);
        List<BaseFamily> familyList = baseFamilyService.getFamilyByOrderId(orderId);
        return JSONObject.toJSONString(familyList);
    }

    @ResponseBody
    @RequestMapping(value = "/getFamilyList", method = RequestMethod.POST)
    public String getFamilyList() {
        log.debug("获取科列表");
        List<BaseFamily> familyList = baseFamilyService.getFamilyList();
        return JSONObject.toJSONString(familyList);
    }

    @ResponseBody
    @RequestMapping(value = "/getSpeciesByFamilyId", method = RequestMethod.POST)
    public String getSpeciesByFamilyId(String familyId) {
        log.debug("根据科获取种[{}]", familyId);
        List<BaseSpecies> speciesList = baseSpeciesService.getSpeciesByFamilyId(familyId);
        return JSONObject.toJSONString(speciesList);
    }

    @ResponseBody
    @RequestMapping(value = "/getSpeciesList", method = RequestMethod.POST)
    public String getSpeciesList() {
        log.debug("获取种列表");
        List<BaseSpecies> speciesList = baseSpeciesService.getSpeciesList();
        return JSONObject.toJSONString(speciesList);
    }
}
