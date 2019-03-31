package com.spring.controller;


import org.apache.log4j.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController
{	
	
	private static final Logger logger = Logger.getLogger(UserController.class);
	
   @GetMapping("/")
   public String showall(Model model)
   {
	   System.out.println("USA");
	   System.out.println(logger.getName());
	   System.out.println(logger);
	  
	   
	      logger.trace("Trace Message!!!!!!!!!!!!!!");
	      logger.debug("Debug Message!!!!!!!!!!!!!!");
	      logger.info("Info Message!!!!!!!!!!!!!!");
	      logger.warn("Warn Message!!!!!!!!!!!!!!");
	      logger.error("Error Message!!!!!!!!!!!!!!");
	      logger.fatal("Fatal Message!!!!!!!!!!!!!!");
	      
	      return "showpage";
   }
   
   
}
