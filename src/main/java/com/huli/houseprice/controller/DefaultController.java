package com.huli.houseprice.controller;
/**
 * Created by kcn on 2017/3/21.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("UnusedDeclaration")
@Controller
@RequestMapping(value="/")
public class DefaultController {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultController.class);  //NOSONAR

}
