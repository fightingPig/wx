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
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/index2")
    public ModelAndView index2() {
        ModelAndView model = new ModelAndView();
        log.debug("index2");
        model.setViewName("index");
        return model;
    }

    interface hello {
        void sayAnything();

        default void sayHello() {
            System.out.println("default say hello");
        };
    }

    public static void say(hello h) {
    }

    public static void main(String[] args) {
        hello s = new hello() {

            @Override
            public void sayAnything() {
                System.out.println("anything");

            }

        };
        s.sayAnything();
        s.sayHello();

        say(new hello() {

            @Override
            public void sayAnything() {
                System.out.println("aaaaa");
            }
        });

        say(() -> System.out.println("???"));

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("runnable");

            }
        }).start();

        new Thread(() -> System.out.println("aha ")).start();

    }
}
