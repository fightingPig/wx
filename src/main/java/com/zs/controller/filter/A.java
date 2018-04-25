package com.zs.controller.filter;
/*
 * @(#)A.java    Created on 2018年4月18日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月18日 上午9:41:32 $
 */
public class A implements Filter {

    private Logger log = LoggerFactory.getLogger(A.class);

    public void init(FilterConfig filterConfig) throws ServletException {
        log.debug("过滤器A创建");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
            ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println(req.getRequestURI());
        chain.doFilter(request, response);

    }

    public void destroy() {
        log.debug("过滤器A销毁");
    }

}
