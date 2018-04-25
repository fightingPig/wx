/*
 * @(#)Slf4jTest.java    Created on 2018年4月19日
 * Copyright (c) 2018 ZDSoft Networks, Inc. All rights reserved.
 * $Id$
 */
package controllerTest;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhaosheng
 * @version $Revision: 1.0 $, $Date: 2018年4月19日 下午4:49:28 $
 */
public class Slf4jTest {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void test() {
        logger.trace("=====trace=====");
        logger.debug("=====debug=====");
        logger.info("=====info=====");
        logger.warn("=====warn=====");
        logger.error("=====error=====");
    }
}
