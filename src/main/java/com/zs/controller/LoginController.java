/*
 * @(#)Login.java    Created on 2018年4月19日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月19日 下午2:36:54 $
 */
@Controller
@RequestMapping("login")
public class LoginController {
    private Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        log.debug("zzz");
        return "index";
    }
}
