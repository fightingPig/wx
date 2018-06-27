package com.zs.controller.wxApi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zs.entity.BaseFamily;
import com.zs.service.BaseFamilyService;

@RestController
@RequestMapping("/wxapi/family")
public class FamilyController {

	private Logger log = LoggerFactory.getLogger(FamilyController.class);

	@Autowired
	private BaseFamilyService baseFamilyService;

	@RequestMapping(value = "/getFamilyByOrderId", method = RequestMethod.POST)
	public String getFamilyByOrderId(@RequestParam String orderId) {
		log.debug("根据目获取科[{}]", orderId);
		List<BaseFamily> familyList = baseFamilyService.getFamilyByOrderId(orderId);
		return JSONObject.toJSONString(familyList);
	}

	@RequestMapping(value = "/getFamilyList", method = RequestMethod.POST)
	public String getFamilyList() {
		log.debug("获取科列表");
		List<BaseFamily> familyList = baseFamilyService.getFamilyList();
		return JSONObject.toJSONString(familyList);
	}
}
