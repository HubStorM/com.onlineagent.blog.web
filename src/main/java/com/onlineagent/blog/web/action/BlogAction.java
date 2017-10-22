package com.onlineagent.blog.web.action;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lijie
 * @date 2017/10/21 17:25
 * @description
 */

@RestController
@RequestMapping("/blog")
public class BlogAction {

    @RequestMapping(value = "/insert", method = RequestMethod.GET)
    public String insert(){
        return "insert";
    }
}
