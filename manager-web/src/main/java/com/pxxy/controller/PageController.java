package com.pxxy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能简述:
 *
 * @author 23801
 * @version 1.0.0
 * @create 2020/7/8
 * @Date 2020/7/8 12:31
 */
@Controller
public class PageController {

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
