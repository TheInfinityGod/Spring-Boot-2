package com.application.springboot2.TestControllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class myManagementhandler {

    final static Logger logger = LoggerFactory.getLogger(myManagementhandler.class);

    public static RetrieveFormsResponse myMethod(RetrieveFormsRequest retrieveFormsRequest, String ind) {
        if (retrieveFormsRequest != null) {
            logger.info("flow is here");
            retrieveFormsRequest.setName("Water");
            retrieveFormsRequest.setNumber(23);
        }
        return new RetrieveFormsResponse();
        // TODO: Implement your method logic here
    }
}