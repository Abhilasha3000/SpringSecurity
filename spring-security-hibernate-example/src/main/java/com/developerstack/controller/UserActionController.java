package com.developerstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserActionController {
	
	/*@Autowired
	private UserService userService;*/

    @RequestMapping(value = "/page1", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	
    	return new ModelAndView("page1");
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public ModelAndView dashboard2() {
    	
    	return new ModelAndView("page2");
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
    	
    	return new ModelAndView("home");
    }

}
