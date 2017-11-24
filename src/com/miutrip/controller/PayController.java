package com.miutrip.controller;

import com.miutrip.utils.LogHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/pay", method = RequestMethod.GET)
public class PayController {
    @RequestMapping(value = "/page_pay.html")
    public ModelAndView pagePay() {
        ModelAndView mv = new ModelAndView("page_pay");
        return mv;
    }

    @RequestMapping(value = "/direct_pay.html")
    public ModelAndView directPay(int payType) {
        ModelAndView mv = new ModelAndView("page_pay");
        
        return mv;
    }
}
