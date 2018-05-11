/*
 * @(#)CookieFilter.java    Created on 2018年5月11日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package com.zs.controller.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年5月11日 下午3:49:41 $
 */
public class CookieFilter implements Filter {

    public void destroy() {
        // TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        ((HttpServletResponse) response).addHeader("Set-Cookie", "HttpOnly");
        ((HttpServletResponse) response).addHeader("x-frame-options", "SAMEORIGIN");
        chain.doFilter(request, response);

    }

    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub

    }

}
