package com.zs.controller.wxApi;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.zs.entity.BaseOrder;
import com.zs.service.BaseOrderService;

@RestController
@RequestMapping("/wxapi/order")
public class OrderController {
	private Logger log = LoggerFactory.getLogger(OrderController.class);

	@Autowired
	private BaseOrderService baseOrderService;

	@RequestMapping(value = "/getOrderList", method = RequestMethod.POST)
	public String getOrderList() {
		log.debug("获取目列表");
		List<BaseOrder> orderList = baseOrderService.getOrderList();
		return JSONObject.toJSONString(orderList);
	}

}
