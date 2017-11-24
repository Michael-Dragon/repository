package com.miutrip.controller.api;

import com.miutrip.domain.PaymentRecord;
import com.miutrip.domain.UserInfo;
import com.miutrip.utils.MappingUtil;
import com.miutrip.utils.MybaitsDbUtil;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/pay",method = RequestMethod.GET)
public class ApiPayController {

    @RequestMapping(value = "/test")
    public UserInfo test() {
        UserInfo info = new UserInfo();
        info.setUserName("Michael");
        return info;
    }


    @RequestMapping(value = "/orders_query")
    public List<PaymentRecord> ordersQuery() {
        SqlSession session = MybaitsDbUtil.getSession();
        List<PaymentRecord> recordList = session.selectList(MappingUtil.appendMapping("getPaymentRecord"));
        return recordList;
    }


    @RequestMapping(value = "/single_query/{payOrderNo}")
    public PaymentRecord singleQuery(@PathVariable("payOrderNo") String orderNo) {
        SqlSession session = MybaitsDbUtil.getSession();
        PaymentRecord recordList = session.selectOne(MappingUtil.appendMapping("getPaymentSingleRecord"), orderNo);
        return recordList;
    }

    @RequestMapping(value = "/single_postquery", method = RequestMethod.POST)
    public PaymentRecord singlePostQuery(String payOrderNo) {
        System.out.println(payOrderNo);
        SqlSession session = MybaitsDbUtil.getSession();
        PaymentRecord recordList = session.selectOne(MappingUtil.appendMapping("getPaymentSingleRecord"), payOrderNo);
        System.out.println(recordList);
        return recordList;
    }


}
