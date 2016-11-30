/**
 * Innovez-One, Proprietary Software Cloud Communications
 *  Copyright (c) 2015, Innovez-One and individual contributors
 *  by the @authors tag.
 *
 *  This program is Proprietary Software: you can not redistribute it and/or modify
 *  without license from Innovez-One.
 *
 *  Website : http://www.innovez-one.com/
 *  Report bugs to <techsupport@innovez-one.com>.
 *  Copyright (C) 2015 PT. Innovez-One. All rights reserved.
 */
package com.lemigas.blu.spd.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author andry on 03/06/16.
 */
@Controller
public class MainController {

    private static final Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(ModelMap map){
        
        logger.info("index controller..............");
        return "index.html";
    }
    @RequestMapping(value="/login", method= RequestMethod.GET)
    public String login(ModelMap map){

        logger.info("login controller..............");
        return "login.html";
    }
    @RequestMapping(value="/biodata-pegawai", method= RequestMethod.GET)
    public String table(ModelMap map){

        logger.info("biodata-pegawai controller..............");
        return "biodata_pegawai.html";
    }

    @RequestMapping(value="/form-wizards", method= RequestMethod.GET)
    public String formWizards(ModelMap map){

        logger.info("form wizards controller..............");
        return "form_wizards.html";
    }
    
    

}
