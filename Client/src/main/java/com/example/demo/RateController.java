package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class RateController {
    @Value("${rate}")
	String rate;
    @Value("${rate}")
	String lanecount;
    @Value("${rate}")
	String tollstart;

	 @RequestMapping(value = "/dcn", 
	            method = RequestMethod.GET 
	           )
	    @ResponseBody
	public ModelHoang getRate() {
	    ModelHoang hoang=new ModelHoang();
	    hoang.a=rate;
	    hoang.b=lanecount;
	    hoang.c=tollstart;
	    return hoang;
	}
}
