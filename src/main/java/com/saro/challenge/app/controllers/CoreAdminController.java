package com.saro.challenge.app.controllers;

/**
 * Created by sbalakrishnan on 7/6/15.
 */

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.saro.challenge.DaoImpl.AssignmentDAOImpl;
import com.saro.challenge.util.PropertyUtil;
import com.saro.challenge.util.SpringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class CoreAdminController {

    protected Logger logger = LoggerFactory.getLogger(getClass().getName());
    @Autowired
    PropertyUtil propertyUtil;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView generic( HttpServletResponse response, HttpServletRequest request) throws Exception {

        logger.info("Processing the Model and View object to pass it to the viewer");
        ModelAndView model = new ModelAndView("index");

        model.addObject("objects", ((AssignmentDAOImpl) SpringUtil.getContext().getBean(AssignmentDAOImpl.class)).selectAllAssignment());

        return model;

    }


}
